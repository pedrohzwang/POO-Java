package entities;

import enums.Category;

import java.util.Date;

public class Employer extends Beneficiary{

    private int employeeQuantity;

    public Employer(String name, Date bornDate, String state, int employeeQuantity) {
        super(name, bornDate, state, Category.EMPLOYER);
        this.employeeQuantity = employeeQuantity;
    }

    public int getEmployeeQuantity() {
        return employeeQuantity;
    }

    private void setEmployeeQuantity(int employeeQuantity) {
        this.employeeQuantity = employeeQuantity;
    }

    @Override
    public double calculateBenefitValue() {
        return 0;
    }

    @Override
    public double calculateBenefitDuration() {
        return 0;
    }
}
