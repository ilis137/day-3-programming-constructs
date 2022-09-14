package com.javapractice;

import java.util.Random;

public class Employee {
    int wagePerHour = 20;
    String[] dailyStatus = { "FULL_TIME", "PART_TIME", "NOT_PRESENT" };
    int totalWorkingDays = 20;
    int maxWorkHours = 100;
    final int PART_TIME = 4;
    final int FULL_TIME = 8;
    final int NOT_PRESENT = 0;

    public int fullTimeWage() {
        return FULL_TIME * this.wagePerHour;
    }

    public int partTimeWage() {
        return PART_TIME * this.wagePerHour;
    }

    String checkDailyHours() {
        Random rand = new Random();
        return dailyStatus[rand.nextInt(3)];
    }

    int getMonthlyWage() {
        int totalWage = 0;
        int daysworked = 0;
        int dailyWage = 0;
        int empHrs = 0;
        while (daysworked < this.totalWorkingDays && empHrs < this.maxWorkHours) {
            String empCheck = this.checkDailyHours();

            
            switch (empCheck) {
                case "FULL_TIME":
                    dailyWage = this.fullTimeWage();
                    empHrs += this.FULL_TIME;
                    System.out.println("full time wage of employee is: " + dailyWage + " Rs.");
                    break;
                case "PART_TIME":
                    dailyWage = this.partTimeWage();
                    System.out.println("part time wage of employee is: " + dailyWage + " Rs.");
                    empHrs += this.PART_TIME;
                    break;
                case "NOT_PRESENT":
                    dailyWage = 0;
                    System.out.println(" wage of absent employee is: 0 Rs.");
                    empHrs += this.NOT_PRESENT;
                    break;
                default:
                    break;
            }
            totalWage += dailyWage;

            daysworked++;

        }
        return totalWage;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        int monthlyWage = emp.getMonthlyWage();
        System.out.println("total wage of employee for the month is: " + monthlyWage);
    }
}
