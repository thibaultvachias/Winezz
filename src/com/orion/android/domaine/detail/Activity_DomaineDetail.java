package com.orion.android.domaine.detail;

import com.orion.android.R;
import com.orion.android.beans.Domaine;
import com.orion.android.code.ActivityCode;
import com.orion.android.region.domaines.DomainesAdapter.MyCustomAdapterListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

/**
 * Activity DomaineDetail
 * 
 * @author Thibault Vachias
 * @since 02/10/2012
 *
 */
public class Activity_DomaineDetail extends Activity
{
	/******************************************************************************************/
	/************************************** CONSTANTES ****************************************/
	/******************************************************************************************/
	
	/**
	 * TAG
	 */
	private final String TAG = "Activity_DomaineDetail";
	
	/**
	 * Debug Mode
	 */
	private final Boolean DEBUG = true;
	
	/******************************************************************************************/
	/*************************************** ATTRIBUTS ****************************************/
	/******************************************************************************************/
	
	/**
	 * Intent
	 */
	private Intent intent;
	
	/******************************************************************************************/
	/************************************* ANDROID METHODS ************************************/
	/******************************************************************************************/
    
	/**
	 * onCreate
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// Log
		if(DEBUG) Log.i(TAG, "onCreate");
		
		// Super
		super.onCreate(savedInstanceState);
        
        // Intent
        intent = this.getIntent();
        if(intent == null)
        {
        	if(DEBUG) Log.i(TAG, "intent = null");
        }
        
        // XML
        setContentView(R.layout.domaine_detail);
        
        // Initialize
        initComponent();
	}
	
	/**
	 * onStart
	 */
	@Override
	protected void onStart() 
	{
		if(DEBUG) Log.i(TAG, "onStart");
		super.onStart();
	}
	
	/**
	 * onResume
	 */
	@Override
	protected void onResume() 
	{
		if(DEBUG) Log.i(TAG, "onResume");
		super.onResume();
	}
	
	/**
	 * onPause
	 */
	@Override
	protected void onPause() 
	{
		if(DEBUG) Log.i(TAG, "onPause");
		super.onPause();
	}
	
	/**
	 * onDestroy
	 */
	@Override
	protected void onDestroy() 
	{
		if(DEBUG) Log.i(TAG, "onDestroy");
		super.onDestroy();
	}
	
	/**
	 * onBackPressed
	 */
	@Override
	public void onBackPressed() 
	{
		if(DEBUG) Log.i(TAG, "onBackPressed");
		getParent().onBackPressed();
	}
	
	/**
	 * onContentChanged
	 */
	@Override
	public void onContentChanged() 
	{
		if(DEBUG) Log.i(TAG, "onContentChanged");
		super.onContentChanged();
	}
	
	/**
	 * onLowMemory
	 */
	@Override
	public void onLowMemory() 
	{
		if(DEBUG) Log.i(TAG, "onLowMemory");
		super.onLowMemory();
	}
	
	/******************************************************************************************/
	/**************************************** METHODS *****************************************/
	/******************************************************************************************/
	
	/**
	 * InitComponent
	 */
	private void initComponent()
	{
		
	}


}
