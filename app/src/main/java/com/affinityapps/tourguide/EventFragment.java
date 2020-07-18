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

public class EventFragment extends Fragment {

    public EventFragment() {
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
        arrayList.add(new Attraction(R.drawable.ic_event_icon, "Airboat Rides", "Airboat rides through surrounding lakes"));
        arrayList.add(new Attraction(R.drawable.ic_food_icon, "Science Cafe", "Sit eat and talk science"));
        arrayList.add(new Attraction(R.drawable.ic_shows_icon, "Archeology Exhibits", "Display of history and fossils around the museum"));
        arrayList.add(new Attraction(R.drawable.ic_sights_icon, "Scientific Animation", "Animations showing the history of the displays"));
        arrayList.add(new Attraction(R.drawable.ic_tram_icon, "Trailside Bioblitz", "Hiking trails all around the museum"));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
