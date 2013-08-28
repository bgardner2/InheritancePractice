package interface1;


import java.text.DecimalFormat;

public abstract class Employee {
    private String name;
    private int age;
    private String gender;
    private DecimalFormat dollarFormatter = new DecimalFormat("#,###.00");
    private DecimalFormat hourFormatter = new DecimalFormat("#,###.##");

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    
    public String formatToCurrency(double currency){
        return dollarFormatter.format(currency);
    }
    
    public String formatHours(double hours){
        return hourFormatter.format(hours);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name 
                + ", age=" + age 
                + ", gender=" + gender + "}\n";
    }
}
