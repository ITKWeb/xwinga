package com.itkweb.xwinga;

import java.util.Set;

import com.itkweb.xwinga.db.XWingDb;
import com.itkweb.xwinga.model.Box;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class XwingMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xwing_main_activity);
        
        //Création d'une instance de ma classe LivresBDD
        XWingDb boxesBdd = new XWingDb(this);
        Set<Box> boxes = boxesBdd.getAllBoxes();

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.xwing_main, menu);
        return true;
    }
    
}
