package ru.trubin23.data_binding.eighth_activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import ru.trubin23.data_binding.R;
import ru.trubin23.data_binding.databinding.ActivityEighthAddressBinding;
import ru.trubin23.data_binding.databinding.ActivityEighthBinding;

public class EighthActivity extends AppCompatActivity {

    ActivityEighthBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =
                DataBindingUtil.setContentView(this, R.layout.activity_eighth);
        final Employee employee = new Employee(1, "John Smith", "London");
        binding.setEmployee(employee);

        binding.employeeAddressStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View view) {
                ActivityEighthAddressBinding addressBinding =
                        DataBindingUtil.bind(view);
                addressBinding.setEmployee(employee);
            }
        });
    }

    public void onClickViewStubButton(View view) {
        if (!binding.employeeAddressStub.isInflated()) {
            binding.employeeAddressStub.getViewStub().inflate();
        }
    }
}
