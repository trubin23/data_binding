package ru.trubin23.data_binding.ninth_activity;

import android.support.v7.widget.RecyclerView;

import ru.trubin23.data_binding.databinding.ActivityNinthItemBinding;

public class EmployeeHolder extends RecyclerView.ViewHolder {

    private ActivityNinthItemBinding mBinding;

    public EmployeeHolder(ActivityNinthItemBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public void bind(Employee employee) {
        mBinding.setEmployee(employee);
        mBinding.executePendingBindings();
    }
}
