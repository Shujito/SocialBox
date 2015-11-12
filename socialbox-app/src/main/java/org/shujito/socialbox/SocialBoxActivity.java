package org.shujito.socialbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author Alberto Ramos, 11/12/15.
 */
public class SocialBoxActivity extends AppCompatActivity {
	public static final String TAG = SocialBoxActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);
	}
}
