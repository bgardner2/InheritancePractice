package interface1;

public class SalariedEmployee extends Employee implements EmployeeInterface{
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
    public void displayTest() {
        String className = getClass().getSimpleName();
        System.out.println("_______________________________");
        System.out.println("____" + className + " Class____");
        System.out.println("_______________________________\n");
        
        
        //print concreteeEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(this);
        this.work();
        
        //Change parameters in HourlyEmployee
        changeAllFields("Cecil", 14, "Male", 13000);
        
        //print modified Employee      
        System.out.println("---Test for modified Salary employee:");
        System.out.println(this);
        this.work();
    }
    
    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" 
                + "yearlySalary=$" + formatToCurrency(yearlySalary) 
                + ", monthlySalary=$" + formatToCurrency(getMonthlyWages()) + "}\n";
    }


    
    
    
    
}
