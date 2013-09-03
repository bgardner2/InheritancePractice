package abstract1;



public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, int age, String gender,double hourlyWage, double hoursWorked) {
        super(name, age, gender);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getWages(){
        return this.hoursWorked * this.hourlyWage;
    }
    
    public void changeAllFields(String name, int age, String gender, double hoursWorked, double hourlyWage) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
        
    }
    
    @Override
    public void work(){
        System.out.println("You will get paid by the hour\n");
    }
    
    @Override
    public void displayTest() {
        System.out.println("____________________________");
        System.out.println("____HourlyEmployee Class____");
        System.out.println("____________________________\n");
        
        //print as is
        System.out.println("---Test for umodified Hourly employee");
        System.out.println(this);
        work();
        
        //Change parameters in hourlyEmployee
        changeAllFields("Joe", 68, "Male", 52, 38);
        
        //print modified Employee      
        System.out.println("---Test for modified Hourly employee:");
        System.out.println(this);
        work();
    }
    
    
    @Override
    public String toString() {
        return super.toString() 
                + "HourlyEmployee{" + "hourlyWage=$" + formatToCurrency(hourlyWage) 
                + ", hoursWorked=" + formatHours(hoursWorked) 
                + ", wages=$" + formatToCurrency(getWages()) + "}\n";
    }

    

    
}
