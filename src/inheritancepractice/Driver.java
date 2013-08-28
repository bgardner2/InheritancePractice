package inheritancepractice;

import abstract1.*;
import concrete.*;

public class Driver {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*CONCRETE CLASS TESTING
        ------------------------------*/
        
        System.out.println("------------CONCRETE EMPLOYEES------------\n");
        
        //Test  employee
        concrete.Employee concreteEmployee;
        concreteEmployee = new concrete.Employee("John", 20, "male");
        
        System.out.println("---Test for employee:");
        System.out.println(concreteEmployee);
        
        //Test hourly employee
        concrete.HourlyEmployee concreteHourlyEmployee = new concrete.HourlyEmployee(
                "Jill", 35, "female", 15, 40);
        
        System.out.println("---Test for hourly employee:");
        System.out.println(concreteEmployee);
        
        //Test Salaried Employee
         concrete.SalariedEmployee salaryEmployee = new concrete.SalariedEmployee(
                 "Jane", 52, "female", 30000);
         
         System.out.println("---Test for salaried employee:");
         System.out.println(salaryEmployee);
        
        //Test Salaried plus bonus employee
        concrete.SalaryPlusBonusEmployee concreteBonusEmployee = new concrete.SalaryPlusBonusEmployee(
                "Jack", 42, "male", 50000);
        concreteBonusEmployee.setBonus(5000.00);
                
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(concreteBonusEmployee);
        
        
        /* ABSTRACT CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------ABSTRACT EMPLOYEES------------\n");

        //Test hourly employee
        abstract1.Employee employee;
        employee = new abstract1.HourlyEmployee("ben", 27, "male", 20, 40);
        
        System.out.println("---Test for hourly employee:");
        System.out.println(employee);
        
        //Test Salaried employee
        employee = new abstract1.SalariedEmployee("Jill", 35, "female", 30000);
        
        System.out.println("---Test for salaried employee:");
        System.out.println(employee);
        
        //Test Salaried plus bonus employee
        employee = new abstract1.SalaryPlusBonusEmployee(
                "Jane", 42, "female", 50000);
        
        //Cast employee to a SalaryBonusEmployee
        ((abstract1.SalaryPlusBonusEmployee)employee).setBonus(5000);
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(employee);
        
        /* Interface CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------INTERFACE EMPLOYEES------------\n");
    }

}
