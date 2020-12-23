package com.example.list;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewerAdapter extends RecyclerView.Adapter<RecycleViewerAdapter.ViewHolder>{
    private Context context;
    private List<Country> countryList;

    public RecycleViewerAdapter(Context context, List<Country> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    public RecycleViewerAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = countryList.get(position);

        holder.rowName.setText(country.getName());
        holder.rowArea.setText(country.getArea() + " km²");
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView rowName;
        public TextView rowArea;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            rowName = itemView.findViewById(R.id.rowName);
            rowArea = itemView.findViewById(R.id.rowArea);
        }

        @Override
        public void onClick(View v) {
            /*int position = getAdapterPosition();
            Country country = countryList.get(position);
            Intent intent = new Intent(context, MainActivity.class);
            intent.putExtra("name",country.getName());
            intent.putExtra("area", country.getArea());

            if(context instanceof AppCompatActivity){
                ((AppCompatActivity)context).finish();
            }
            context.startActivity(intent);
            notifyDataSetChanged();*/
        }

    }
}