package ua.com.timur.daas.sign;

/**
 * Created by тимур50 on 14.11.2017.
 */
public abstract class SignBean {
    private String dataToSign;
    private String signature;
    private String certSerial;
    private int userId;

    public SignBean(String dataToSign, String signature, String certSerial, int userId) {
        this.dataToSign = dataToSign;
        this.signature = signature;
        this.certSerial = certSerial;
        this.userId = userId;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSignature() {
        return signature;
    }

    public String getCertSerial() {
        return certSerial;
    }

    public void setDataToSign(String dataToSign) {
        this.dataToSign = dataToSign;
    }

    public void setCertSerial(String certSerial) {
        this.certSerial = certSerial;
    }

    public void setSignature(String signature) {

        this.signature = signature;
    }

    public String getDataToSign() {
        return dataToSign;
    }
}
