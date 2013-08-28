package abstract1;

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
    
    @Override
    public double getYearlySalary() {
        return super.getYearlySalary() + bonus;
    }
    

    @Override
    public String toString() {
        return super.toString() + "SalaryPlusBonusEmployee{" 
                + "Yearly salary plus  bonus=" + formatToCurrency(getYearlySalary()) + "}\n";
    }
    
    
    
}
