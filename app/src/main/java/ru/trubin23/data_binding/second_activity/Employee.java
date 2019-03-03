package ru.trubin23.data_binding.second_activity;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class Employee {

    public long id;

    public ObservableField<String> name = new ObservableField<>();

    public String address;

    public ObservableInt salary = new ObservableInt();

    public Employee(long id, String name, String address, int salary) {
        this.id = id;
        this.name.set(name);
        this.address = address;
        this.salary.set(salary);
    }
}
