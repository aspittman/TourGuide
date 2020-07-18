package com.affinityapps.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
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
        arrayList.add(new Attraction(R.drawable.ic_event_icon, "Campus grounds", "Fun place to longboard and sightsee"));
        arrayList.add(new Attraction(R.drawable.ic_food_icon, "Huntsman Stadium", "Where they have college sports games"));
        arrayList.add(new Attraction(R.drawable.ic_shows_icon, "Library", "Campus library where they have 3D printing lab"));
        arrayList.add(new Attraction(R.drawable.ic_sights_icon, "Skiing", "Ski resorts around campus for students and tourists"));
        arrayList.add(new Attraction(R.drawable.ic_tram_icon, "Redline tram", "Tram which takes you all around campus"));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
