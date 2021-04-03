package com.nipun.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class BooksAdapter extends ArrayAdapter<BookModel> {

    private ArrayList<BookModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView bookName;
        TextView authorName;
    }

    public BooksAdapter(ArrayList<BookModel> data, Context context) {
        super(context, R.layout.complex_list_view, data);
        this.dataSet = data;
        this.mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        BookModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.complex_list_view, parent, false);
        }

        TextView bookName = (TextView) convertView.findViewById(R.id.bookNameTextView);
        TextView authorName = (TextView) convertView.findViewById(R.id.bookAuthorTextView);
        // Populate the data into the template view using the data object
        bookName.setText(dataModel.name);
        authorName.setText(dataModel.author);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, dataModel.name, Toast.LENGTH_SHORT).show();
            }
        });


        // Return the completed view to render on screen
        return convertView;

    }
}
