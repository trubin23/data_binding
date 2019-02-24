package ru.trubin23.data_binding;

public class Employee {

    public long id;
    public String name;
    public String address;
    public int salary;

    public Employee(long id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
