package abstract1;

import concrete.*;

public class SalariedEmployee extends Employee{
    private double yearlySalary;

    public SalariedEmployee(String name, int age, String gender, double yearlySalary) {
        super(name, age, gender);
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    public double getMonthlyWages(){
        return yearlySalary/12;
    }
    
    public void changeAllFields(String name, int age, String gender, double yearlySalary) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.yearlySalary = yearlySalary;  
    }
    
    @Override
    public void work(){
        System.out.println("You will not get paid by the hour, but rather a set amount each year\n");
    }
    
    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" 
                + "yearlySalary=$" + formatToCurrency(yearlySalary) 
                + ", monthlySalary=$" + formatToCurrency(getMonthlyWages()) + "}\n";
    }
    
    
    
    
}
