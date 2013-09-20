package com.orion.android.splashscreen;

import com.orion.android.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Activity_Splashscreen extends Activity 
{
	/******************************************************************************************/
	/*************************************** ATTRIBUTS ****************************************/
	/******************************************************************************************/
	
	/**
	 * Log Tag
	 */
	private final static String TAG = "SPLASHSCREEN";
	
	/**
	 * Debug Mode
	 */
	private final static Boolean DEBUG = true;
	
	/**
	 * Active SplashScreen
	 */
//	protected boolean _active = true;
	
	/**
	 * Time to display the SplashScreen
	 */
	protected int _splashTime = 5000;
	
	/**
	 * The Thread to display the SplashScreen
	 */
	private Thread splashThread;
	
	/**
	 * ResultCode SplashScreen finished
	 */
	public final static int RESULT_CODE_SPLASHSCREEN_FINISHED = 10;
	
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
        
        // XML
        setContentView(R.layout.main_splash);
        
        // Splash Thread
        splashThread = new Thread() 
        {
        	/** run **/
            @Override
            public void run() 
            {
                try 
                {
                	if(DEBUG) Log.i(TAG, "start the splascreen view");
                    
                	int waited = 0;
                	while(waited < _splashTime) 
                    {
                        sleep(100);
                        
                        waited += 100;
                        if(DEBUG) Log.i(TAG, "+100ms, waited=" + waited);
                        
                    }
                } 
                catch(InterruptedException e) 
                {
                    if(DEBUG) Log.e(TAG, "InterruptedException", e);
                } 
                finally
                {
                	if(DEBUG) Log.i(TAG, "close the splascreen view");
                    setResult(RESULT_CODE_SPLASHSCREEN_FINISHED);
                	finish();
                }
            }
        };
        splashThread.start();
    }
    
    /**
     * OnBackPressed
     */
    @Override
    public void onBackPressed() 
    {
    	if(DEBUG) Log.i(TAG, "onBackPressed");
    }
    
    /**
     * OnPause
     */
    @Override
    protected void onPause() 
    {
    	if(DEBUG) Log.i(TAG, "OnPause");
    	super.onPause();
    }
    
    /**
     * OnDestroy
     */
    @Override
    protected void onDestroy() 
    {
    	splashThread.interrupt();
    	if(DEBUG) Log.i(TAG, "interrupt the splash thread");
    	
    	if(DEBUG) Log.i(TAG, "onDestroy");
    	super.onDestroy();
    }
    
}