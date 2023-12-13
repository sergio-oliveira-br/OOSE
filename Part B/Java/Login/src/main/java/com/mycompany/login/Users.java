/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergiovinicio
 */
public class Users
{
    private final List<Signup> user = new ArrayList<>();
    
    public Users()
    {
        user.add(new Signup("oliveira-sergio", "Brazil123"));
        user.add(new Signup("Admin123", "Admin123"));
    }
    
    
    public Signup signUp (String username) 
    {         
        for (Signup i : user) 
        {
            if (i.getUsername().equals(username)) 
            {
                return i;
            }
        } 
        return null; 
    }
    
}
