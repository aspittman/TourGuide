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
        arrayList.add(new Attraction("Play Song >", "Light Years Away", "Oliver"));
        arrayList.add(new Attraction("Play Song >", "Okay", "Shiba San"));
        arrayList.add(new Attraction("Play Song >", "Summertime Sadness", "Lana Del Ray"));
        arrayList.add(new Attraction("Play Song >", "Years", "Alesso feat. Matthew Koma"));
        arrayList.add(new Attraction("Play Song >", "Voicemail", "Green Velvet & Patrick Topping"));
        arrayList.add(new Attraction("Play Song >", "Time for us", "Nicolas Jaar"));
        arrayList.add(new Attraction("Play Song >", "Good Enough", "Alice Wonderland"));
        arrayList.add(new Attraction("Play Song >", "BTSTU", "Jai Paul"));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
