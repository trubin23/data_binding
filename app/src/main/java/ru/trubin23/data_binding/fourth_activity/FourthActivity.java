package ru.trubin23.data_binding.fourth_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivityFourthBinding;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityFourthBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_fourth);

        final Employee employee = new Employee(1, "John Smith", 10_000);
        binding.setEmployee(employee);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                employee.setName("Mark");
                employee.setSalary(20_000);
            }
        }).start();
    }
}
