/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author miracle
 */
public class util extends ActionSupport {

    public String userName;
    public String password;

    public String login() {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sess = sf.openSession();

        Auth auth = (Auth) sess.get(Auth.class, userName);

        if (auth == null) {
            return ERROR;
        } else if (auth.getPassword().equals(password)) {
            return SUCCESS;
        } else {
            return ERROR;
        }

    }

}
