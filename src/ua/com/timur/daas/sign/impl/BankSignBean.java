package ua.com.timur.daas.sign.impl;

import ua.com.timur.daas.sign.SignBean;

/**
 * Created by тимур50 on 14.11.2017.
 */
public class BankSignBean extends SignBean {
    private String cert;
    private String userserialnumber;

    public BankSignBean(String dataToSign, String signature, String certSerial, int userId, String cert, String userserialnumber) {
        super(dataToSign, signature, certSerial, userId);
        this.cert = cert;
        this.userserialnumber = userserialnumber;
    }

    public String getCert() {

        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getUserserialnumber() {
        return userserialnumber;
    }

    public void setUserserialnumber(String userserialnumber) {
        this.userserialnumber = userserialnumber;
    }
}
