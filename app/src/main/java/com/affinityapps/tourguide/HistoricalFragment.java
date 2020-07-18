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

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
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
        arrayList.add(new Attraction(R.drawable.ic_event_icon, "Salt Lake Temple", "Historical landmark of the LDS church"));
        arrayList.add(new Attraction(R.drawable.ic_food_icon, "JB's restaurant", "Buffet that's right around the corner"));
        arrayList.add(new Attraction(R.drawable.ic_shows_icon, "Gateway", "Mall center with theaters and museums"));
        arrayList.add(new Attraction(R.drawable.ic_sights_icon, "LDS tabernacle", "Where the chore for the LDS church sings"));
        arrayList.add(new Attraction(R.drawable.ic_tram_icon, "Temple grounds", "Lots of museums and connections to various locations"));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
