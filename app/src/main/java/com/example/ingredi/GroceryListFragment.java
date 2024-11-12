package com.example.ingredi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;  // Import Fragment class

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GroceryListFragment extends Fragment {

    private FloatingActionButton fabMain, fabClearAll, fabAddItem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grocery_list, container, false);

        // Floating Action Buttons
        fabMain = view.findViewById(R.id.fab_main);
        fabClearAll = view.findViewById(R.id.fab_clear_all);
        fabAddItem = view.findViewById(R.id.fab_add_item);

        // Expand/collapse additional options
        fabMain.setOnClickListener(v -> {
            if (fabClearAll.getVisibility() == View.VISIBLE) {
                fabClearAll.setVisibility(View.GONE);
                fabAddItem.setVisibility(View.GONE);
            } else {
                fabClearAll.setVisibility(View.VISIBLE);
                fabAddItem.setVisibility(View.VISIBLE);
            }
        });

        // Set up listeners for options
        fabClearAll.setOnClickListener(v -> clearCheckedItems());
        fabAddItem.setOnClickListener(v -> addItem());

        return view;
    }

    private void clearCheckedItems() {
        // Logic to clear checked items in the list
    }

    private void addItem() {
        // Logic to add a new item to the list
    }
}
