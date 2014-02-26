package com.tonikunic.pillzee.views;

import com.tonikunic.pillzee.R;
import com.tonikunic.pillzee.activity.ListAdapterActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class DrugListView extends ListAdapterActivity implements OnClickListener {
	
	private ImageView newDrugBtn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drug_list_view);
        
        newDrugBtn = (ImageView) findViewById(R.id.addBtn);
        newDrugBtn.setOnClickListener(this);
    }
    
    /* OnClickListener */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.addBtn:
			animationStarter.animationStarter(newDrugBtn, R.anim.button_click);
			Intent newDrugViewIntent = new Intent(DrugListView.this, NewDrugView.class);
			togoView(newDrugViewIntent);
			break;

		default:
			break;
		}
	}
	    
}