package com.jim.api;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 7/10/13
 * Time: 1:49 AM
 * To change this template use File | Settings | File Templates.
 */

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.jim.api.YbEncodeUtil.*;
import static com.jim.api.WebReachEncrypter.*;

public class Main extends Thread {
    public static void main(String[] args) {
        List<Main> threads = new ArrayList<Main>();
        for (int i = 0; i < 100; i++) {
            Main t = new Main();
            threads.add(t);
            t.start();
        }
        while (true) {
            boolean allCompleted = true;
            for (Main thread : threads) {
                if (!thread.isCompleted) {
                    allCompleted = false;
                    break;
                }
            }
            if (allCompleted) {
                break;
            }
        }
        System.out.println("=================");
        for (Main thread : threads) {
            thread.check();
        }
    }

    public static final String keyFile = "D:\\JimQiao\\WebReach\\trunk\\common\\resources\\security\\key.dat";

    private int userId;
    private String uKey;
    private boolean isCompleted;

    @Override
    public void run() {
        try {
            userId = new Random().nextInt(5000) + 1000;

            Key key = getKeyFromSavedFile(keyFile);
            byte[] bytes = encrypt(String.valueOf(userId), key);
            uKey = YbEncodeUtil.encode(bytes);
        } catch (Exception ex) {
            System.out.println("Encode userId = " + userId + " " + ex.getMessage());
        }
        isCompleted = true;
    }

    public boolean check() {
        try {
            Key key = getKeyFromSavedFile(keyFile);
            byte[] encrypt = decode(uKey);
            String decrypt = decrypt(encrypt, key);
            if (Integer.valueOf(decrypt).intValue() == userId) {
//                System.out.println("Decode userId: " + userId + " uKey: " + uKey);
                return true;
            }
        } catch (Exception ex) {
            System.out.println("Decode userId = " + userId + "\tuKey = " + uKey + "\tError:" + ex.getMessage());
        }
        return false;
    }
}
