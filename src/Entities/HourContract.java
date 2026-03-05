package Entities;

import java.util.Date;

public class HourContract {

    private Date Date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(Date date, Integer hours, Double valuePerHour) {
        Date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public HourContract() {

    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double totalValue() {
        return valuePerHour * hours;

    }
}
