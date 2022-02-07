/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsaniya.model;

/**
 *
 * @author Edwin
 */
public class LoginObject {
    private Boolean loginIsSuccessful;
    private String sessionToken;

    public LoginObject() {
    }

    public Boolean getLoginIsSuccessful() {
        return loginIsSuccessful;
    }

    public void setLoginIsSuccessful(Boolean loginIsSuccessful) {
        this.loginIsSuccessful = loginIsSuccessful;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    
}
