package com.example.cw_rw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cw_rw3.databinding.CarItemBinding;
import com.example.cw_rw3.databinding.FragmentRVBinding;

import java.util.ArrayList;

public class RVFragment extends Fragment {

    FragmentRVBinding binding;
    private ArrayList<String> carList = new ArrayList<>();
    private ArrayList<String> imageList = new ArrayList<>();
    private CarAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRVBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
         adapter = new CarAdapter(carList, imageList);
        binding.rvView.setAdapter(adapter);
    }

    private void loadData() {
        carList.add("BMW");
       imageList.add("https://www.bmwusa.com/content/dam/bmw/common/limited-edition/2024/soc25/m4-cs/BMW-LimitedEdition-M4-CSL-all.jpg.bmwimg.small.jpg");

        carList.add("Mercedez");
        imageList.add("https://www.ixbt.com/img/n1/news/2023/9/0/mercedes-amg-g63-grand-edition_large.jpg");

        carList.add("Ferrari");
        imageList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSb-tOZfk_niH5JATOpWxAALMtLDXfiSdn9MaQjQpOA1PclABQ1pLGFa4pBIx7usxoSv1s&usqp=CAU");

        carList.add("Chevrolet");
        imageList.add("https://www.motortrend.com/uploads/sites/10/2024/01/2024-chevrolet-suburban-z71-awd-suv-angular-front.png");
    }
}