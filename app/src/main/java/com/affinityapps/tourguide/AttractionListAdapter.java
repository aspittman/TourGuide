package com.affinityapps.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AttractionListAdapter extends ArrayAdapter<Attraction> {

 //   private int mColorResourceId;

    public AttractionListAdapter(Context context, ArrayList<Attraction> words) {
        super(context, 0, words);
    //    mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_list_item, parent, false);
        }

        Attraction attraction = getItem(position);
        ImageView attractionImage = (ImageView) listItemView.findViewById(R.id.guide_image);
        TextView attractionDescription = (TextView) listItemView.findViewById(R.id.guide_text_view);

        assert attraction != null;
        attractionImage.setImageResource(attraction.getGuideImage());

        attractionDescription.setText(attraction.getGuideText());

        return listItemView;
    }
}