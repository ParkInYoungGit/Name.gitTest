package com.android.a1215listactivity;



import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    ArrayList<String> data = null;
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        data = new ArrayList<String>();
        data.add("월요일");
        data.add("화요일");
        data.add("수요일");
        data.add("목요일");
        data.add("금요일");
        data.add("토요일");
        data.add("일요일");
        data.add("월요일");
        data.add("화요일");
        data.add("수요일");
        data.add("목요일");
        data.add("금요일");
        data.add("토요일");
        data.add("일요일");
        data.add("월요일");
        data.add("화요일");
        data.add("수요일");
        data.add("목요일");
        data.add("금요일");
        data.add("토요일");
        data.add("일요일");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
        setListAdapter(adapter);
    }
}