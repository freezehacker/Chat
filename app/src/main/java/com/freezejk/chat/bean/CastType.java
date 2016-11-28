package com.freezejk.chat.bean;

/**
 * Created by sjk on 16-11-28.
 *
 * Classify a message's receiver.
 */
public enum CastType {
    OneToOne,   // one-to-one chat
    Multicast,  // group chat
    Broadcast   // world chat
}
