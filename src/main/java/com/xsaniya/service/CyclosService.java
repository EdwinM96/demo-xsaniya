/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsaniya.service;

import com.xsaniya.model.LoginObject;
import com.xsaniya.model.SessionVO;
import com.xsaniya.util.Encoder;
import com.xsaniya.util.GlobalVariables;
import java.util.Collections;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Edwin
 */
public class CyclosService {
    
    //TODO: Handle errors on login.
    public LoginObject login(String username, String pw){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", Encoder.encode64(username, pw));
        HttpEntity<String> entity = new HttpEntity<>("", headers);
        ResponseEntity re = restTemplate.exchange(GlobalVariables.BASEURL+"/api/auth/session", 
                                                      HttpMethod.POST, entity, SessionVO.class);
        SessionVO session = (SessionVO) re.getBody();
        LoginObject loginObject = new LoginObject();
        loginObject.setLoginIsSuccessful(Boolean.TRUE);
        loginObject.setSessionToken(session.getSessionToken());
        return loginObject ;   
        
    }
    //TODO
    /*
    public Object logout(){
        
    }
    */
}
