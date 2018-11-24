package com.example.song.new2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

public class SetActivity extends BaseActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        setTitle("设置Activity");
        final String[] cities = {getString(R.string.lan_chinese), getString(R.string.lan_en), getString(R.string.lan_ja), getString(R.string.lan_ko)};
        final String[] locals = {"zh_CN", "en", "ja", "ko"};
        button = (Button) findViewById(R.id.btn_setting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetActivity.this);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setTitle(R.string.select_language);
                builder.setItems(cities, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Store.setLanguageLocal(SetActivity.this, locals[which]);
                        EventBus.getDefault().post("EVENT_REFRESH_LANGUAGE");
                    }
                });
                builder.show();
            }
        });
    }
}
