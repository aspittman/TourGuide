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

public class DowntownFragment extends Fragment {

    public DowntownFragment() {
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
        arrayList.add(new Attraction(R.drawable.citycreek_fountain, "City Creek Fountain", "Displays water and fire shows in shopping center"));
        arrayList.add(new Attraction(R.drawable.mall_entrance, "Mall Entrance", "Plenty of food vendors around the mall"));
        arrayList.add(new Attraction(R.drawable.citycreek_shopping, "Mall Stores", "Plenty of stores in the mall to choose from"));
        arrayList.add(new Attraction(R.drawable.citycreek_second_floor, "Mall Overpass", "Mall contains bridge connection one end to the other"));
        arrayList.add(new Attraction(R.drawable.citycreek_tram, "City Creek Tram", "Tram under the bridge gives access to both entrances"));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
