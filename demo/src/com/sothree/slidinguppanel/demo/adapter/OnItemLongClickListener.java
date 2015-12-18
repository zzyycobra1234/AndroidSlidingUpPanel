package com.sothree.slidinguppanel.demo.adapter;

import android.view.View;

/**
 * Created by Administrator on 2015/12/18 0018.
 */
public interface OnItemLongClickListener<T> {
    void onLongClick(View view, T item);
}
