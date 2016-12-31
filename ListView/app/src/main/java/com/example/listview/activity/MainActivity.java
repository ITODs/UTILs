package com.example.listview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.listview.R;
import com.example.listview.adapter.ListViewAdapter;
import com.example.listview.bean.ListViewBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<ListViewBean> ltData=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ltData=getListData();
    }


    private void init() {
        listView= (ListView) findViewById(R.id.lv_listview);
        ListViewAdapter listAdapter=new ListViewAdapter(ltData,MainActivity.this);
        listView.setAdapter(listAdapter);
    }

    private List<ListViewBean> getListData() {

        String title="标题";
        String conent="内容";
        /*获取当前时间*/
        SimpleDateFormat datString=new SimpleDateFormat("MM-dd hh:mm:ss");
        String date=datString.format(new java.util.Date());

        ListViewBean[] list=new ListViewBean[10];
        for (int i=0;i<list.length;i++){
            list[i]=new ListViewBean(title,conent,date);
            list[i].setTv_title(title+i);
            list[i].setTv_content(conent+i);
           list[i].setTv_date(date);
            ltData.add(i,list[i]);
        }
        return ltData;
    }


}
