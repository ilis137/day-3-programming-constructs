package com.javapractice;

import java.util.Random;


/*Calculate Daily Employee Wage*/

public class Employee {
    int wagePerHour = 20;
    String[] dailyStatus = { "FULL_TIME", "PART_TIME", "NOT_PRESENT" };

    int totalWorkingDays = 20;

    public int fullTimeWage() {
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

    int getMonthlyWage() {
        int totalWage = 0;
        int daysworked = 0;
        int dailyWage = 0;
        while (daysworked < this.totalWorkingDays) {
            String empCheck = this.checkDailyHours();

            switch (empCheck) {
                case "FULL_TIME":
                    dailyWage = this.fullTimeWage();
                    System.out.println("full time wage of employee is: " + dailyWage + " Rs.");
                    break;
                case "PART_TIME":
                    dailyWage = this.partTimeWage();
                    System.out.println("part time wage of employee is: " + dailyWage + " Rs.");
                    break;
                case "NOT_PRESENT":
                    dailyWage = 0;
                    System.out.println(" wage of absent employee is: 0 Rs.");
                    break;
                default:
                    break;
            }
            totalWage+=dailyWage;
            daysworked++;
        }
       return totalWage;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        int monthlyWage=emp.getMonthlyWage();
        System.out.println("total wage of employee for the month is: "+ monthlyWage);
    }
}
