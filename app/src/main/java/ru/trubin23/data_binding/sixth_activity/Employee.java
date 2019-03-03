package ru.trubin23.data_binding.sixth_activity;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public String name;

    public String avatarUrl;

    public List<Hobby> hobbies = new ArrayList<>();

    public Employee() {
        hobbies.add(new Hobby("Hiking"));
        hobbies.add(new Hobby("Reading"));
        hobbies.add(new Hobby("Writing"));
        hobbies.add(new Hobby("Playing Games"));
        hobbies.add(new Hobby("Learning"));
    }
}
