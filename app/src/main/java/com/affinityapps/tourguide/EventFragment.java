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
        arrayList.add(new Attraction(R.drawable.ic_event_icon, "Light Years Away", "Oliver"));
        arrayList.add(new Attraction(R.drawable.ic_food_icon, "Okay", "Shiba San"));
        arrayList.add(new Attraction(R.drawable.ic_shows_icon, "Summertime Sadness", "Lana Del Ray"));
        arrayList.add(new Attraction(R.drawable.ic_sights_icon, "Years", "Alesso feat. Matthew Koma"));
        arrayList.add(new Attraction(R.drawable.ic_tram_icon, "Voicemail", "Green Velvet & Patrick Topping"));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
