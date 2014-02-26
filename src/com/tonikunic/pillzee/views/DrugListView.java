package com.tonikunic.pillzee.views;

import com.tonikunic.pillzee.R;
import com.tonikunic.pillzee.activity.ListAdapterActivity;

import android.os.Bundle;

public class DrugListView extends ListAdapterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drug_list_view);
    }
    
}