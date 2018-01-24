package com.ramadan_apps.recyclerviewanimations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mahmoud Ramadan on 1/23/18.
 */

public class GPAdapter extends GplusAdapter {
    private List<Movie>data;
    private LayoutInflater inflater;

    public GPAdapter(Context context, List data) {
        super(context, data);
        this.data = data;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void bindData(RecyclerView.ViewHolder holder, Object val) {
        Movie movie = (Movie) val;
        MovieViewHolder viewHolder = (MovieViewHolder) holder;

        viewHolder.textView.setText(movie.getName());
        viewHolder.imageView.setImageResource(movie.getResId());
    }

    class MovieViewHolder extends RecyclerView.ViewHolder{
       ImageView imageView;
       TextView textView;
        public MovieViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.movie_image);
            textView = itemView.findViewById(R.id.txt_movie_name);
        }
    }
}
