package com.freezejk.chat.widget;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by sjk on 16-11-28.
 */
public class CommonViewHolder extends RecyclerView.ViewHolder {

    private View mConvertView;

    public CommonViewHolder(View itemView) {
        super(itemView);
        mConvertView = itemView;
    }

    public View getConvertView() {
        return mConvertView;
    }

    public <T extends View> T getView(int viewId) {
        return (T) mConvertView.findViewById(viewId);
    }
}
