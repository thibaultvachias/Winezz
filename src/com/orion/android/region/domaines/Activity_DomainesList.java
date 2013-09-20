package com.orion.android.region.domaines;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.orion.android.R;
import com.orion.android.beans.Domaine;
import com.orion.android.domaine.detail.Activity_DomaineDetail;
import com.orion.android.region.domaines.DomainesAdapter.MyCustomAdapterListener;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

/**
 * 
 * @author Thibault Vachias
 *
 */
public class Activity_DomainesList extends MapActivity implements MyCustomAdapterListener
{
	/******************************************************************************************/
	/************************************** CONSTANTES ****************************************/
	/******************************************************************************************/
	
	/**
	 * TAG
	 */
	private final String TAG = "Activity_DomainesList";
	
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
	
	/**
	 * Offers List
	 */
	private ListView domainesListView;
	
	/**
	 * Google Map
	 */
	private MapView mapView;
	
	/**
	 * Btn List
	 */
	private Button btn_list;
	
	/**
	 * Btn Map
	 */
	private Button btn_map;
	
	/**
	 * Offers Adapter
	 */
	private DomainesAdapter domainesAdapter;
	
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
        setContentView(R.layout.domaines_list);
        
        // Offers List
        domainesListView = (ListView) findViewById(R.id.listeView1);
        if(domainesListView != null)
        {
        	// Offers Adapter
	        domainesAdapter = new DomainesAdapter(Activity_DomainesList.this);
        	
	        // Create Domaines
	        Domaine d1 = new Domaine();
	        domainesAdapter.addSeparatorItem(d1);
			
	        Domaine d2 = new Domaine();
	        domainesAdapter.addSeparatorItem(d2);
	        
	        Domaine d3 = new Domaine();
	        domainesAdapter.addSeparatorItem(d3);
	        
	        Domaine d4 = new Domaine();
	        domainesAdapter.addSeparatorItem(d4);
	        
	        Domaine d5 = new Domaine();
	        domainesAdapter.addSeparatorItem(d5);
	        
	        Domaine d6 = new Domaine();
	        domainesAdapter.addSeparatorItem(d6);
			       
	        Domaine d7 = new Domaine();
	        domainesAdapter.addSeparatorItem(d7);
	        
	        Domaine d8 = new Domaine();
	        domainesAdapter.addSeparatorItem(d8);
	        
	        Domaine d9 = new Domaine();
	        domainesAdapter.addSeparatorItem(d9);
	        
	        Domaine d10 = new Domaine();
	        domainesAdapter.addSeparatorItem(d10);
	        
	        // Add Listener
	        domainesAdapter.addListener(Activity_DomainesList.this);
	        
	        // Set the adapter
	        domainesListView.setAdapter(domainesAdapter);
        } 
        else
        {
        	if(DEBUG) Log.i(TAG, "offersList = null");
        }
        
        // Map
        mapView = (MapView) findViewById(R.id.mapView);
        if(mapView!=null)
        {
        	mapView.setVisibility(MapView.GONE);
        }
        else
        {
        	if(DEBUG) Log.i(TAG, "mapView is null");
        }
        
        // Button List
        btn_list = (Button) findViewById(R.id.btn_list);
        
        // Button Map
        btn_map = (Button) findViewById(R.id.btn_map);
        
        // Btn_List && Btn_Map
        if(btn_list!=null && btn_map!=null && domainesListView!=null && mapView!=null)
        {
        	btn_list.setOnClickListener(new OnClickListener() 
        	{
				public void onClick(View v) 
				{
					domainesListView.setVisibility(ListView.VISIBLE);
					mapView.setVisibility(MapView.GONE);
					btn_list.setBackgroundResource(R.drawable.icon_list_on);
					btn_map.setBackgroundResource(R.drawable.icon_map_off);
				}
			});
        	
        	btn_map.setOnClickListener(new OnClickListener() 
        	{
				public void onClick(View v) 
				{
					domainesListView.setVisibility(ListView.GONE);
					mapView.setVisibility(MapView.VISIBLE);
					btn_list.setBackgroundResource(R.drawable.icon_list_off);
					btn_map.setBackgroundResource(R.drawable.icon_map_on);
				}
			});
        }
        else
        {
        	if(DEBUG) Log.i(TAG, "btn_list, btn_map, domainesListView, mapView is null");
        }
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

	/**
	 * onClickItem
	 */
	public void onClickItem(Domaine domaine, int position) 
	{
		if(DEBUG) Log.i(TAG, "Domaine = " + domaine.getTitre() + ", " + domaine.getSous_titre());
		
		intent = new Intent(Activity_DomainesList.this, Activity_DomaineDetail.class);
		intent.putExtra("id_domaine", position);
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
		
	}


