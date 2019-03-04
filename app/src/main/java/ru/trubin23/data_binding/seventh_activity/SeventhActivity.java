package ru.trubin23.data_binding.seventh_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivitySeventhBinding;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivitySeventhBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_seventh);

        final Employee employee = new Employee();
        employee.name = "John Smith";
        employee.profession = "programmer";
        employee.salary = "10_000";
        binding.setEmployee(employee);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                employee.name = "Mark";
                employee.profession = "designer";
                employee.salary = "20_000";
                binding.invalidateAll();
            }
        }).start();
    }
}
