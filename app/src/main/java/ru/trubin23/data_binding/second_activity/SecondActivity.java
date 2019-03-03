package ru.trubin23.data_binding.second_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivitySecondBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_second);

        final Employee employee = new Employee(1, "John Smith", "London", 10_000);
        binding.setEmployee(employee);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                employee.name.set("Mark");
                employee.salary.set(20_000);
            }
        }).start();
    }
}
