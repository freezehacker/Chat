package com.freezejk.chat.util;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by sjk on 16-11-28.
 */
public class Logger {

    public static final String TAG = "jk-hello";

    public static void log(String s) {
        if (TextUtils.isEmpty(s)) {
            Log.i(TAG, "[ Warning: Nothing for logger to print out. ]");
        } else {
            Log.i(TAG, s);
        }
    }
}
