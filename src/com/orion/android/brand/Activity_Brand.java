package com.orion.android.brand;

import com.orion.android.R;
import com.orion.android.code.ActivityCode;
import com.orion.android.util.Orion_Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_Brand extends Activity 
{
	/******************************************************************************************/
	/*************************************** CONSTANTES ***************************************/
	/******************************************************************************************/
	
	/**
	 * Log Tag
	 */
	private final static String TAG = "Activity_Brand";
	
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
	
	/**
	 * BRAND URL
	 */
	private String brand_url = "";
	
	/**
	 * BRAND TIME
	 */
	private String brand_time = "";
	
	
	
	/**
	 * Time to display the SplashScreen
	 */
	protected static int _splashTime = 0;
	
	/**
	 * Button cross
	 */
	private Button btn_cross;
	
	/**
	 * Thread Brand
	 */
	private Thread brandThread;
	
	/**
	 * Brand Image View
	 */
	private ImageView brandImg;
	
//	/**
//	 * Bitmap Image
//	 */
//	private static Bitmap bm;
//	
//	/**
//	 * Handler
//	 */
//	private static Handler mHandler = new Handler();
	
	
	/******************************************************************************************/
	/************************************ ANDROID METHODS *************************************/
	/******************************************************************************************/
	
	/**
	 * OnCreate
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	// Log
    	if(DEBUG) Log.i(TAG, "onCreate");
    	
    	// Super
        super.onCreate(savedInstanceState);
        
        // XML
        setContentView(R.layout.brand);
        
        // Intent
        intent = this.getIntent();
        
        // Brand URL
        if(intent != null)
        {
        	brand_url = Orion_Bundle.getBundle(intent, Orion_Bundle.BRAND_URL);
        	if(DEBUG) Log.i(TAG, "brand url = " + brand_url);
        }
        else
        {
        	if(DEBUG) Log.i(TAG, "intent is null");
        }
        
        // Brand TIME
        if(intent!=null)
        {
	        brand_time = Orion_Bundle.getBundle(intent, Orion_Bundle.BRAND_TIME);
	    	
			if(brand_time != null && !"".equals(brand_time))
			{
				try
				{
					_splashTime = Integer.parseInt(brand_time);
				}
				catch(NumberFormatException e)
				{
					if(DEBUG) Log.i(TAG, "NumberFormatException _splashtime");
					_splashTime = 0;
				}
			}
			else
			{
				_splashTime = 0;
			}
			if(DEBUG) Log.i(TAG, "brand time = " + _splashTime);
        }
        
        
        // Button Close Ad
        btn_cross = (Button) findViewById(R.id.Cross);
        if(btn_cross != null)
        {
	        btn_cross.setOnClickListener(new OnClickListener() 
	        {
				public void onClick(View v) 
				{
					if(DEBUG) Log.i(TAG, "CLic sur bouton cross");
					Activity_Brand.this.setResult(ActivityCode.RESULT_CODE_BRAND_FINISHED);
					Activity_Brand.this.finish();
				}
			});
        }
        else
        {
        	if(DEBUG) Log.i(TAG, "btn_cross is null");
        }
        
        // Timer
		brandThread = new Thread() 
        {
        	/** run **/
            @Override
            public void run() 
            {
                try 
                {
                	if(DEBUG) Log.i(TAG, "start the brand view");
                    
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
                	if(DEBUG) Log.i(TAG, "close the brand view");
                	Activity_Brand.this.setResult(ActivityCode.RESULT_CODE_BRAND_FINISHED);
                	Activity_Brand.this.finish();
                }
            }
        };
		brandThread.start();
		
		// BrandImg
	    brandImg = (ImageView) findViewById(R.id.BrandImg);
	    if(brandImg != null)
	    {
	    	brandImg.setImageResource(R.drawable.pub_palais);
	    	
//		    new Thread(new Runnable() 
//		    {
//				public void run() 
//				{
//					if(brand_url != null && !"".equals(brand_url))
//					{		
//						bm = Orion_Http.getBitmap(Activity_Brand.this, brand_url);
//					
//						mHandler.post(new Runnable() 
//						{
//							public void run() 
//							{
//								if(DEBUG) Log.i(TAG, "click on the cross");
//								brandImg.setImageBitmap(bm);
//							}
//						});
//					}
//					else
//					{
//						
//					}
//				}
//		    }).start();
	    }
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
    	brandThread.interrupt();
    	if(DEBUG) Log.i(TAG, "interrupt the brand thread");
    	
    	if(DEBUG) Log.i(TAG, "onDestroy");
    	super.onDestroy();
    }
}
