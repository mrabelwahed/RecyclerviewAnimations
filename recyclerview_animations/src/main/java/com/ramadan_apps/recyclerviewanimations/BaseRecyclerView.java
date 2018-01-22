package com.ramadan_apps.recyclerviewanimations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Mahmoud Ramadan on 1/22/18.
 */

public abstract class BaseRecyclerView<T>  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<T> data;
    private Context context ;

    public BaseRecyclerView(Context context , List<T> data){
        this.context = context;
        this.data = data;
        defineInterpolator();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return setViewHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         onBindData(holder,data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public T getItem(int position){
        return data.get(position);
    }

    public  abstract RecyclerView.ViewHolder setViewHolder(ViewGroup parent , int viewType);

    public abstract  void  defineInterpolator();

    public abstract  void onBindData(RecyclerView.ViewHolder holder , T val);

}
