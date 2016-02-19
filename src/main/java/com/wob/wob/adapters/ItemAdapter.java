package com.wob.wob.adapters;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.wob.wob.API.API;
import com.wob.wob.R;
import com.wob.wob.model.ConverterModel;
import com.wob.wob.model.Item;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Tal on 23/06/2015.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> items;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitleView;
        public TextView mChannelTitleView;
        public ViewHolder(View v) {
            super(v);
            mTitleView = (TextView) v.findViewById(R.id.item_title);
            mChannelTitleView = (TextView) v.findViewById(R.id.item_channelTitle);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your data set at this position
        // - replace the contents of the view with that element
        //
        final Item item = items.get(position);
        holder.mTitleView.setText(item.getSnippet().getTitle());
        holder.mChannelTitleView.setText(item.getSnippet().getChannelTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                final String videoId = item.getId().getVideoId();
                final String videoTitle = item.getSnippet().getTitle();
                String convertUrl = "http://wwww.youtube.com/watch?v=".concat(videoId);
                API.getInstance().getApi().convertVideo("JSON", convertUrl, new Callback<ConverterModel>() {
                    @Override
                    public void success(ConverterModel converterModel, Response response) {
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(converterModel.getLink()));
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, videoTitle.concat(".mp3").replace("/", ""));
                        DownloadManager manager = (DownloadManager) v.getContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        manager.enqueue(request);
                        Toast.makeText(v.getContext(),"Downloading Your Song!", Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d("Tal", error.getMessage());
                    }
                });
            }
        });
    }

    // Return the size of your data set (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return items.size();
    }

}
