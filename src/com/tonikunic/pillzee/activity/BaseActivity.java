package com.tonikunic.pillzee.activity;

import com.tonikunic.pillzee.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public abstract class BaseActivity extends Activity {
	
	protected AnimationImplementor animationStarter = new AnimationImplementor();
	
	protected void togoView(Intent viewIntent) {
		startActivity(viewIntent);
		bottomupActivityAnimaiton();
	}
	
	/* Font Methods */
	public void typeFaceConstructor(TextView textView, String fontPath) {
		Typeface customTypeface = Typeface.createFromAsset(getAssets(), fontPath);
		textView.setTypeface(customTypeface);
	}
	
	/* Animation Classes and Methods */
	public class AnimationImplementor {
		
		public void animationStarter(View view, int animationId) {
			view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), animationId));
		}		
		
	}
	
	protected void bottomupActivityAnimaiton() {
		overridePendingTransition(R.anim.activity_bottomup_enter, R.anim.activity_bottomup_exit);
	}
	// End of Animation Classes and Methods //
	
}
