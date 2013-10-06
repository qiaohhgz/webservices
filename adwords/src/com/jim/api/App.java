package com.jim.api;

import java.security.Key;
import static com.jim.api.YbEncodeUtil.*;
import static com.jim.api.WebReachEncrypter.*;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 7/9/13
 * Time: 2:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class App {

    public static void main(String[] args) throws Exception {
        String input = "64B91H127R-8R-79R-47R-76B-50A";
        String keyFile = "D:\\JimQiao\\WebReach\\trunk\\common\\resources\\security\\key.dat";
//        String keyFile = "D:\\JimQiao\\WebReach\\data\\security\\key.dat";

        for (int i = 0; i < 100; i++) {
            Key key2 = WebReachEncrypter.getKeyFromSavedFile(keyFile);
            int userid = 29107;//29107  -41C-127A70R94C-18W-119R79B-44R
            //-7H127W-107W-70B21R8C26H-41C

            byte[] bytes = WebReachEncrypter.encrypt(String.valueOf(userid), key2);
            String uKey = YbEncodeUtil.encode(bytes);
            System.out.println("userid: " + userid + " uKey: " + uKey);
        }


//        Key key = getKeyFromSavedFile(keyFile);
//        byte[] encrypt = decode(uKey);
//        String decrypt = decrypt(encrypt, key);
//        System.out.println("decrypt = " + decrypt);
    }
}
