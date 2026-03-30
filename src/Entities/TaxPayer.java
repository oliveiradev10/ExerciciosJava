package Entities;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer(){

    }

    public TaxPayer(Double anualIcome, String name) {
        this.anualIncome = anualIcome;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIcome) {
        this.anualIncome = anualIcome;
    }

    public abstract double tax();

}
