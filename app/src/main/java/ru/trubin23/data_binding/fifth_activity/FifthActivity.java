package ru.trubin23.data_binding.fifth_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivityFifthBinding;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityFifthBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_fifth);

        final Employee employee = new Employee();
        binding.setEmployee(employee);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(3_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.d("FifthActivity", employee.name);
                    Log.d("FifthActivity", Boolean.toString(employee.enabled));
                }
            }
        }).start();
    }
}
