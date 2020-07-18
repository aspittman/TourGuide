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
        arrayList.add(new Attraction(R.drawable.ic_event_icon, R.string.historical_one, R.string.historical_six));
        arrayList.add(new Attraction(R.drawable.ic_food_icon, R.string.historical_two, R.string.historical_seven));
        arrayList.add(new Attraction(R.drawable.ic_shows_icon, R.string.historical_three, R.string.historical_eight));
        arrayList.add(new Attraction(R.drawable.ic_sights_icon, R.string.historical_four, R.string.historical_nine));
        arrayList.add(new Attraction(R.drawable.ic_tram_icon, R.string.historical_five, R.string.historical_ten));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
