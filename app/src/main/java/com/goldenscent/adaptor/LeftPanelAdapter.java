package com.goldenscent.adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.goldenscent.R;
import com.goldenscent.modal.MainCategory;

import java.util.List;


public class LeftPanelAdapter extends RecyclerView.Adapter<LeftPanelAdapter.MyViewHolder> implements View.OnClickListener {

    private List<MainCategory> moviesList;
    private ImageView curSelectedView;
    private Context context;

    public LeftPanelAdapter(Context context, List<MainCategory> moviesList) {

        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_left_item, parent, false);
        itemView.setOnClickListener(this);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainCategory item = moviesList.get(position);
        holder.title.setText(item.getTitle());
        holder.iconImg.setImageResource(item.getImgResId());
        if (position == 0) {
            holder.selectorImg.setBackgroundColor(context.getResources().getColor(R.color.black));
        }
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView iconImg;
        public ImageView selectorImg;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            iconImg = (ImageView) view.findViewById(R.id.list_item_genre_icon);
            selectorImg = (ImageView) view.findViewById(R.id.card_selector_img);
        }

    }
}