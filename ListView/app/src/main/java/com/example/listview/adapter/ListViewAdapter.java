package com.example.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;
import com.example.listview.activity.MainActivity;
import com.example.listview.bean.ListViewBean;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by BinZ on 2016/12/31.
 * 在BaseAdapter中需要实现一个继承自BaseAdapter的类，并且重写里面的很多方法
 */

public class ListViewAdapter extends BaseAdapter {

    private List<ListViewBean> listViewBeanList;
    private LayoutInflater layoutInflater;

    public ListViewAdapter(List<ListViewBean> listViewBeanList, Context context) {
        this.listViewBeanList = listViewBeanList;
        this.layoutInflater=layoutInflater.from(context);
    }



    @Override
    public int getCount() {
        /*(在此适配器中所代表的数据集中的条目数) */
        return listViewBeanList==null?0:listViewBeanList.size();
    }

    @Override
    public Object getItem(int i) {
       /* (获取数据集中与指定索引对应的数据项)*/
        return listViewBeanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        /*(取在列表中与指定索引对应的行id)*/
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        /*加载布局为一个item视图View*/
        if(view==null){
            view=layoutInflater.inflate(R.layout.listview_item,null);
        }
        ListViewBean listViewBean= (ListViewBean) getItem(i);
        /*在view视图中查找id为image_photo的控件*/
        ImageView imageView= (ImageView) view.findViewById(R.id.img_listview);
        TextView title= (TextView) view.findViewById(R.id.tv_title);
        TextView content= (TextView) view.findViewById(R.id.tv_content);
        TextView date= (TextView) view.findViewById(R.id.tv_date);
        /*在view视图中设置value*/
        //imageView.setImageDrawable();
        title.setText(listViewBean.getTv_title());
        content.setText(listViewBean.getTv_content());
        date.setText(listViewBean.getTv_date());

        return view;
    }
}
