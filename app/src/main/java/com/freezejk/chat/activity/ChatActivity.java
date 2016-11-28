package com.freezejk.chat.activity;

import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.freezejk.chat.R;
import com.freezejk.chat.base.BaseActivity;
import com.freezejk.chat.bean.Message;
import com.freezejk.chat.widget.CommonAdapter;
import com.freezejk.chat.widget.CommonViewHolder;

/**
 * Created by sjk on 16-11-28.
 *
 * Chatting boundary:
 *  message list
 */
public class ChatActivity extends BaseActivity {

    EditText etMessageContent;
    Button btnSend;
    TextView tvReceiverInfo;
    RecyclerView rvMessageList;
    ChatAdapter chatAdapter;


    @Override
    protected void initData() {

    }

    @Override
    protected void saveSession() {

    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_chat;
    }

    @Override
    protected void unregisterToReleaseResource() {

    }


    public static class ChatAdapter extends CommonAdapter<Message> {
        @Override
        protected int getItemLayout() {
            return R.layout.chat_item;
        }

        @Override
        protected void convert(CommonViewHolder holder, Message dataItem) {

        }
    }
}
