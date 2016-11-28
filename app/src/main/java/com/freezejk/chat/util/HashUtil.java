package com.freezejk.chat.util;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by sjk on 16-11-28.
 */
public class HashUtil {

    public static String getMD5(String s) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(s.getBytes("UTF-8"));
            byte[] bytes = messageDigest.digest();

            StringBuilder sb = new StringBuilder();
            for (byte everyByte : bytes) {
                String tmp = Integer.toHexString(0xff & everyByte); // Note: trans to hex string.
                if (tmp.length() == 1) {
                    sb.append('0');
                }
                sb.append(tmp);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            Logger.log("MD5 hash not found!");
            return s;
        } catch (UnsupportedEncodingException e) {
            Logger.log("UTF-8 encoding failed!");
            return s;
        } finally {

        }
    }
}
