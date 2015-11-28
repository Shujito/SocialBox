package org.shujito.socialbox;

import android.app.Application;
import android.util.Log;

/**
 * @author Alberto Ramos, 11/17/15.
 */
public class SocialBoxApplication extends Application {
	public static final String TAG = SocialBoxApplication.class.getSimpleName();

	@Override
	public void onCreate() {
		super.onCreate();
		Log.e(TAG, "onCreate");
	}
}
