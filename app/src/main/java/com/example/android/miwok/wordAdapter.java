package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;
import static android.R.attr.text;

/**
 * Created by User on 11/9/2016.
 */

public class wordAdapter extends ArrayAdapter<word> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public wordAdapter(Activity context, ArrayList<word> words, int colorResourceId){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        word currentWord = getItem(position);


        //
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        //
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        //
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        //
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()){
            // Set the ImageVie to the image resource specified in the current word
            imageView.setImageResource(currentWord.getImageResourceId());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // Otherwise hide the imageView (set the visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        //return the whole list item layout (containing 2 TextViews) so that it can be shown in the list
        return listItemView;
    }
}
