package Entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures ;

    public Individual(String name, Double AnnualIncome, Double healthExpenditures) {
        super(name, AnnualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }




    @Override
    public  double tax(){
        double income = getAnnualIncome();
        double basicTax;
        if (getAnnualIncome() < 20000 ){
            basicTax = income * 0.15;
        } else {
            basicTax = income * 0.25;
        }
        if (basicTax < 0.0){
            basicTax = 0.0;
        }

        double healthDiscount = healthExpenditures * 0.5;

        return basicTax - healthDiscount;

    }

}
