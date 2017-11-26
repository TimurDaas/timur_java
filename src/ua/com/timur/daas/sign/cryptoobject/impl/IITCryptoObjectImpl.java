package ua.com.timur.daas.sign.cryptoobject.impl;

import ua.com.timur.daas.CryptoResult;
import ua.com.timur.daas.sign.cryptoobject.CryptoObject;

/**
 * Created by тимур50 on 27.11.2017.
 */
public class IITCryptoObjectImpl implements CryptoObject{
    private String signValue;
    private String certificate;
    private String certSerial;

    public IITCryptoObjectImpl() {
    }

    public String getSignValue() {
        return signValue;
    }

    public void setSignValue(String signValue) {
        this.signValue = signValue;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getCertSerial() {
        return certSerial;
    }

    public void setCertSerial(String certSerial) {
        this.certSerial = certSerial;
    }

    public CryptoResult verify()
    {
        System.out.println("Verify IIT sign in class"+IITCryptoObjectImpl.class);
        return CryptoResult.Sign_OK;
    }
}
