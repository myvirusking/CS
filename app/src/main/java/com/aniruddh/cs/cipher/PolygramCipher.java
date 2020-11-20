package com.aniruddh.cs.cipher;

public class PolygramCipher {

    public static String generateKey(String str, String key)
    {
        int x = str.length();

        for (int i = 0; ; i++)
        {
            if (x == i)
                i = 0;
            if (key.length() == str.length())
                break;
            key+=(key.charAt(i));
        }
        return key.toUpperCase();
    }

    public static String encrypt(String str, String k) {
        str = str.toUpperCase();
        k = k.toUpperCase();
        String cipher_text="";
        String key = generateKey(str, k);
        for (int i = 0; i < str.length(); i++)
        {
            // converting in range 0-25
            int x = (str.charAt(i) + key.charAt(i)) %26;

            // convert into alphabets(ASCII)
            x += 'A';

            cipher_text+=(char)(x);
        }
        return cipher_text.toLowerCase();
    }

    public static String decrypt(String cipher_text, String k) {
        cipher_text = cipher_text.toUpperCase();
        k = k.toUpperCase();
        String orig_text="";
        String key = generateKey(cipher_text, k);
        for (int i = 0 ; i < cipher_text.length() &&
                i < key.length(); i++)
        {
            // converting in range 0-25
            int x = (cipher_text.charAt(i) -
                    key.charAt(i) + 26) %26;

            // convert into alphabets(ASCII)
            x += 'A';
            orig_text+=(char)(x);
        }
        return orig_text.toLowerCase();
    }

}
