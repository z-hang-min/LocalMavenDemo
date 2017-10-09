package com.hisnow.localmavendemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.hisnow.androidlib.OkHttpUtils;
import com.hisnow.fb_like.activity.AdapterViewFilperActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @BindView(R.id.text_title)
    TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.text_title)
    public void onViewClicked() {
//        textTitle.setText(OkHttpUtils.testHttp("DD"));
        startActivity(new Intent(MainActivity.this, AdapterViewFilperActivity.class));
    }
}
