package com.itkweb.xwinga;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.media.MediaPlayer;


public class XwingMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // public static MediaPlayer create (Context context, int resid)
        MediaPlayer music = MediaPlayer.create(this, R.raw.imperialmarch);
        music.setVolume(100, 100);
        music.start();
        
        setContentView(R.layout.xwing_main_activity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.xwing_main, menu);
        return true;
    }
    
    public void start_repartition(View view) {
    	
    	Intent intent = new Intent(this, XWingRepartitionStep1.class);
        startActivity(intent);
        
        
    }
    
}
