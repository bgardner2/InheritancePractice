package concrete;

public class ConcreteStartup {

    public static void main(String[] args) {
        Employee baseEmployee = new Employee("Jack", 12, "Male");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("ben", 27, "male", 20, 40);
        SalariedEmployee salaryEmployee = new SalaryPlusBonusEmployee("Jane", 42, "female", 50000);
        SalaryPlusBonusEmployee bonusEmployee = new SalaryPlusBonusEmployee("Jane", 42, "female", 50000);
        
        
        //Test Base class
        System.out.println("____________________________");
        System.out.println("_________Base Class_________");
        System.out.println("____________________________\n");

        //print unmodified concreteeEmployee 
        System.out.println("---Test for umodified base employee");
        System.out.println(baseEmployee);

        //Change parameters in concreteEmployee
        baseEmployee.changeAllFields("Jill", 42, "Female");

        //print modified Concrete Employee
        System.out.println("---Test for modified base employee");
        System.out.println(baseEmployee);

        //Test hourly employee
        System.out.println("____________________________");
        System.out.println("____HourlyEmployee Class____");
        System.out.println("____________________________\n");

        //print concreteeEmployee as is
        System.out.println("---Test for umodified Hourly employee");
        System.out.println(hourlyEmployee);

        //Cast concreteEmployee to Hourly Employee and Change parameters in HourlyEmployee
        hourlyEmployee.changeAllFields("Joe", 68, "Male", 52, 38);

        //print modified Concrete Employee      
        System.out.println("---Test for modified Hourly employee:");
        System.out.println(hourlyEmployee);

        //Test Salaried employee
        System.out.println("____________________________");
        System.out.println("___SalariedEmployee Class___");
        System.out.println("____________________________\n");

        //Print unmodifed concreteEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(salaryEmployee);

        //Cast concreteEmployee to SalariedEmployee and Change parameters in SalariedEmployee
        salaryEmployee.changeAllFields("Jimmy", 90, "Male", 78000);


        //print modified Concrete Employee      
        System.out.println("---Test for modified Salary employee:");
        System.out.println(salaryEmployee);

        //Test Salaried plus bonus employee
        System.out.println("_______________________________________");
        System.out.println("____SalariedPlusBonusEmployee Class____");
        System.out.println("_______________________________________\n");

        //Print unmodifed concreteEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(bonusEmployee);

        //Cast employee to a SalaryBonusEmployee and change all fields
        bonusEmployee.changeAllFields("John", 33, "Male", 200000, 30000);

        //Print modified SalarayPlusBonusEmployee
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(bonusEmployee);
    }
}
