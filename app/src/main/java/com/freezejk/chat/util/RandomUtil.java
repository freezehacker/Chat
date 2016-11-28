package com.freezejk.chat.util;

import java.util.Random;

/**
 * Created by sjk on 16-11-28.
 */
public class RandomUtil {

    public static String randomId() {
        return getRandomString(32);
    }

    public static String getRandomString(int length) {
        String domain = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int domainSize = domain.length();
        for (int i = 0; i < length; ++i) {
            int index = random.nextInt(domainSize);
            sb.append(domain.charAt(index));
        }
        return sb.toString();
    }
}
