package ua.com.timur.daas;

/**
 * Created by тимур50 on 14.11.2017.
 */
public enum CryptoResult {
    Sign_OK(1);

    private final int value;

    private CryptoResult(int value) {
        this.value = value;
    }
}
