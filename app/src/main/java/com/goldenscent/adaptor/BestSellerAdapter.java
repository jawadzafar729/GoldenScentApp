package com.goldenscent.adaptor;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.goldenscent.R;
import com.goldenscent.modal.ItemModal;

import java.util.List;


public class BestSellerAdapter extends RecyclerView.Adapter<BestSellerAdapter.MyViewHolder> implements View.OnClickListener {

    private List<ItemModal> bestSellerList;
    private Context context;

    public BestSellerAdapter(Context context, List<ItemModal> bestSellerList) {

        this.bestSellerList = bestSellerList;
        this.context = context;
    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public BestSellerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.best_seller_item, parent, false);
        itemView.setOnClickListener(this);

        return new BestSellerAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BestSellerAdapter.MyViewHolder holder, int position) {
        ItemModal item = bestSellerList.get(position);
        holder.name.setText(item.getName());
        holder.brand.setText(item.getBrand());

        if(item.getDiscount() != null && !item.getDiscount().equalsIgnoreCase("")){
            /*SpannableString text = new SpannableString(item.getPrice() +" "+ item.getDiscount());
            text.setSpan(new ForegroundColorSpan(Color.RED), item.getPrice().length(), item.getPrice().length() + item.getDiscount().length(), 0);
            text.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.grey_price)), 0, item.getPrice().length(), 0);
            text.setSpan(new StrikethroughSpan(), 0, item.getPrice().length(), 0);
            holder.price.setText(text, TextView.BufferType.SPANNABLE);*/
        holder.priceDis.setVisibility(View.VISIBLE);
        holder.priceDis.setText(item.getDiscount());
        holder.price.setText(item.getPrice());
        holder.price.setTextColor(context.getResources().getColor(R.color.grey_price));
        holder.price.setPaintFlags(holder.price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        }else{
            holder.price.setText(item.getPrice());
            holder.priceDis.setVisibility(View.GONE);
        }


        holder.price.setText(item.getPrice());
        holder.iconImg.setImageResource(item.getImgResId());
        holder.iconImg.setImageResource(item.getImgResId());

        if(position == bestSellerList.size()-1){
            holder.divider.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return bestSellerList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView brand;
        public TextView price;
        public TextView priceDis;
        public ImageView iconImg;
        public Button addBtn;
        public View divider;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.item_name);
            iconImg = (ImageView) view.findViewById(R.id.item_main_img);
            brand = (TextView) view.findViewById(R.id.item_brand);
            price = (TextView) view.findViewById(R.id.item_price);
            priceDis = (TextView) view.findViewById(R.id.item_dis_price);
            addBtn = (Button) view.findViewById(R.id.add_button);
            divider = (View) view.findViewById(R.id.divider_view);
        }

    }
}