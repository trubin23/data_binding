package ru.trubin23.data_binding.first_activity;

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

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

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

        final ActivityFirstBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_first);
        binding.setEmployee(employee);
        binding.setDepartment(department);
        binding.setHobbies(hobbies);
        binding.setMap(map);
        binding.setHandler(new MyHandler());

        TextView textView = binding.address;
        View rootView = binding.getRoot();

        Log.d("MainActivity", textView.toString());
        Log.d("MainActivity", rootView.toString());
    }

}
