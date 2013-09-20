package com.orion.android.util;

import android.content.Intent;
import android.util.Log;

public class Orion_Bundle
{
	/******************************************************************************************/
	/************************************** CONSTANTES ****************************************/
	/******************************************************************************************/
	
	/**
	 * TAG
	 */
	private final static String TAG = "HTTP";
	
	/**
	 * Debug Mode
	 */
	private final static Boolean DEBUG = true;
	
	/******************************************************************************************/
	/**************************************** BUNDLE ******************************************/
	/******************************************************************************************/
	
	/**
	 * URL_PUB
	 */
	public static final String BRAND_URL = "BRAND_URL";
	
	/**
	 * DUREE_PUB
	 */
	public static final String BRAND_TIME = "BRAND_TIME";
	
	/******************************************************************************************/
	/************************************* PUBLICS METHODS ************************************/
	/******************************************************************************************/
	
	/**
	 * Get the Bundle
	 * @param context
	 * @return the mode or null
	 */
	public static String getBundle(Intent intent, String bundle)
	{
		String rep = null;
		
		if(intent!=null)
		{
			if(bundle!=null)
			{
				android.os.Bundle b = intent.getExtras();
				
				if(b!=null)
				{
					rep = b.getString(bundle);
					if (DEBUG) Log.i(TAG, "response=" + rep);
				}
				else
				{
					if(DEBUG) Log.i(TAG, "b is null");
				}
			}
			else
			{
				if(DEBUG) Log.i(TAG, "bundle is null");
			}
		}
		else
		{
			if(DEBUG) Log.i(TAG, "intent is null");
		}
		
		return rep;
	}
}
