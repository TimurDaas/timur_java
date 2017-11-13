package ua.com.timur.daas;

/**
 * Created by тимур50 on 09.11.2017.
 */
public enum CryptoLibsEnum {
    RSA(1),
    CIPHER_PKI(2),
    IIT(3),
    CIPHER_X509(4),
    AVTOR(5);

    private final int value;

    private CryptoLibsEnum(int value) {
        this.value = value;
    }
}
