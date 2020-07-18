package com.affinityapps.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class OutdoorFragment extends Fragment {

    public OutdoorFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.attraction_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = (ListView) view.findViewById(R.id.list);
        ArrayList<Attraction> arrayList = new ArrayList<>();
        arrayList.add(new Attraction(R.drawable.ic_event_icon, R.string.outdoor_one, R.string.outdoor_six));
        arrayList.add(new Attraction(R.drawable.ic_food_icon, R.string.outdoor_two, R.string.outdoor_seven));
        arrayList.add(new Attraction(R.drawable.ic_shows_icon, R.string.outdoor_three, R.string.outdoor_eight));
        arrayList.add(new Attraction(R.drawable.ic_sights_icon, R.string.outdoor_four, R.string.outdoor_nine));
        arrayList.add(new Attraction(R.drawable.ic_tram_icon, R.string.outdoor_five, R.string.outdoor_ten));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
