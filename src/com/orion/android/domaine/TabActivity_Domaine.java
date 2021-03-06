package com.orion.android.domaine;

import com.orion.android.R;
import com.orion.android.domaine.detail.Activity_DomaineDetail;
import com.orion.android.region.domaines.Activity_DomainesList;
import com.orion.android.tabbar.produits.Pivot_ActivityGroup_Produits;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

/**
 * TabActivity
 * 
 * @author Thibault Vachias
 * @version 1.0
 * @since 27/07/2012
 *
 */
public class TabActivity_Domaine extends TabActivity implements OnTabChangeListener 
{
		/******************************************************************************************/
		/************************************** CONSTANTES ****************************************/
		/******************************************************************************************/
		
		/**
		 * Log Tag
		 */
		private final static String TAG = "TabActivity_Domaines";
		
		/**
		 * Debug Mode
		 */
		private final static Boolean DEBUG = true;
		
		/******************************************************************************************/
		/*************************************** ATTRIBUTS ****************************************/
		/******************************************************************************************/

		/**
		 * Resources
		 */
		private Resources res;
		
		/**
		 * TabHost
		 */
		private TabHost tabHost;
		
		/**
		 * TabSpec
		 */
		private TabHost.TabSpec spec;
		
		/**
		 * TAG NAV BAR
		 */
		private String TAG_PRESENTATION_LABEL		= "presentation";
		private String TAG_PRODUITS_LABEL			= "produits";
		private String TAG_MAP_LABEL				= "map";
		private String TAG_PRESENTATION				= "";
		private String TAG_PRODUITS 				= "";
		private String TAG_MAP		 				= "";
		public static final int ID_TAG_PRESENTATION	= 0;
		public static final int ID_TAG_PRODUITS		= 1;
		public static final int ID_TAG_MAP			= 2;
		
		/**
		 * Intent
		 */
		private Intent intent;
		
		/******************************************************************************************/
		/************************************ ANDROID METHODS *************************************/
		/******************************************************************************************/
		
		/**
		 * OnCreate
		 */
	    @Override
	    public void onCreate(Bundle savedInstanceState)
	    {
	    	if(DEBUG) Log.i(TAG, "onCreate");
	        super.onCreate(savedInstanceState);

	        setContentView(R.layout.layout_tab);
	        
	        // Resources
	        res = getResources();
	        
	        // Tab Navigation String
	        TAG_PRESENTATION = "";
	        TAG_PRODUITS = "";
	        TAG_MAP	 = "";
	        
	        // TabHost
	        tabHost = getTabHost();
	        tabHost.setOnTabChangedListener(this);
	        
	        // Domaines
	        //intent = new Intent().setClass(this, Pivot_ActivityGroup_Domaines.class);
	        intent = new Intent().setClass(this, Activity_DomaineDetail.class);
	        spec = tabHost.newTabSpec(TAG_PRESENTATION_LABEL).setIndicator(TAG_PRESENTATION, res.getDrawable(R.drawable.tab_ic_domaines)).setContent(intent);	
	        tabHost.addTab(spec);
	        tabHost.getTabWidget().getChildAt(ID_TAG_PRESENTATION).setBackgroundResource(R.drawable.tab_background_domaines_off);
	        
	        // Produtis
	        intent = new Intent().setClass(this, Pivot_ActivityGroup_Produits.class);
	        spec = tabHost.newTabSpec(TAG_PRODUITS_LABEL).setIndicator(TAG_PRODUITS, res.getDrawable(R.drawable.tab_ic_produits)).setContent(intent);	
	        tabHost.addTab(spec);
	        tabHost.getTabWidget().getChildAt(ID_TAG_PRODUITS).setBackgroundResource(R.drawable.tab_background_produits_off);
	        
	        // GLOSSAISE
	        intent = new Intent().setClass(this, Pivot_ActivityGroup_Produits.class);
	        spec = tabHost.newTabSpec(TAG_MAP_LABEL).setIndicator(TAG_MAP, res.getDrawable(R.drawable.tab_ic_avis)).setContent(intent);	
	        tabHost.addTab(spec);
	        tabHost.getTabWidget().getChildAt(ID_TAG_MAP).setBackgroundResource(R.drawable.tab_background_avis_off);
	        
	        
	        // Background Color Item
//	        for(int i=0; i<tabHost.getTabWidget().getChildCount(); i++)
//			{
//	        	if(DEBUG) Log.i(TAG, "tabWidget : " + i);
//				tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tab_background_off);
//			}
//	        tabHost.getTabWidget().getChildAt(ID_TAG_DOMAINES).setBackgroundResource(R.drawable.tab_background_on);
			
			// Domaines
	        tabHost.getTabWidget().getChildAt(ID_TAG_PRESENTATION).setBackgroundResource(R.drawable.tab_background_domaines_on);
	        tabHost.setCurrentTab(ID_TAG_PRESENTATION);
	        
	    }
	    
	    /**
		 * OnTabChanged
		 */
		public void onTabChanged(String tabId) 
		{
			if(DEBUG) Log.i(TAG, "Tab Id : " + tabId);
			
			for(int i=tabHost.getTabWidget().getChildCount()-1; i>=0; i--)
			{
				if(DEBUG) Log.i(TAG, "widget : " + i);
				switch (i) 
				{
					case ID_TAG_PRESENTATION:
						tabHost.getTabWidget().getChildAt(ID_TAG_PRESENTATION).setBackgroundResource(R.drawable.tab_background_domaines_off);
						break;

					case ID_TAG_PRODUITS:
						tabHost.getTabWidget().getChildAt(ID_TAG_PRODUITS).setBackgroundResource(R.drawable.tab_background_produits_off);
						break;
						
					case ID_TAG_MAP:
						tabHost.getTabWidget().getChildAt(ID_TAG_MAP).setBackgroundResource(R.drawable.tab_background_avis_off);
						break;
						
					default:
						break;
				}
			}
			
			if(TAG_PRESENTATION_LABEL.equals(tabId))
			{
				tabHost.getTabWidget().getChildAt(ID_TAG_PRESENTATION).setBackgroundResource(R.drawable.tab_background_domaines_on);
			}
			else if(TAG_PRODUITS_LABEL.equals(tabId))
			{
				tabHost.getTabWidget().getChildAt(ID_TAG_PRODUITS).setBackgroundResource(R.drawable.tab_background_produits_on);
			}
			else if(TAG_MAP_LABEL.equals(tabId))
			{
				tabHost.getTabWidget().getChildAt(ID_TAG_MAP).setBackgroundResource(R.drawable.tab_background_avis_on);
			}
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
	    	super.onBackPressed();
	    	overridePendingTransition(R.anim.fadein_0500, R.anim.slide_out_to_bottom);
	    }

}
