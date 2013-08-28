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
    
    public void changeAllFields(String name, int age, String gender, double yearlySalary, double bonus) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        super.setYearlySalary(yearlySalary);  
        this.bonus = bonus;
    }
    
    @Override
    public void displayTest(abstract1.Employee employee) {
        System.out.println("_______________________________________");
        System.out.println("____SalariedPlusBonusEmployee Class____");
        System.out.println("_______________________________________\n");
        
        //Print unmodifed abstractEmployee as is
        System.out.println("---Test for umodified Salary employee");
        System.out.println(employee);
        employee.work();
        
        //Cast employee to a SalaryBonusEmployee and change all fields
        ((abstract1.SalaryPlusBonusEmployee)employee).changeAllFields("John", 33, "Male", 200000, 30000);
        
        //Print modified SalarayPlusBonusEmployee
        System.out.println("---Test for salaried employee with bonus:");
        System.out.println(employee);
        employee.work();
    }
    
    @Override
    public String toString() {
        return super.toString() + "SalaryPlusBonusEmployee{" 
                + "bonus=" + formatToCurrency(getBonus()) 
                + ", Yearly salary plus  bonus=" + formatToCurrency(getYearlySalary() + bonus) + "}\n";
    }
    
    
    
}
