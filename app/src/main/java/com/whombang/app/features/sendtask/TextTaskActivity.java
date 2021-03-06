package com.whombang.app.features.sendtask;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.whombang.app.R;
import com.whombang.app.common.base.BaseActivity;

/**
 * 发布文本任务
 */
@Route(path = "/task/text")
public class TextTaskActivity extends BaseActivity {
    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.wb_text_task_layout;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        ARouter.getInstance().build("/service/map").navigation();
        titleBar.setTitle("发布服务");
    }

    @Override
    public void doBusiness() {

    }
}
