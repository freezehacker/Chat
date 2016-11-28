package com.freezejk.chat.widget;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sjk on 16-11-28.
 */
public abstract class CommonAdapter<T> extends RecyclerView.Adapter<CommonViewHolder> {

    private List<T> mDataList = null;

    /* Constructor */
    public CommonAdapter() {
        mDataList = new ArrayList<>();
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(getItemLayout(), parent, false);
        return new CommonViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {
        convert(holder, mDataList.get(position));
    }

    public void addItems(List<T> data) {
        int from = mDataList.size();
        int count = data.size();
        mDataList.addAll(data);
        notifyItemRangeInserted(from, count);
    }

    public void refreshItems(List<T> data) {
        mDataList.clear();
        mDataList.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public T getItem(int position) {
        return mDataList.get(position);
    }

    protected abstract int getItemLayout(); // the layout of this list item adapter

    protected abstract void convert(CommonViewHolder holder, T dataItem);  // bind view holder
}
