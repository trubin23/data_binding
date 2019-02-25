package ru.trubin23.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.trubin23.data_binding.Department;
import ru.trubin23.data_binding.Employee;
import ru.trubin23.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Employee employee = new Employee(1, "John Smith", "London", 10_000);
        Department department = new Department(100, "IT");

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Drawing");
        hobbies.add("Photography");
        hobbies.add("Learn a language");

        Map<String, String> map = new HashMap<>();
        map.put("key 1", "value 1");
        map.put("key 2", "value 2");
        map.put("key 3", "value 3");

        final ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployee(employee);
        binding.setDepartment(department);
        binding.setHobbies(hobbies);
        binding.setMap(map);

        TextView textView = binding.address;
        View rootView = binding.getRoot();

        Log.d("MainActivity", textView.toString());
        Log.d("MainActivity", rootView.toString());
    }
}
