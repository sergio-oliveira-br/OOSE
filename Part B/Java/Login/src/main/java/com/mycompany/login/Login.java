/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import java.util.Scanner;

/**
 *
 * @author sergiovinicio
 */
public class Login
{
 
    public static void main(String[] args) 
    {
        System.out.println("CA | OOSE Part B");
        System.out.println("Welcome to the garden center."
                + " Accessing the point of sale requires a login.");
   
        //declare variables
        String username;
        String password;
        
        //declare object 
        Scanner sc = new Scanner(System.in);
       
        //input
        System.out.println("Please enter your Username");
        username = sc.nextLine();

        System.out.println("Please enter your Password");
        password = sc.nextLine();

        // Create an instance of the Users class
        Users myU = new Users();

        // Process
        Signup signedUpUser = myU.signUp(username);
        
        //output
        if (signedUpUser != null && signedUpUser.getPassword().equals(password))
        {
            System.out.println("Login successful");
        } 
        else 
        {
            System.out.println("Login failed. Invalid username or password.");
        }             
    }
    
    public static int Login (String username, String password)
    {
     
        // Create an instance
        Users myU = new Users();

        // Process
        Signup signedUpUser = myU.signUp(username);
        
        //output
        if (signedUpUser != null && signedUpUser.getPassword().equals(password))
        {
            System.out.println("Login successful");
            return 1;
        } 
        else 
        {
            System.out.println("Login failed. Invalid username or password.");
            return 0;
        }             
    }
        
}
