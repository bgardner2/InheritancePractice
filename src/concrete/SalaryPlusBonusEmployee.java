package concrete;

public class SalaryPlusBonusEmployee {
    private String name;
    private int age;
    private String gender;
    private double yearlySalary;
    private double bonus;

    public SalaryPlusBonusEmployee(String name, int age, String gender, double yearlySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.yearlySalary = yearlySalary;
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

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getMonthlyWages(){
        return yearlySalary/12;
    }

    @Override
    public String toString() {
        return "SalaryPlusBonusEmployee{" + "name=" + name 
                + ", age=" + age 
                + ", gender=" + gender 
                + ", yearlySalary=" + yearlySalary 
                + ", bonus=" + bonus + "}\n";
    }
    
    
}
