package com.freezejk.chat.bean;

import com.freezejk.chat.util.DateTimeUtil;
import com.freezejk.chat.util.RandomUtil;

import java.io.Serializable;

/**
 * Created by sjk on 16-11-28.
 */
public class Message implements Serializable {

    // No unique field mark a message, so manually add an 'ID' field.
    private String _id;

    private String content;
    private String dateTime;
    private String fromUserId;
    private CastType castType;    // maybe one-to-one, multicast or broadcast
    private String toUserId;


    /* Factory */
    public static Message newInstance(String fromUserId, String toUserId, String content) {
        Message message = new Message();
        message._id = RandomUtil.randomId();
        message.content = content;
        message.fromUserId = fromUserId;
        message.toUserId = toUserId;
        message.dateTime = DateTimeUtil.getCurrentDateTime();   // Automatically generates the date & time.
        return message;
    }

    public String get_id() {
        return _id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public CastType getCastType() {
        return castType;
    }

    public void setCastType(CastType castType) {
        this.castType = castType;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    /* For local debugging*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message[").append(fromUserId).append(" --> ").append(toUserId).append(']').append('\n')
                .append(content);
        return sb.toString();
    }
}
