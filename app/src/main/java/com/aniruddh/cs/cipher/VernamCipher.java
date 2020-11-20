package com.aniruddh.cs.cipher;

public class VernamCipher {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plainText, String keyText) {
        plainText = plainText.toLowerCase();
        keyText = keyText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {

            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyPosition = ALPHABET.indexOf(keyText.charAt(i));
            int cipherPosition = (charPosition + keyPosition) % 26;
            char replaceVal = ALPHABET.charAt(cipherPosition);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static String decrypt(String plainText, String keyText) {
        plainText = plainText.toLowerCase();
        keyText = keyText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {

            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyPosition = ALPHABET.indexOf(keyText.charAt(i));
            int cipherPosition = (charPosition - keyPosition);
            if (cipherPosition < 0) {
                cipherPosition = cipherPosition + 26;
            }
            char replaceVal = ALPHABET.charAt(cipherPosition);
            cipherText += replaceVal;
        }
        return cipherText;
    }

}
