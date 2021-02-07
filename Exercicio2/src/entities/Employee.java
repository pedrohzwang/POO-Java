package entities;

import enums.Category;

import java.util.Date;

public class Employee extends Beneficiary{

    private boolean retired;

    public Employee(String name, Date bornDate, String state, boolean retired) {
        super(name, bornDate, state, Category.EMPLOYEE);
        this.retired = retired;
    }

    public boolean isRetired() {
        return retired;
    }

    private void setRetired(boolean retired) {
        this.retired = retired;
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
