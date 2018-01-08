package com.qoobico.getparty.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qoobico.getparty.R;
import com.qoobico.getparty.dto.EventDTO;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by George Omega on 09.01.2018.
 */

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder>{
    private List<EventDTO> data;

    public EventListAdapter(List<EventDTO> data) {
        this.data = data;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item,parent,false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        EventDTO item=data.get(position);
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView title;
        public EventViewHolder(View itemView) {

            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cardView);
            title=(TextView)itemView.findViewById(R.id.title);
        }
    }
}
