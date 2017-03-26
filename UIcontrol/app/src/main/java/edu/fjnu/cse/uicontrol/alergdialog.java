package edu.fjnu.cse.uicontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * Created by Administrator on 2017-03-20.
 */


public class alergdialog extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertdialog);

        AlertDialog.Builder builder = new AlertDialog.Builder(alergdialog.this);
        View view = LayoutInflater.from(alergdialog.this).inflate(R.layout.aler_item, null);
        builder.setView(view);

        builder.setPositiveButton("Sign in", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        builder.show();
    }
}
