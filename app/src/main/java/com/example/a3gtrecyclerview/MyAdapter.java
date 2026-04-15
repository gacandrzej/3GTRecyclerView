package com.example.a3gtrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private static final String TAG = "MyAdapter";
    private String[] mDataset;
    private int[] mImages;
    private Context mContext;

    public MyAdapter(Context context, String[] myDataset, int[] images) {
        mDataset = myDataset;
        mImages = images;
        mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;

        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.textView);
            imageView = v.findViewById(R.id.imageView);
        }
    }
}
