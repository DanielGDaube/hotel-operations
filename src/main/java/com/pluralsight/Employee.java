package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {return employeeId;}

    public String getName() {return name;}

    public String getDepartment() {return department;}

    public double getPayRate() {return payRate;}

    public double getHoursWorked() {return hoursWorked;}

    public double getRegularHours() {
        if (getHoursWorked() <= 40){
            return getHoursWorked();
        }
        else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (getHoursWorked() > 40){
            return getHoursWorked() - 40;
        }
        else {
            return 0;
        }
    }

    public double getTotalPay() {
        return getRegularHours() * getPayRate() + (getOvertimeHours() * getPayRate() * 1.5);
    }
}
