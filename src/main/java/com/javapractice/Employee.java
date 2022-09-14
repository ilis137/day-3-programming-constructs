package com.javapractice;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Employee 
{
    int present;

    public int isPresent(){
        Random rand = new Random();
        return rand.nextInt(2);    
    }
 
    public static void main( String[] args )
    {
        Employee emp=new Employee();
        int isPresent=emp.isPresent();

        if(isPresent==1){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is not present");
        }
        
    }
}
