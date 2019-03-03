package ru.trubin23.data_binding.third_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityThirdBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_third);

        final ViewModel viewModel = new ViewModel();
        viewModel.employee.set(
                new Employee(1, "John Smith", "London", 10_000));
        binding.setModel(viewModel);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                viewModel.employee.set(
                        new Employee(2, "Mark", "Washington", 20_000));
            }
        }).start();
    }
}
