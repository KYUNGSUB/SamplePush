package org.androidtown.push;

public class Constants {
	public static final String SERVICE_SERVER_URL = "http://talanton.kr:8080/myserver";
    public static final String ADD_FCM_TOKEN_URL = "/addFcmToken.app";
	public static final String SENDER_ID = "849800895685";
	public static final String SP_NAME = "pref";
	public static final String TAG = "SamplePush";

	public static String makeURL(String server, String detail) {
		return server + detail;
	}
}