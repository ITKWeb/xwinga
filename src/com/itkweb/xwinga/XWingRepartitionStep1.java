package com.itkweb.xwinga;

import java.util.Set;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.itkweb.xwinga.db.XWingDb;
import com.itkweb.xwinga.model.Box;

public class XWingRepartitionStep1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xwing_repartition_step1);

		// Cr�ation d'une instance de ma classe LivresBDD
		XWingDb boxesBdd = new XWingDb(this);
		Set<Box> boxes = boxesBdd.getAllBoxes();

		for (Box box : boxes) {
			int imageResource = getResources().getIdentifier(
					box.getPicture(), "drawable",
					getPackageName());

			Drawable image = getResources().getDrawable(imageResource);
			
			image.getBounds();
		}

		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(R.menu.xwing_repartition_activity_step1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
