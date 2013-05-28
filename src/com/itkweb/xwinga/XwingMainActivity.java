package com.itkweb.xwinga;


import java.util.Set;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.itkweb.xwinga.db.XWingDb;
import com.itkweb.xwinga.model.Box;

public class XwingMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xwing_main_activity);
        
        //Cr�ation d'une instance de ma classe LivresBDD
        XWingDb boxesBdd = new XWingDb(this);
        Set<Box> boxes = boxesBdd.getAllBoxes();

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.xwing_main, menu);
        return true;
    }
    
    public void start_repartition(View view) {
    	
    	Intent intent = new Intent(this, XWingRepartitionActivityStep1.class);
//    	EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    	
        // Do something in response to button
    }
    
}
