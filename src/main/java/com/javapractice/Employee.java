package com.javapractice;

import java.util.Random;

/*Calculate Daily Employee Wage*/

public class Employee 
{
    int present;
    int wagePerHour=20;
    public int isPresent(){
        Random rand = new Random();
        return rand.nextInt(2);    
    }

    public int dailyWage(){
       int dailyHrs=8;
       return dailyHrs*this.wagePerHour;
    }
 
    public int partTimeWage(){
        int dailyHrs=4;
        return dailyHrs*this.wagePerHour;
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

        
        
        int dailyWage=emp.dailyWage();
        System.out.println("daily wage of employee is: "+dailyWage +" Rs.");
        
        
        int partTimeWage=emp.partTimeWage();
        System.out.println("part time wage of employee is: "+partTimeWage +" Rs.");
        
    }
}
