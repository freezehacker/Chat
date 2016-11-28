package com.freezejk.chat.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by sjk on 16-11-28.
 */
public class BaseApplication extends Application {

    public static Context ctx = null;

    @Override
    public void onCreate() {
        super.onCreate();
        ctx = this;
        initApp();
    }

    /* Access the global context at any time. */
    public static Context getContext() {
        return ctx;
    }

    /* Initialize the app, globally, like the initial ops of third-party libraries. */
    private void initApp() {

    }
}
