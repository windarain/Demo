package com.wcf.study.mybrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();  //将检索出来的intent赋值给一个Intent类型的变量intent
        Uri uri = intent.getData();   //获取intent的uri数据
        if (uri==null) {  //如果没有数据，则显示首页为百度搜索的页面
            uri = Uri.parse("https://www.baidu.com");
        }
        WebView webview = (WebView) findViewById(R.id.wv);
        webview.loadUrl(uri.toString());    //显示相应的网页
        webview.getSettings().setJavaScriptEnabled(true);   //提供JavaScript的支持
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }
}
