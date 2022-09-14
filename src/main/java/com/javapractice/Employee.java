package com.javapractice;

import java.util.Random;

import javax.lang.model.util.ElementScanner6;

/*Calculate Daily Employee Wage*/

public class Employee {
    int wagePerHour = 20;
    String[] dailyStatus = { "FULL_TIME", "PART_TIME", "NOT_PRESENT" };

    public int dailyWage() {
        int dailyHrs = 8;
        return dailyHrs * this.wagePerHour;
    }

    public int partTimeWage() {
        int dailyHrs = 4;
        return dailyHrs * this.wagePerHour;
    }

    String checkDailyHours() {

        Random rand = new Random();
        return dailyStatus[rand.nextInt(3)];
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        String empCheck = emp.checkDailyHours();

        switch (empCheck) {
            case "FULL_TIME":
                int dailyWage = emp.dailyWage();
                System.out.println("daily wage of employee is: " + dailyWage + " Rs.");
                break;
            case "PART_TIME":
                int partTimeWage = emp.partTimeWage();
                System.out.println("part time wage of employee is: " + partTimeWage + " Rs.");
                break;
            case "NOT_PRESENT":
                System.out.println(" wage of absent employee is: 0 Rs.");
                break;
            default:
                break;
        }

    }
}
