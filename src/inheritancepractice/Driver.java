package inheritancepractice;



public class Driver {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*CONCRETE CLASS TESTING
        ------------------------------*/
        System.out.println("------------CONCRETE EMPLOYEES------------\n");
        
        //Test hourly employee
        concrete.Employee employee;
        employee = new concrete.HourlyEmployee("ben", 27, "male", 20, 40);
        
        System.out.println("---Test for hourly employee:");
        System.out.println(employee);
        
        //Test Salaried employee
        employee = new concrete.SalariedEmployee("Jill", 35, "female", 30000);
        
        System.out.println("---Test for salaried employee:");
        System.out.println(employee);
        
        //Test Salaried plus bonus employee
        employee = new concrete.SalaryPlusBonusEmployee(
                "Jane", 42, "female", 50000);
        
        //Cast employee to a SalaryBonusEmployee
        ((concrete.SalaryPlusBonusEmployee)employee).setBonus(5000);
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(employee);
        
        
        /* ABSTRACT CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------ABSTRACT EMPLOYEES------------\n");

        
        
        /* Interface CLASS TESTING
        --------------------------*/ 
        
        System.out.println("------------INTERFACE EMPLOYEES------------\n");
    }

}
