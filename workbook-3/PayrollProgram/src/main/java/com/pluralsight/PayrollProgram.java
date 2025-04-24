package com.pluralsight;

class employee {
            private final String employeeId;
            private final String name;
            private final double hoursWorked;
            private final double payRate;


            public employee(String employeeId, String name, double hoursWorked, double payRate) {
                this.employeeId = employeeId;
                this.name = name;
                this.hoursWorked = hoursWorked;
                this.payRate = payRate;
            }


            public double getGrossPay() {
                return hoursWorked * payRate;
            }

            public String getPayrollDetails() {
                return employeeId + "," + name + "," + hoursWorked + "," + payRate + "," + getGrossPay();
            }
        }
