package com.ls.apkpackdemo;

import android.app.Application;
import android.content.Context;

/**
 * ==============================
 *
 * @author @Qiu
 * @version V1.0
 * @Description: MainApplication
 * @date 2016-8-1上午11:34:53
 * ==============================
 */
public class MainApplication extends Application {

	private static Context sCtx;
	private static String userId;//用户Id
	private static String userToken;//用户token
	private String dbName = "memory.db";

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
	}

	@Override
	public void onCreate() {
		super.onCreate();
		sCtx = getApplicationContext();
	}

	public static Context getContext() {
		return sCtx;
	}

	public static String getUserId() {
		return userId;
	}

	public static void setUserId(String userId) {
		MainApplication.userId = userId;
	}

	public static void setUserToken(String userToken) {
		MainApplication.userToken = userToken;
	}

	public static String getUserToken() {
		return userToken;
	}


}