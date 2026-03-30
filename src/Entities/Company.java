package Entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company(Double annualIncome, String name, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public  double tax() {
        double income = getAnnualIncome();
        double basicTax;

        if( numberOfEmployees != null && numberOfEmployees <= 10){
            basicTax = income * 0.16;

        } else{
            basicTax = income * 0.14;
        }
        return basicTax;
    }

}
