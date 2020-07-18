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
        arrayList.add(new Attraction(R.drawable.citycreek_fountain, R.string.downtown_one, R.string.downtown_six));
        arrayList.add(new Attraction(R.drawable.mall_entrance, R.string.downtown_two, R.string.downtown_seven));
        arrayList.add(new Attraction(R.drawable.citycreek_shopping, R.string.downtown_three, R.string.downtown_eight));
        arrayList.add(new Attraction(R.drawable.citycreek_second_floor, R.string.downtown_four, R.string.downtown_nine));
        arrayList.add(new Attraction(R.drawable.citycreek_tram, R.string.downtown_five, R.string.downtown_ten));

        AttractionListAdapter adapter = new AttractionListAdapter(getActivity(), arrayList);

        listView.setAdapter(adapter);
    }
}
