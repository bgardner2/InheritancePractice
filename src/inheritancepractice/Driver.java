package inheritancepractice;

import abstract1.HourlyEmployee;



public class Driver {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*CONCRETE CLASS TESTING
        ------------------------------*/
        System.out.println("------------CONCRETE EMPLOYEES------------\n");
        
        //Test Base class
        System.out.println("____________________________");
        System.out.println("_________Base Class_________");
        System.out.println("____________________________\n");
        concrete.Employee concreteEmployee= new concrete.Employee("Jack", 12, "Male");
        
        //print unmodified concreteeEmployee 
        System.out.println("---Test for umodified base employee");
        System.out.println(concreteEmployee);
        
        //Change parameters in concreteEmployee
        concreteEmployee.changeAllFields("Jill", 42, "Female");
        
        //print modified Concrete Employee
        System.out.println("---Test for modified base employee");
        System.out.println(concreteEmployee);
        
        //Test hourly employee
        System.out.println("____________________________");
        System.out.println("____HourlyEmployee Class____");
        System.out.println("____________________________\n");
        
        concreteEmployee = new concrete.HourlyEmployee("ben", 27, "male", 20, 40);
        
        //print concreteeEmployee as is
        System.out.println("---Test for umodified Hourly employee");
        System.out.println(concreteEmployee);
        
        //Cast concreteEmployee to Hourly Employee and Change parameters in HourlyEmployee
        ((concrete.HourlyEmployee)concreteEmployee).changeAllFields("Joe", 68, "Male", 52, 38);
        
        //print modified Concrete Employee      
        System.out.println("---Test for modified Hourly employee:");
        System.out.println(concreteEmployee);
        
        //Test Salaried employee
        System.out.println("____________________________");
        System.out.println("___SalariedEmployee Class___");
        System.out.println("____________________________\n");
        concreteEmployee = new concrete.SalariedEmployee("Jill", 35, "female", 30000);
        
        //Print unmodifed concreteEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(concreteEmployee);
        
        //Cast concreteEmployee to SalariedEmployee and Change parameters in SalariedEmployee
        ((concrete.SalariedEmployee)concreteEmployee).changeAllFields("Jimmy", 90, "Male", 78000);
        
        
        //print modified Concrete Employee      
        System.out.println("---Test for modified Salary employee:");
        System.out.println(concreteEmployee);
        
        //Test Salaried plus bonus employee
        System.out.println("_______________________________________");
        System.out.println("____SalariedPlusBonusEmployee Class____");
        System.out.println("_______________________________________\n");
        concreteEmployee = new concrete.SalaryPlusBonusEmployee(
                "Jane", 42, "female", 50000);
        
        //Print unmodifed concreteEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(concreteEmployee);
        
        //Cast employee to a SalaryBonusEmployee and change all fields
        ((concrete.SalaryPlusBonusEmployee)concreteEmployee).changeAllFields("John", 33, "Male", 200000, 30000);
        
        //Print modified SalarayPlusBonusEmployee
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(concreteEmployee);
        
        
        /* ABSTRACT CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------ABSTRACT EMPLOYEES------------\n");
        
        abstract1.Employee abstractEmployee;
        
        //Test hourly employee
        System.out.println("____________________________");
        System.out.println("____HourlyEmployee Class____");
        System.out.println("____________________________\n");
        
        abstractEmployee = new abstract1.HourlyEmployee("ben", 27, "male", 20, 40);
        
        //print concreteeEmployee as is
        System.out.println("---Test for umodified Hourly employee");
        System.out.println(abstractEmployee);
        abstractEmployee.work();
        
        //Cast abstractEmployee to Hourly Employee and Change parameters in HourlyEmployee
        ((abstract1.HourlyEmployee)abstractEmployee).changeAllFields("Joe", 68, "Male", 52, 38);
        
        //print modified Concrete Employee      
        System.out.println("---Test for modified Hourly employee:");
        System.out.println(abstractEmployee);
        abstractEmployee.work();
        
        //Test Salaried employee
        System.out.println("____________________________");
        System.out.println("___SalariedEmployee Class___");
        System.out.println("____________________________\n");
        abstractEmployee = new abstract1.SalariedEmployee("Jill", 35, "female", 30000);
        
        //Print unmodifed abstractEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(abstractEmployee);
        abstractEmployee.work();
        
        //Cast abstractEmployee to SalariedEmployee and Change parameters in SalariedEmployee
        ((abstract1.SalariedEmployee)abstractEmployee).changeAllFields("Jimmy", 90, "Male", 78000);
        
        
        //print modified abstractEmployee      
        System.out.println("---Test for modified Salary employee:");
        System.out.println(abstractEmployee);
        abstractEmployee.work();
        
        //Test Salaried plus bonus employee
        System.out.println("_______________________________________");
        System.out.println("____SalariedPlusBonusEmployee Class____");
        System.out.println("_______________________________________\n");
        abstractEmployee = new abstract1.SalaryPlusBonusEmployee(
                "Jane", 42, "female", 50000);
        
        //Print unmodifed abstractEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(abstractEmployee);
        abstractEmployee.work();
        
        //Cast employee to a SalaryBonusEmployee and change all fields
        ((abstract1.SalaryPlusBonusEmployee)abstractEmployee).changeAllFields("John", 33, "Male", 200000, 30000);
        
        //Print modified SalarayPlusBonusEmployee
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(abstractEmployee);
        abstractEmployee.work();
        
        
        /* Interface CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------INTERFACE EMPLOYEES------------\n");
    }

}
