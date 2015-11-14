create table users (
	_id integer primary key on conflict replace autoincrement,
	email text not null on conflict fail unique on conflict fail,
	username text not null on conflict fail unique on conflict fail,
	display_name text not null on conflict fail,
	check (length(username) >= 2 and length(username) <= 24)
);

@@

create table user_passwords (
	user_id integer not null on conflict fail,
	password_hash blob not null on conflict fail,
	password_salt blob not null on conflict fail,
	foreign key(user_id) references users(_id)
);

@@

create table sessions (
	user_id integer not null on conflict fail,
	token blob not null on conflict fail default (randomblob(32)),
	expires_at integer not null on conflict ignore default (cast(((julianday('now','+15 minutes') - julianday('1970-01-01')) * 86400000) as integer)),
	foreign key (user_id) references users (_id)
);
