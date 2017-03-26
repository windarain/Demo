package edu.fjnu.cse.uicontrol;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017-03-20.
 */

public class myxml extends AppCompatActivity{
    private EditText test;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myxml);
        test=(EditText)findViewById(R.id.test);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();//获取MenuInflater对象
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.small:
                test.setTextSize(10 * 2);
                break;
            case R.id.middle:
                test.setTextSize(16 * 2);
                break;
            case R.id.big:
                test.setTextSize(20 * 2);
                break;
            case R.id.common:
                Toast.makeText(this, "选择了普通菜单项菜单", Toast.LENGTH_LONG).show();
                break;
            case R.id.red:
                item.setChecked(true);
                test.setTextColor(Color.RED);
                break;
            case R.id.black:
                item.setChecked(true);
                test.setTextColor(Color.BLACK);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
