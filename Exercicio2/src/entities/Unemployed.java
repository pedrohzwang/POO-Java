package entities;

import enums.Category;

import java.util.Date;

public class Unemployed extends Beneficiary{

    private double unemployedMonths;

    public Unemployed(String name, Date bornDate, String state, double unemployedMonths) {
        super(name, bornDate, state, Category.UNEMPLOYED);
        this.unemployedMonths = unemployedMonths;
    }

    public double getUnemployedMonths() {
        return unemployedMonths;
    }

    private void setUnemployedMonths(double unemployedMonths) {
        this.unemployedMonths = unemployedMonths;
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
