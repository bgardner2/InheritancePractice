package inheritancepractice;

import abstract1.*;
import concrete.*;

public class Driver {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* TODO CONCRETE CLASS TESTING
        ------------------------------*/
        
        /* ABSTRACT CLASS TESTING
        --------------------------*/ 
        
        //Test hourly employee
        abstract1.Employee employee;
        employee = new abstract1.HourlyEmployee("ben", 27, "male", 20, 40);
        
        System.out.println("Test for hourly employee:");
        System.out.println(employee + "\n");
        
        //Test Salaried employee
        employee = new abstract1.SalariedEmployee("Jill", 35, "female", 30000);
        
        System.out.println("Test for salaried employee:");
        System.out.println(employee + "\n");
        
        //Test Salaried plus bonus employee
        employee = new abstract1.SalaryPlusBonusEmployee("Jane", 42, "female", 50000);
        employee.setBonus(5000.00);
        
        System.out.println("Test for salaried employee:");
        System.out.println(employee + "\n");
        
        
    }

}
