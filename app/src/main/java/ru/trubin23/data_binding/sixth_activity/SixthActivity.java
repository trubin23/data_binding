package ru.trubin23.data_binding.sixth_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivitySixthBinding;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivitySixthBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_sixth);

        final Employee employee = new Employee();
        employee.name = "android";
        employee.avatarUrl = "-----";
        binding.setEmployee(employee);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Employee secondEmployee = new Employee();
                secondEmployee.name = "new logo";
                secondEmployee.avatarUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
                binding.setEmployee(secondEmployee);
            }
        }).start();
    }
}
