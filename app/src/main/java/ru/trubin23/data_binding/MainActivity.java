package ru.trubin23.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.trubin23.data_binding.Employee;
import ru.trubin23.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Employee employee = new Employee(1, "John Smith", "London");

        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployee(employee);
    }
}
