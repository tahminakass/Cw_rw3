package com.example.cw_rw3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cw_rw3.databinding.CarItemBinding;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<String> carList;
    private ArrayList<String> imageList;

    public CarAdapter(ArrayList<String> carList, ArrayList<String> imageList) {
        this.carList = carList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(CarItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.onBind(carList.get(position), imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
