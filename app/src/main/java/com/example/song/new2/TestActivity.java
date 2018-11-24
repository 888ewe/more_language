package com.example.song.new2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestActivity extends BaseActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        setTitle("第一个Activity");
        findViewById(R.id.btn_setting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity.this, SetActivity.class));
            }
        });
    }
}