	@Override
	protected boolean isRouteDisplayed() 
	{
		return false;
	}
	
//	/******************************************/
//	
//	
//	/**
//	 * Database
//	 */
//	private Database database;
//
//	/**
//	 * WebServices Status
//	 */
//	private WS_Status ws_status;
//
//	/**
//	 * Handler
//	 */
//	private Handler mHandler = new Handler();
//	
//	/**
//	 * update Component
//	 */
//	public void updateComponent()
//	{
//		new Thread(new Runnable() 
//		{
//			@Override
//			public void run() 
//			{
//				database = Database.getInstance(Activity_DomainesList.this);
//				
//				Boolean isConnected = database.selectFlagUserIsConnected();
//				if(DEBUG) Log.i(TAG, "isConnected = " + isConnected);
//				
//				String idUser;
//				
//				if(isConnected)
//				{
//					idUser = database.selectMerQuiId();
//					ws_status = WebServices.getProfilMembre(idUser);
//					if(DEBUG) Log.i(TAG, "WS STATUS = " + ws_status.getStatus() + ", " + ws_status.getLabel());
//				}
//				else
//				{
//					idUser = "0";
//				}
//				if(DEBUG) Log.i(TAG, "id Merciqui=" + idUser + ".");
//				
//				if(idUser != null && !"".equals(idUser))
//				{
//					// Call WS
//					ws_status = WebServices.getListeOffre(idUser, WebServices.ID_TYPE_OFFER);
//					if(DEBUG) Log.i(TAG, "WS STATUS = " + ws_status.getStatus() + ", " + ws_status.getLabel());
//					
//					// Test the response
//					if(ws_status.getStatus() == WS_Status.NO_ERROR)
//					{
//						// Call WS
//						ws_status = WebServices.getListeOffre(idUser, WebServices.ID_TYPE_GAMES);
//						if(DEBUG) Log.i(TAG, "WS STATUS = " + ws_status.getStatus() + ", " + ws_status.getLabel());
//						
//						// Close the progress Dialog
//						progressDialog.dismiss();
//						
//						// Test the response
//						if(ws_status.getStatus() == WS_Status.NO_ERROR)
//						{
//							// Set datas list
//							datas.setDownloadLists(false);
//							
//							// Handler
//							mHandler.post(new Runnable() 
//							{
//								public void run() 
//								{
//							        // Création de l'offre Séparateur "Actuellement"
//							        Offer separator1 = new Offer();
//							        separator1.setTitreOperation(getString(R.string.separator_title_now));
//							        separator1.setType(OffersAdapter.TYPE_SEPARATOR);
//							        offersAdapter.addSeparatorItem(separator1);
//							        
//							        if(datas != null)
//							        {
//								        // Liste Offre en cours
//								        offerList = datas.getListe_offres_en_cours();
//								        if(DEBUG) Log.i(TAG, "nb offre en cours : " + offerList.size() );
//								        
//								        for (int i = 0; i < offerList.size(); i++) 
//								        {
//								        	offerList.get(i).setType(OffersAdapter.TYPE_ITEM);
//								        	offerList.get(i).setOfferMode(Offer.MODE_OFFER_NOW);
//								        	offersAdapter.addOffer(offerList.get(i), OffersAdapter.ACTUELLEMENT);
//								        }
//								        
//								        // Liste Offres à venir
//								        offerList = datas.getListe_offres_a_venir();
//								        if(DEBUG) Log.i(TAG, "nb offre à venir : " + offerList.size() );
//								        
//								        if(offerList.size() > 0)
//								        {
//									        // Création de l'offre Séparateur "Prochainement"
//									        Offer separator2 = new Offer();
//									        separator2.setTitreOperation(getString(R.string.separator_title_future));
//									        separator2.setType(OffersAdapter.TYPE_SEPARATOR);
//									        offersAdapter.addSeparatorItem(separator2);
//									        
//									        for (int i = 0; i < offerList.size(); i++) 
//									        {
//									        	offerList.get(i).setType(OffersAdapter.TYPE_ITEM);
//									        	offerList.get(i).setOfferMode(Offer.MODE_OFFER_IN_FUTURE);
//									        	offersAdapter.addOffer(offerList.get(i), OffersAdapter.PROCHAINEMENT);
//									        }
//								        }
//								        
//								        //Lancement du telechagement des images
//								        offersAdapter.startImageLoader();
//								        
//								        //Ajout du listener sur les items
//								        offersAdapter.addListener(Activity_DomainesList.this);
//								        
//								        //Ajout de l'adapter dans la liste du Xml
//								        offersListView.setAdapter(offersAdapter);
//							        }
//							        else
//							        {
//							        	Log.i(TAG, "datas is null");
//							        }
//								}
//							});
//						}
//						else
//						{
//							runOnUiThread(new Runnable()
//							{
//								@Override
//								public void run() 
//								{
//									Toast.makeText(getParent().getApplicationContext(), "Probleme de communication avec le serveur", Toast.LENGTH_LONG).show();
//								}
//							});
//						}
//					}
//					else
//					{
//						runOnUiThread(new Runnable()
//						{
//							@Override
//							public void run() 
//							{
//								Toast.makeText(getParent().getApplicationContext(), "Probleme de communication avec le serveur", Toast.LENGTH_LONG).show();
//							}
//						});
//					}
//				}
//				else
//				{
//					runOnUiThread(new Runnable()
//					{
//						@Override
//						public void run() 
//						{
//							progressDialog.dismiss();
//							if(DEBUG) Log.i(TAG, "id merciqui BDD is empty");
//							database.updateFlagUserIsConnected(false);
//							database.updateFlagRememberMe(false);
//							if(DEBUG) Log.i(TAG, "id merciqui BDD is null");
//						}
//					});
//				}
//				
//			}
//		}).start();
//	}
//}
}
