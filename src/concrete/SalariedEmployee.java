package concrete;

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

    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" 
                + "yearlySalary=$" + formatToCurrency(yearlySalary) 
                + ", monthlySalary=$" + formatToCurrency(getMonthlyWages()) + "}\n";
    }
    
    
    
    
}
