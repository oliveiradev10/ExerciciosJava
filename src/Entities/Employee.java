package Entities;

public class Employee {
    private Integer id;
    private String name;
    private double salary;

    public Employee() {

    }

    public Employee(Integer id, String name, double Salario){
        this.id = id;
        this.name = name;
        this.salary = Salario;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salary;
    }

    public void setSalario(double salario) {
        this.salary = salario;
    }

    public void increaseSalary(double percentage) {
        salary = salary + salary * percentage / 100.0;
    }
        @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);

    }
}
