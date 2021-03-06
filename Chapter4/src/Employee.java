import java.time.*;
import java.util.Random;

/**
 * This program demonstrates object oriented programming in java
 * Employee class stores employee name, salary, and hire date.
 * @version 1.8.0 09-14-2017
 * @author Aaron Lam
 */
public class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary = 0;
    private LocalDate hireDay = LocalDate.now();

    //static initialization block
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //constructors
    public Employee(String aName, double aSalary, int aYear, int aMonth, int aDay){
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(aYear, aMonth, aDay);
    }

    public Employee(String aName, double aSalary){
        name = aName;
        salary = aSalary;
    }

    public Employee(double aSalary){
        this("Employee #" + nextId, aSalary);
    }

    public Employee(){

    }

    //getters
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String toString(){
        return "Employee: [name = " + this.getName() + ", id = " + this.getId() + ", salary = " + this.getSalary() + ", hire date: " + this.getHireDay() + "]";
    }

    /**
     * Raises the salary of an employee.
     * @param byPercent the percent of raising salary (e.g: 10 means 10%)
     */
    public void raiseSalary (double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
