package com.ramadan_apps.recyclerviewanimations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;

import java.util.List;

/**
 * Created by Mahmoud Ramadan on 1/23/18.
 */

public abstract  class GplusAdapter extends BaseRecyclerView {
    private DecelerateInterpolator interpolator;
    private int lastPostion =-1;
    private Context context ;

    public GplusAdapter(Context context, List data) {
        super(context, data);
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder setViewHolder(ViewGroup parent, int viewType) {
        return getViewHolder(parent,viewType);
    }

    @Override
    public void defineInterpolator() {
       interpolator = new DecelerateInterpolator();
    }

    @Override
    public void onBindData(RecyclerView.ViewHolder holder, Object val ,int position) {

        Animation animation = AnimationUtils.loadAnimation(context,
                (position > lastPostion) ? R.anim.up_from_bottom:R.anim.down_from_top);
        lastPostion = position;
        holder.itemView.startAnimation(animation);

        bindData(holder,val);

    }

    @Override
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.itemView.clearAnimation();
    }

    public abstract RecyclerView.ViewHolder getViewHolder(ViewGroup parent , int viewType);

    public abstract void bindData(RecyclerView.ViewHolder holder , Object val);
}
