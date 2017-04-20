package com.wcf.study.intentpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browse(View source)
    {
        et=(EditText)findViewById(R.id.et);
        Uri uri = Uri.parse(et.getText().toString());//获取edittext的值
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);// 设置Intent的Data属性
        startActivity(intent);
    }
}