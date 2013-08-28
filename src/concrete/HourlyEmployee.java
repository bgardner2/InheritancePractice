package concrete;

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

    @Override
    public String toString() {
        return super.toString() 
                + "HourlyEmployee{" + "hourlyWage=$" + formatToCurrency(hourlyWage) 
                + ", hoursWorked=" + formatHours(hoursWorked) 
                + ", wages=$" + formatToCurrency(getWages()) + "}\n";
    }
}
