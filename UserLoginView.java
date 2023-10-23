/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ablamc.login;

import com.ablamc.reports.DbUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


/**
 *
 * @author wasim.abbas
 */
@RequestScoped
@ManagedBean
public class UserLoginView implements Serializable{

    private DbUtils dbUtils = new DbUtils();
    private List<String> images;
    private List<String> mainImages;
    
    public List<String> getMainImages() {
        return mainImages;
    }

    public void setMainImages(List<String> mainImages) {
        this.mainImages = mainImages;
    }
    
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        mainImages = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            images.add("../Content/assets/admin/pages/media/bg/bg" + i + ".jpg");
           
              }
                System.out.println("Using For Loop ");
	      for (int i = 0; i < images.size();i++) 
	      { 		      
	          System.out.println("values"+images.get(i)); 		
	      }  
        
    }

    public List<String> getImages() {
        return images;
    }

    private String username;
    private String password;
    private int  userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String logout() {
        
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
        return "index.xhtml?faces-redirect=true";
    }
    
    public String login() {
        FacesMessage message = null;
        String v_action = "";
//        boolean loggedIn = false;
        System.out.println("Password Authentication");
        
        System.out.println("username :"+username);
        System.out.println("password :"+password);
        
        try {
            if (username != null && username.length()>0 && password != null && password.length()>0) {
                
                   userid = dbUtils.Authentication(username, password);
                   
                   FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("UserId", userid);
                   FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("UserName", username);
                   
                if (userid >= 1) {
//                    v_action = "crude";

                    v_action = "welcomePrimefaces";
                    message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
                } else {
//            loggedIn = false;
                    message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
                }

            } else {
//            loggedIn = false;
                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "User Name Or Password Incorrect");
            }

        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
            e.printStackTrace();

        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        // PrimeFaces.current().ajax().addCallbackParam("welcomePrimefaces", loggedIn);
        return v_action;
    }
}
