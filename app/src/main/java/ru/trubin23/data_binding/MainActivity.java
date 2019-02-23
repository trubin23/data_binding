package ru.trubin23.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ru.trubin23.data_binding.Employee;
import ru.trubin23.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Employee employee = new Employee(1, "John Smith", "London");

        final ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployee(employee);

        findViewById(R.id.second_employee).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Employee secondEmployee = new Employee(2, "Alexander", "Washington");
                binding.setEmployee(secondEmployee);
            }
        });

        findViewById(R.id.change_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee.name = "George";
                employee.address = "Chester";
            }
        });

        findViewById(R.id.invalidate_all).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.invalidateAll();
            }
        });
    }
}
