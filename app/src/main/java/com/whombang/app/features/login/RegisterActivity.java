package com.whombang.app.features.login;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.whombang.app.R;
import com.whombang.app.common.base.BaseActivity;

/**
 * 用户注册
 */
@Route(path = "/user/register")
public class RegisterActivity extends BaseActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.wb_register_layout;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        titleBar.setTitle("注册");
    }

    @Override
    public void doBusiness() {

    }
}
