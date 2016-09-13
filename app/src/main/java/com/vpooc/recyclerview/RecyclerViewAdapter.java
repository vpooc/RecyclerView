package com.vpooc.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ChenYao on 2016/8/14.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<String> data;
    
    public RecyclerViewAdapter(Context context,ArrayList<String> data) {
        this.context=context;
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.item_recyclerview,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(data.get(position)+"");
    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    class  MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.tv);
        }
    }


}
