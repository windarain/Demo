package edu.fjnu.cse.uicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lvew(View view){
        //startActivity(new Intent(this,listv.class));
        Intent intent = new Intent(MainActivity.this, listv.class);
               startActivity(intent);
    }

    public void ad(View view){
        Intent intent = new Intent(MainActivity.this, alergdialog.class);
        startActivity(intent);
    }

    public void xml(View view){
        Intent intent = new Intent(MainActivity.this, myxml.class);
        startActivity(intent);
    }

    public void am(View view){
        Intent intent = new Intent(MainActivity.this, actionmode.class);
        startActivity(intent);
    }
}
