package com.whombang.app.features.mycenter.activity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.whombang.app.R;
import com.whombang.app.common.base.BaseActivity;

/**
 * 我的评价
 */
@Route(path = "/my/evaluate")
public class MyEvaluateActivity extends BaseActivity {

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.wb_my_evaluate_layout;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        titleBar.setTitle("我的评价");
    }

    @Override
    public void doBusiness() {

    }
}
