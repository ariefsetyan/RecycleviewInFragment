package com.example.arief.recycleviewinfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    Context mContext;
    List<Contact>mData;

    public RecycleViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_contact,viewGroup,false);
        ViewHolder vHolder = new ViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText(mData.get(i).getName());
        viewHolder.tv_phone.setText(mData.get(i).getPhone());
        viewHolder.img.setImageResource(mData.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=(TextView)itemView.findViewById(R.id.name_contact);
            tv_phone=(TextView)itemView.findViewById(R.id.phone_number);
            img=(ImageView) itemView.findViewById(R.id.img_contact);
        }
    }
}
