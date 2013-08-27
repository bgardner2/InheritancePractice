package concrete;

public class HourlyEmployee {
    private String name;
    private int age;
    private String gender;
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, int age, String gender, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return "HourlyEmployee{" + "name=" + name 
                + ", age=" + age 
                + ", gender=" + gender 
                + ", hourlyWage=" + hourlyWage 
                + ", hoursWorked=" + hoursWorked + '}';
    }
    
    
}
