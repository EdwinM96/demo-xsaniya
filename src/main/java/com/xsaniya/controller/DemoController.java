/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsaniya.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.xsaniya.model.user.LandLinePhone;
import com.xsaniya.model.user.MobilePhone;
import com.xsaniya.model.user.Password;
import com.xsaniya.model.user.UserDTO;
import com.xsaniya.model.user.UserVO;
import com.xsaniya.service.AccountholderService;
import com.xsaniya.service.InstitutionService;
import com.xsaniya.util.Encoder;
import com.xsaniya.util.GlobalVariables;
import java.util.Collections;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Edwin
 */

@Controller
public class DemoController {
    
    public static int USAGENUMBER = 1;
    
    AccountholderService accountholderService = new AccountholderService();
    InstitutionService institutionService = new InstitutionService();
    String credentials = Encoder.encode64(GlobalVariables.USERNAME, GlobalVariables.PASSWORD);
    
    UserDTO userData;
    
   @RequestMapping(value = "/")
   public ModelAndView indice(HttpServletRequest request, HttpServletResponse response){
       ModelAndView mv = new ModelAndView("introduction");
       return mv;
   }
   
   @RequestMapping(value = "/create-client")
   public ModelAndView createClient(HttpServletRequest request, HttpServletResponse response){
       ModelAndView mv = new ModelAndView("createClient");
       //USAGENUMBER+=1;
       userData = new UserDTO();
       userData.setEmail("demo" + USAGENUMBER + "@demo.com");
       userData.setUsername("demo" + USAGENUMBER);
       userData.setName("Demo" + USAGENUMBER);
       userData.setGroup("accountholder");
       userData.setSkipActivationEmail(Boolean.TRUE);
       userData.setLandLinePhones(Collections.singletonList(new LandLinePhone("LandLine", "+503-2485-2971", true, true, true, "landline")));
       userData.setMobilePhones(Collections.singletonList(new MobilePhone("Mobile","+503-7885-2972", true, true, true, "mobile")));
       userData.setPasswords(Collections.singletonList(new Password("securePassword","login")));
       String userDataJSON = new Gson().toJson(userData);
       mv.addObject("userData", userDataJSON);
       mv.addObject("baseURL", GlobalVariables.BASEURL);
       return mv;
   }
   
   @RequestMapping(value = "/check-balance")
   public ModelAndView checkBalance(HttpServletRequest request, HttpServletResponse response){
       ModelAndView mv = new ModelAndView("checkBalance");
       //USAGENUMBER+=1;
       UserDTO userData = new UserDTO();
       userData.setEmail("demo" + USAGENUMBER + "@demo.com");
       userData.setUsername("demo" + USAGENUMBER);
       userData.setName("Demo" + USAGENUMBER);
       userData.setGroup("accountholder");
       userData.setSkipActivationEmail(Boolean.TRUE);
       userData.setLandLinePhones(Collections.singletonList(new LandLinePhone("LandLine", "+503-2485-2971", true, true, true, "landline")));
       userData.setMobilePhones(Collections.singletonList(new MobilePhone("Mobile","+503-7885-2972", true, true, true, "mobile")));
       userData.setPasswords(Collections.singletonList(new Password("securePassword","login")));
       String userDataJSON = new Gson().toJson(userData);
       mv.addObject("userData", userDataJSON);
       mv.addObject("baseURL", GlobalVariables.BASEURL);
       return mv;
   }
   
   @RequestMapping(value = "/client-created")
   public ModelAndView clientCreated(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException{
       ModelAndView mv = new ModelAndView("clientCreated");
       UserVO registeredUser = accountholderService.registerAccountholder(userData, credentials);
       mv.addObject("registeredUserJSON", new Gson().toJson(registeredUser));
       mv.addObject("registeredUser", registeredUser);
       mv.addObject("baseURL", GlobalVariables.BASEURL);
       return mv;
   }
      
}
