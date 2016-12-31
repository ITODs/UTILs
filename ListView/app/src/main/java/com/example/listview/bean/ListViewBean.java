package com.example.listview.bean;

import android.widget.ImageView;

/**
 * Created by BinZ on 2016/12/31.
 * ListViewBean就是一个静态类，规定视图的数据模型，缓存了显示数据的视图（View），加快了 UI 的响应速度。
 */

public class ListViewBean {
    public ImageView img_listview;
    public String tv_title;
    public String tv_content;
    public String tv_date;

    public ListViewBean(String tv_date, String tv_content, String tv_title) {
        this.tv_date = tv_date;
        this.tv_content = tv_content;
        this.tv_title = tv_title;
    }

    public ImageView getImg_listview() {
        return img_listview;
    }

    public void setImg_listview(ImageView img_listview) {
        this.img_listview = img_listview;
    }

    public String getTv_content() {
        return tv_content;
    }

    public void setTv_content(String tv_content) {
        this.tv_content = tv_content;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTv_date() {
        return tv_date;
    }

    public void setTv_date(String tv_date) {
        this.tv_date = tv_date;
    }
}
