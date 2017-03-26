package edu.fjnu.cse.uicontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Created by Administrator on 2017-03-20.
 */

public class actionmode extends AppCompatActivity{
    private ListView v;
    private int i;
    private ActionMode mActionMode;
    private SimpleAdapter simpleAdapter;
    private String[] title = new String[]
            {"One", "Two", "Third", "Four", "Five"};
    private int[] img = new int[]
            {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                    R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmode);

        List<Map<String, Object>> listItems =
                new ArrayList<Map<String, Object>>();
        for (int i = 0; i < title.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("title", title[i]);
            listItem.put("img", img[i]);
            listItems.add(listItem);
        }

        simpleAdapter = new SimpleAdapter(this, listItems,
                R.layout.mode_item,
                new String[]{"title", "img"},
                new int[]{R.id.title, R.id.img});
        ListView list = (ListView) findViewById(R.id.modev);
        list.setAdapter(simpleAdapter);

        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                mActionMode=startSupportActionMode(mActionModeCallback);
                i=position+1;
                mActionMode.setTitle("第"+i+"项被选中");
            }
        });
    }

    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {//加载actions
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.mode_menu, menu);
            return true;
        }
        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }
        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {//当actions的item被点击时回掉
            return false;
        }
        @Override
        public void onDestroyActionMode(ActionMode mode) {//当action mode销毁时的回掉
            mActionMode = null;
        }
    };
}
