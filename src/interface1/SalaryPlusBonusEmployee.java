package interface1;



public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonus = 0;

    public SalaryPlusBonusEmployee(String name, int age, String gender, double yearlySalary) {
        super(name, age, gender, yearlySalary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }    
    
    public void changeAllFields(String name, int age, String gender, double yearlySalary, double bonus) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        super.setYearlySalary(yearlySalary);  
        this.bonus = bonus;
    }
    
    @Override
    public String toString() {
        return super.toString() + "SalaryPlusBonusEmployee{" 
                + "bonus=" + formatToCurrency(getBonus()) 
                + ", Yearly salary plus  bonus=" + formatToCurrency(getYearlySalary() + bonus) + "}\n";
    }
    
    
    
}
