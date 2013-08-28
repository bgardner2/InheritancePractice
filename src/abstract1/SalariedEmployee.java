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
    public void displayTest(abstract1.Employee employee) {
        System.out.println("____________________________");
        System.out.println("____AalariedEmployee Class____");
        System.out.println("____________________________\n");
        
        
        //print concreteeEmployee as is
        System.out.println("---Test for umodified Hourly employee");
        System.out.println(employee);
        employee.work();
        
        //Cast abstractEmployee to Hourly Employee and Change parameters in HourlyEmployee
        ((abstract1.SalariedEmployee)employee).changeAllFields("Joe", 68, "Male", 100000);
        
        //print modified Concrete Employee      
        System.out.println("---Test for modified Hourly employee:");
        System.out.println(employee);
        employee.work();
    }
    
    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" 
                + "yearlySalary=$" + formatToCurrency(yearlySalary) 
                + ", monthlySalary=$" + formatToCurrency(getMonthlyWages()) + "}\n";
    }
    
    
    
    
}
