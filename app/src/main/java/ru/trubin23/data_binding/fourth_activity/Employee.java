package ru.trubin23.data_binding.fourth_activity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ru.trubin23.data_binding.BR;

public class Employee extends BaseObservable {

    private long id;
    private String name;
    private int salary = 0;

    public Employee(long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        notifyPropertyChanged(BR.salary);
    }
}
