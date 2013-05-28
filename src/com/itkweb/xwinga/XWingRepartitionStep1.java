package com.itkweb.xwinga;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.itkweb.xwinga.db.XWingDb;
import com.itkweb.xwinga.model.Box;


public class XWingRepartitionStep1 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xwing_repartition_step1);

		ListView listView1 = (ListView) findViewById(R.id.listBoxes);

		// Creation d'une instance de ma classe LivresBDD
		XWingDb boxesBdd = new XWingDb(this);
		List<Box> boxes = boxesBdd.getAllBoxes();
		ArrayAdapter<Box> adapter = new ArrayAdapter<Box>(this,
				android.R.layout.simple_list_item_1, boxes);

		listView1.setAdapter(adapter);

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
	
	
	public void backMainMenu(View view) {
    	Intent intent = new Intent(this, XwingMainActivity.class);
        startActivity(intent);
    }
	
	public void toBeContinued(View view) {
		Intent intent = new Intent(this, XWingRepartitionStep2.class);
		startActivity(intent);
	}

}
