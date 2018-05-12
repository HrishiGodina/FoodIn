package com.example.hrishi.foodin.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.hrishi.foodin.R;

import java.util.List;

/**
 * Created by hp on 08-03-2018.
 */

public class ItemAdapter  extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private int value;

    private Context mCtx;
    private List<Item> itemList;
    public Item item;



    public interface OnItemClickListener {
        void onItemClick(Item item, int value, int t);
    }

    private final OnItemClickListener listener;

    public ItemAdapter(Context mCtx, List<Item> productList, OnItemClickListener listener) {
        this.mCtx = mCtx;
        this.itemList = productList;
        this.listener = listener;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.child_item, null);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(itemList.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    Button btnPlus, btnMinus;


    class ItemViewHolder extends RecyclerView.ViewHolder{

        TextView textViewItem, textViewCount, textViewCost;
        Item item;


        private ItemViewHolder(View itemView) {
            super(itemView);

            textViewItem = itemView.findViewById(R.id.item);
            textViewCount = itemView.findViewById(R.id.count);
            textViewCost = itemView.findViewById(R.id.cost);
            btnPlus = itemView.findViewById(R.id.add_item);
            btnMinus = itemView.findViewById(R.id.remove_item);
        }

            public void bind(final Item item, final OnItemClickListener listener) {

                textViewItem.setText(item.getItem());
                textViewCost.setText(String.valueOf(item.getCost()));
                textViewCount.setText(String.valueOf(item.getCount()));



                btnPlus.setOnClickListener(new View.OnClickListener() {


                    @Override public void onClick(View v) {
                        value = Integer.parseInt((String) textViewCount.getText());
                        value += 1;
                        textViewCount.setText(String.valueOf(value));
                        listener.onItemClick(item, value, 1);

                    }
                });


                btnMinus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        value = Integer.parseInt((String) textViewCount.getText());
                        if (value == 0){
                            return;
                        }
                        else{
                            value -= 1;
                            textViewCount.setText(String.valueOf(value));
                        }
                        listener.onItemClick(item, value, -1);

                    }
                });
            }




        }

}
