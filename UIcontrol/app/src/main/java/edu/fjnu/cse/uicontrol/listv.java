package edu.fjnu.cse.uicontrol;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.view.View;
import android.widget.AdapterView;
import static android.widget.AdapterView.OnItemClickListener;
import static android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by Administrator on 2017-03-14.
 */
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class listv extends AppCompatActivity {
    private ListView v;
    private String[] title = new String[]
            {"Lion", "Tiger", "Monkey", "Dog", "Cat", "Elephant"};
    private int[] img = new int[]
            {R.mipmap.lion, R.mipmap.tiger
                    , R.mipmap.monkey, R.mipmap.dog, R.mipmap.cat, R.mipmap.elephant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        List<Map<String, Object>> listItems =
                new ArrayList<Map<String, Object>>();
        for (int i = 0; i < title.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("title", title[i]);
            listItem.put("img", img[i]);
            listItems.add(listItem);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,
                R.layout.item,
                new String[]{"title", "img"},
                new int[]{R.id.title, R.id.img});
        ListView list = (ListView) findViewById(R.id.lv);

        list.setAdapter(simpleAdapter);

        list.setOnItemClickListener(new OnItemClickListener() {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast toast = Toast.makeText(listv.this, title[position], Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        list.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}





