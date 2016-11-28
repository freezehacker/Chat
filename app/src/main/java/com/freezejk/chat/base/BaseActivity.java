package com.freezejk.chat.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sjk on 16-11-28.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initData();
        initListeners();
    }

    @Override
    protected void onPause() {
        saveSession();  // like the database ops
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        unregisterToReleaseResource();
        super.onDestroy();
    }

    protected abstract void saveSession();

    protected abstract void initData();

    protected abstract void initListeners();

    protected abstract int getLayoutId();

    protected abstract void unregisterToReleaseResource();
}
