package edu.fjnu.cse.helloworld;

import android.os.Bundle;
import android.widget.*;
import android.view.Menu;
import android.view.View;
import android.app.Activity;



public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public void clickHandler(View source){
        TextView tv=(TextView) findViewById(R.id.show);
        tv.setText("Hello Android-"+new java.util.Date());
    }
}
