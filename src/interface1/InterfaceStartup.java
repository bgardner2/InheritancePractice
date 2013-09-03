package interface1;

public class InterfaceStartup {

    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("ben", 27, "male", 20, 40);
        SalariedEmployee salaryEmployee = new SalariedEmployee("Jill", 35, "female", 30000);
        SalaryPlusBonusEmployee bonusEmployee = new SalaryPlusBonusEmployee("Jane", 42, "female", 50000);

        //Test hourly employee
        hourlyEmployee.displayTest();

        //Test Salaried employee
        salaryEmployee.displayTest();

        //Test Salaried plus bonus employee
        bonusEmployee.setBonus(25000);
        bonusEmployee.displayTest();
    }
}
