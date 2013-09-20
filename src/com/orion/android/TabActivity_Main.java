package com.orion.android;

import com.orion.android.brand.Activity_Brand;
import com.orion.android.code.ActivityCode;
import com.orion.android.splashscreen.Activity_Splashscreen;
import com.orion.android.util.Orion_Bundle;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class TabActivity_Main extends TabActivity implements OnTabChangeListener 
{
	/******************************************************************************************/
	/*************************************** CONSTANTES ***************************************/
	/******************************************************************************************/
	
	/**
	 * Log Tag
	 */
	private final static String TAG = "MerciQuiActivity";
	
	/**
	 * Debug Mode
	 */
	private final static Boolean DEBUG = true;
	
	/******************************************************************************************/
	/*************************************** ATTRIBUTS ****************************************/
	/******************************************************************************************/
	
	/**
	 * Intent
	 */
	private Intent intent;
	
	/***************************************** BRAND ******************************************/
	
	/**
	 * URL
	 */
	private String brand_url = "http://www.thibaultvachias.com/orion/pub_ex.png";
	
	/**
	 * TIME
	 */
	private String brand_time = "4000";
	
	
	/**
	 * TabHost
	 */
	private TabHost tabHost;
	
	/**
	 * TabSpec
	 */
	private TabHost.TabSpec spec;
	
	/******************************************************************************************/
	/************************************ ANDROID METHODS *************************************/
	/******************************************************************************************/
	
    /**
     * OnCreate
     */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	// Super
        super.onCreate(savedInstanceState);
        
        // Start The SplashScreen 
        intent = new Intent(TabActivity_Main.this, Activity_Splashscreen.class);
        startActivityForResult(intent, ActivityCode.REQUEST_CODE_SPLASHSCREEN);
        overridePendingTransition(R.anim.fadein_0500, R.anim.fadeout_0500);
    
        // XML
        setContentView(R.layout.main);
    }
    
    /**
     * OnActivityResult
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) 
    {
    	super.onActivityResult(requestCode, resultCode, data);
    	
    	if(requestCode == ActivityCode.REQUEST_CODE_SPLASHSCREEN)
    	{
    		if(resultCode == ActivityCode.RESULT_CODE_SPLASHSCREEN_FINISHED)
    		{
    			if(DEBUG) Log.i(TAG, "Retour splashscreen Ok");
    			
    			intent = new Intent(this, Activity_Brand.class);
    			intent.putExtra(Orion_Bundle.BRAND_URL, brand_url);
    			intent.putExtra(Orion_Bundle.BRAND_TIME, brand_time);
    	        startActivityForResult(intent, ActivityCode.REQUEST_CODE_BRAND);
    	        overridePendingTransition(R.anim.fadein_1500, R.anim.fadeout_1500);
    		}
    	}
    	else if(requestCode == ActivityCode.REQUEST_CODE_BRAND)
    	{
    		if(resultCode == ActivityCode.RESULT_CODE_BRAND_FINISHED)
    		{
    			if(DEBUG) Log.i(TAG, "Retour brand Ok");
    			
    			//intent = new Intent(this, TabActivity_Region.class);
    	        //startActivityForResult(intent, ActivityCode.REQUEST_CODE_DOMAINES);
    	        //overridePendingTransition(R.anim.fadein_1500, R.anim.fadeout_1500);
    			
    	        // TabHost
    	        tabHost = getTabHost();
    	        tabHost.setOnTabChangedListener(this);
    			
    			intent = new Intent().setClass(this, Activity_Pivot.class);
    	        spec = tabHost.newTabSpec("").setIndicator("", getResources().getDrawable(R.drawable.tab_ic_domaines)).setContent(intent);	
    	        tabHost.addTab(spec);
    	        //tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.tab_background_domaines_off);
    	        
    		}
    	}
    	else if(requestCode == ActivityCode.REQUEST_CODE_DOMAINES)
    	{
    		if(resultCode == ActivityCode.RESULT_CODE_CLOSE_APP)
    		{
    			finish();
    		}
    	}
    }

    /**
     * OnTabChanged
     */
	public void onTabChanged(String tabId) 
	{
		// Nothing to do	
	}
}