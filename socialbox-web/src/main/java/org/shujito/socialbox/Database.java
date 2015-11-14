package org.shujito.socialbox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Alberto Ramos, 11/13/15.
 */
public class Database {
	public static final String TAG = Database.class.getSimpleName();
	private static final String DATABASE = "socialbox.db3";
	private static final String SQL = "socialbox.sql";
	private static final Connection sConnection;

	static {
		try {
			sConnection = DriverManager.getConnection("jdbc:sqlite:" + DATABASE + ":");
			if (!new File(DATABASE).exists()) {
				String sql = readSQL();
				String[] statements = parseSQL(sql);
				try (Statement statement = sConnection.createStatement()) {
					executeStatements(statement, statements);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(-1);
			throw new RuntimeException(ex);
		}
	}

	static String readSQL() throws Exception {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(SQL))) {
			StringBuilder builder = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
			}
			return builder.toString();
		}
	}

	static String[] parseSQL(String sql) {
		return sql.split("@@");
	}

	static void executeStatements(Statement statement, String[] statements) throws Exception {
		for (String sqlStatement : statements) {
			statement.execute(sqlStatement);
		}
	}
}
