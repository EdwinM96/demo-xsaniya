/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsaniya.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xsaniya.model.LoginObject;
import com.xsaniya.model.SessionVO;
import com.xsaniya.model.user.UserDTO;
import com.xsaniya.model.user.UserVO;
import com.xsaniya.util.Encoder;
import com.xsaniya.util.GlobalVariables;
import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Edwin
 */
public class AccountholderService {

    public AccountholderService() {
    }
    
    public UserVO registerAccountholder(UserDTO userData, String credentials) throws JsonProcessingException{
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", credentials);
        HttpEntity<String> entity = new HttpEntity<>(new ObjectMapper().writeValueAsString(userData), headers);
        ResponseEntity re = restTemplate.exchange(GlobalVariables.BASEURL+"/api/users", 
                                                      HttpMethod.POST, entity, UserVO.class);
        return (UserVO) re.getBody(); 
    }
    
    public UserVO getAccountholderAccountDetails (String credentials){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", credentials);
        HttpEntity<String> entity = new HttpEntity<>("", headers);
        ResponseEntity re = restTemplate.exchange(GlobalVariables.BASEURL+"/api/self/accounts/accountholder_acc", 
                                                      HttpMethod.POST, entity, UserVO.class);
        return (UserVO) re.getBody(); 
    }
    
}
