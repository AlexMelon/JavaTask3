package model;

public interface Taxable {

    double SALES_TAX = 0.07;
    double INCOME_TAX = 10.5;

    double calculateTax();
}
