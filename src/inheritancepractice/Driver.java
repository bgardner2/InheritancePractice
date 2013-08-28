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

        //Test hourly employee 
        abstract1.Employee abstractEmployee = new HourlyEmployee("ben", 27, "male", 20, 40);
        abstractEmployee.displayTest(abstractEmployee);
        
        //Test Salaried employee
        abstractEmployee = new abstract1.SalariedEmployee("Jill", 35, "female", 30000);
        abstractEmployee.displayTest(abstractEmployee);
        
        //Test Salaried plus bonus employee
        abstractEmployee = new abstract1.SalaryPlusBonusEmployee(
                "Jane", 42, "female", 50000);
        ((abstract1.SalaryPlusBonusEmployee)abstractEmployee).setBonus(100000000);
        abstractEmployee.displayTest(abstractEmployee);
        
        
        
        /* Interface CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------INTERFACE EMPLOYEES------------\n");
        
        //Test hourly employee 
        interface1.HourlyEmployee interfaceEmployee1 = new interface1.HourlyEmployee("ben", 27, "male", 20, 40);
        interfaceEmployee1.displayTest(interfaceEmployee1);
        
        //Test Salaried employee
        interface1.SalariedEmployee interfaceEmployee2 = new interface1.SalariedEmployee("Jill", 35, "female", 30000);
        interfaceEmployee2.displayTest(interfaceEmployee2);
        
        //Test Salaried plus bonus employee
        interfaceEmployee2 = new interface1.SalaryPlusBonusEmployee(
                "Jane", 42, "female", 50000);
        ((interface1.SalaryPlusBonusEmployee)interfaceEmployee2).setBonus(100000);
        interfaceEmployee2.displayTest(interfaceEmployee2);
    }

}
