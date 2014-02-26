package com.tonikunic.pillzee.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.tonikunic.pillzee.R;
import com.tonikunic.pillzee.activity.BaseActivity;

public class NewDrugView extends BaseActivity implements OnClickListener {
	
	private ImageView saveDrugBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_drug_view);
		
		/* TODO This button should be disabled until the prereqs are complete */
		saveDrugBtn = (ImageView) findViewById(R.id.saveBtn);
		saveDrugBtn.setOnClickListener(this);
	}
	
	/* OnClick Listener */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.saveBtn:
			animationStarter.animationStarter(saveDrugBtn, R.anim.button_click);
			Intent drugListViewIntent = new Intent(NewDrugView.this, DrugListView.class);
			togoView(drugListViewIntent);
			break;

		default:
			break;
		}
	}
	
}
