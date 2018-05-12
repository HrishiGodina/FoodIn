package com.example.hrishi.foodin.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hrishi.foodin.R;

import java.util.List;

/**
 * Created by hp on 08-03-2018.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private Context mCtx;
    private List<Order> orderList;

    public OrderAdapter(Context mCtx, List<Order> orderList) {
        this.mCtx = mCtx;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_confirmation, null);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {

        Order order = orderList.get(position);

        holder.textViewItem.setText(order.getItem());
        holder.textViewCost.setText(String.valueOf(order.getCost()));
        holder.textViewCount.setText(String.valueOf(order.getCount()));

    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    class OrderViewHolder extends RecyclerView.ViewHolder{
        TextView textViewItem, textViewCount, textViewCost;


        public OrderViewHolder(View itemView) {
            super(itemView);

            textViewItem = itemView.findViewById(R.id.item_confirmed);
            textViewCost = itemView.findViewById(R.id.cost_confirmed);
            textViewCount = itemView.findViewById(R.id.count_confirmed);

        }
    }
}
