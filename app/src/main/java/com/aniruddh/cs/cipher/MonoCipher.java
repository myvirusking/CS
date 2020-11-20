package com.aniruddh.cs.cipher;

public class MonoCipher {
    public static char p[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v',
            'w', 'x', 'y', 'z'};
    public static char ch[] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
            'K', 'L', 'Z', 'X', 'C',
            'V', 'B', 'N', 'M'};

    public static String encrypt(String s) {
        s = s.toLowerCase();
        char c[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (p[j] == s.charAt(i)) {
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return (new String(c).toLowerCase());
    }

    public static String decrypt(String s) {
        s = s.toUpperCase();
        char p1[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (ch[j] == s.charAt(i)) {
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1).toLowerCase());
    }

}