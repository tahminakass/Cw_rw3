package com.example.cw_rw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cw_rw3.databinding.FragmentFirstFragmentBinding;

public class FirstFragmentFragment extends Fragment {

    FragmentFirstFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.tvOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvOne.setText("1");
            }
        });
        binding.tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvTwo.setText("2");
            }
        });
        binding.tvThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvThree.setText("3");
            }
        });
        binding.tvFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvFour.setText("4");
            }
        });

        binding.tvFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvFive.setText("5");
            }
        });

        binding.tvSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvSix.setText("6");
            }
        });
    }
}