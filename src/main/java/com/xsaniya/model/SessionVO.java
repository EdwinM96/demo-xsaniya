/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsaniya.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Edwin
 */
public class SessionVO {
    
    @JsonProperty("sessionToken")
    private String sessionToken;

    public SessionVO() {
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
}
