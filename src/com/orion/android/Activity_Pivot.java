package com.orion.android;

import com.orion.android.R;
import com.orion.android.code.ActivityCode;
import com.orion.android.code.AnimationCode;
import com.orion.android.domaine.detail.Activity_DomaineDetail;
import com.orion.android.region.domaines.Activity_DomainesList;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Activity_Pivot extends ActivityGroup implements OnTouchListener
{
	/******************************************************************************************/
	/************************************** CONSTANTES ****************************************/
	/******************************************************************************************/
	
	/**
	 * TAG
	 */
	private String TAG = "Activity_Pivot";
	
	/**
	 * Debug Mode
	 */
	private Boolean DEBUG = true;
	
	/******************************************************************************************/
	/*************************************** ATTRIBUTS ****************************************/
	/******************************************************************************************/
	
	/**
	 * Animations
	 */
	private Animation animationOut;
	private Animation animationIn;
	
	/**
	 * Intent
	 */
	private Intent intent;
	
	/**
	 * Current Activity
	 */
	private String currentActivity;
	
	/******************************************************************************************/
	/************************************* ANDROID METHODS ************************************/
	/******************************************************************************************/
	
	/**
	 * OnCreate
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		// Super
		super.onCreate(savedInstanceState);
		
		// Log
		if(DEBUG) Log.i(TAG, "OnCreate");
        
        // the intent
        intent = this.getIntent();

		// Offers List Activity
		startChildActivity(ActivityCode.ACTIVITY_DOMAINES_LIST, new Intent(this, Activity_DomainesList.class), this.getWindow().getDecorView(), AnimationCode.NO_ANIMATION);

	}
	
	/**
	 * OnStart
	 */
	@Override
	protected void onStart() 
	{
		super.onStart();
	
		if(DEBUG) Log.i(TAG, "OnStart");
		
//		int code = ActivityCode.code;
//		if(DEBUG) Log.i(TAG, "code=" + code);
//		
//		if(code == ActivityCode.RESULT_CODE_LOGIN_OK)
//		{
//			if(DEBUG) Log.i(TAG, "retour Login ok, Lancement de l'activité OffersListOfferDetail");
//			startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, new Intent(this, Activity_OffersList.class), this.getWindow().getDecorView(), AnimationCode.NO_ANIMATION);
//			ActivityCode.code = 0;
//		}
//		else if(code == ActivityCode.RESULT_CODE_PARTICIPATION_OK)
//		{
//			ActivityCode.code = 0;
//		}
//		else if(code == ActivityCode.RESULT_CODE_OFFERS_UNIV_QUITT)
//		{
//			if(DEBUG) Log.i(TAG, "Offers Universe close");
//			ActivityCode.code = 0;
//			getParent().onBackPressed();
//		}
	}
	
	/**
	 * OnResume
	 */
	@Override
	protected void onResume() 
	{
		super.onResume();
		if(DEBUG) Log.i(TAG, "onResume");
		
	}
	
	/**
	 * OnActivityResult
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
		super.onActivityResult(requestCode, resultCode, data);
	
		if(DEBUG) Log.i(TAG, "OnActivityResult");
		
		if(resultCode == RESULT_OK)
		{
			if(DEBUG) Log.i(TAG, "RESULT_OK");
		}
	}

	/**
	 * OnBackPressed
	 */
	@Override
	public void onBackPressed() 
	{
		if(DEBUG) Log.i(TAG, "onBackPressed");
		if(DEBUG) Log.i(TAG, "currentActivity : " + currentActivity);
		
		if(ActivityCode.ACTIVITY_DOMAINES_LIST.equals(currentActivity))
		{
			getParent().onBackPressed();
		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_DETAIL.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_LIST_OFFER_DETAIL");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, this.getWindow().getDecorView(), AnimationCode.NO_ANIMATION);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_OFFERS_LIST_OFFER_DETAIL");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, this.getWindow().getDecorView(), AnimationCode.NO_ANIMATION);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_DESCRIPTION.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_OFFERS_LIST_OFFER_DETAIL_DESCRIPTION");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, this.getWindow().getDecorView(), AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, this.getWindow().getDecorView(), AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_MAP.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_OFFERS_LIST_OFFER_DETAIL_MAP");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, this.getWindow().getDecorView(), AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_SHARE.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_OFFERS_LIST_OFFER_DETAIL_SHARE");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, this.getWindow().getDecorView(), AnimationCode.BOTTOM_TO_TOP);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN.equals(currentActivity))
//		{
//			if(DEBUG) Log.i(TAG, "currentActivity = ACTIVITY_OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN");
//			
//			Activity child = getCurrentActivity();
//			if(child != null)
//			{
//				Intent intent = child.getIntent();
//				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL);
//				child.setIntent(intent);
//				finishFromChild(child);
//			}
//			else
//			{
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, this.getWindow().getDecorView(), AnimationCode.LEFT_TO_RIGHT);
//			}
//		}

	}
	
	/**
	 * OnTouch
	 */
	public boolean onTouch(View v, MotionEvent event) 
	{	
		if(MotionEvent.ACTION_UP == event.getAction())
		{
			if(DEBUG) Log.i(TAG, "ontouch + Action_up");
			
			Activity child = getCurrentActivity();
			if(child != null)
			{
				Intent intent = child.getIntent();
				intent.putExtra(ActivityCode.RESULT_CODE, ActivityCode.ACTIVITY_OFFERS_LIST);
				child.setIntent(intent);
				finishFromChild(child);
			}
			else
			{
				if(DEBUG) Log.i(TAG, "child null");
			}
		}
		return false;
	}
	
	/***********************************************************************************************/
	
	/**
	* Starts an Activity as a child Activity to this.
	* @param Id Unique identifier of the activity to be started.
	* @param intent The Intent describing the activity to be started.
	* @throws android.content.ActivityNotFoundException.
	*/
	public void startChildActivity(String Id, Intent intent, View oldView, int animation) {
		
		if(DEBUG) Log.i(TAG, "startChildActivity " + Id);
		
		currentActivity = Id;
		
		// RequestCode
		intent.putExtra(ActivityCode.REQUEST_CODE, Id);
		
		// Windows
		Window window = getLocalActivityManager().startActivity(Id,intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
		if (window != null) 
		{
			View v = window.getDecorView();
			if (v != null) 
			{	
				if(animation == AnimationCode.LEFT_TO_RIGHT)
				{
					animationOut = AnimationUtils.loadAnimation(this, R.anim.slide_out_to_right);
					oldView.startAnimation(animationOut);
					animationIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_left);
					v.startAnimation(animationIn);
				}
				else if(animation == AnimationCode.RIGHT_TO_LEFT)
				{
					animationOut = AnimationUtils.loadAnimation(this, R.anim.slide_out_to_left);
					oldView.startAnimation(animationOut);
					animationIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_right);
					v.startAnimation(animationIn);
				}
				else if(animation == AnimationCode.BOTTOM_TO_TOP)
				{
					animationOut = AnimationUtils.loadAnimation(this, R.anim.slide_out_to_top);
					oldView.startAnimation(animationOut);
					animationIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_bottom);
					v.startAnimation(animationIn);
				}
				else if(animation == AnimationCode.TOP_TO_BOTTOM)
				{
					animationOut = AnimationUtils.loadAnimation(this, R.anim.slide_out_to_bottom);
					oldView.startAnimation(animationOut);
					animationIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_top);
					v.startAnimation(animationIn);
				}
				else if(animation == AnimationCode.TOP_TO_BOTTOM_LESS_OUT)
				{
					animationIn = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_top);
					v.startAnimation(animationIn);
				}
				else if(animation == AnimationCode.FADE_IN_TO_FADE_OUT)
				{
					animationOut = AnimationUtils.loadAnimation(this, R.anim.fadeout_1500);
					oldView.startAnimation(animationOut);
					animationIn = AnimationUtils.loadAnimation(this, R.anim.fadein_1500);
					v.startAnimation(animationIn);
				}
			}
			setContentView(v);
		}
	}
	
	/**
	* This is called when a child activity of this one calls its finish method.
	* This implementation calls {@link LocalActivityManager#destroyActivity} on the child activity
	* and starts the previous activity.
	* If the last child activity just called finish(),this activity (the parent),
	* calls finish to finish the entire group.
	*/
	@Override
	public void finishFromChild(Activity child)
	{	
		if(DEBUG) Log.i(TAG, "fct finishFromChild");
		
		// Intent
		Intent intent = child.getIntent();
		
		// RequestCode
		String requestCode = intent.getExtras().getString(ActivityCode.REQUEST_CODE);
		if(DEBUG) Log.i(TAG, "request_code = " + requestCode);
		
		// ResultCode
		String resultCode = intent.getExtras().getString(ActivityCode.RESULT_CODE);
		if(DEBUG) Log.i(TAG, "result_code = " + resultCode);
		
		// Child View
		View childView = child.getWindow().getDecorView();
		
		if(ActivityCode.ACTIVITY_DOMAINES_LIST.equals(requestCode))
		{
			if(ActivityCode.ACTIVITY_DOMAINES_LIST_DETAIL.equals(resultCode))
			{
				//String idDomaine = intent.getExtras().getString("id_domaine");
				intent = new Intent(this, Activity_DomaineDetail.class);
				//intent.putExtra("id_domaine", idDomaine);
				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_DETAIL, intent, childView, AnimationCode.RIGHT_TO_LEFT);
			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_PUB.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListPub.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_PUB, intent, childView, AnimationCode.RIGHT_TO_LEFT);
//			}
		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_PUB.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_DETAIL, intent, childView, AnimationCode.NO_ANIMATION);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_DETAIL.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, childView, AnimationCode.RIGHT_TO_LEFT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_DESCRIPTION.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferInformations.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_DESCRIPTION, intent, childView, AnimationCode.RIGHT_TO_LEFT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferProductsInformations.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION, intent, childView, AnimationCode.RIGHT_TO_LEFT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_MAP.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferMap.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_MAP, intent, childView, AnimationCode.RIGHT_TO_LEFT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_SHARE.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferShare.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_SHARE, intent, childView, AnimationCode.NO_ANIMATION);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString(Activity_ParticipationSteps.ID_OFFER);
//				String mode = intent.getExtras().getString(Activity_ParticipationSteps.MODE);
//				String universe = intent.getExtras().getString(Activity_ParticipationSteps.UNIVERSE);
//				String request = intent.getExtras().getString(Activity_ParticipationSteps.REQUEST_MODE);
//				intent = new Intent(this, Activity_ZbarVerifyBarcode.class);
//				intent.putExtra(Activity_ParticipationSteps.ID_OFFER, idOffer);
//				intent.putExtra(Activity_ParticipationSteps.MODE, mode);
//				intent.putExtra(Activity_ParticipationSteps.UNIVERSE, universe);
//				intent.putExtra(Activity_ParticipationSteps.REQUEST_MODE, request);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN, intent, childView, AnimationCode.RIGHT_TO_LEFT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_DESCRIPTION.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_MAP.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_SHARE.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN.equals(requestCode))
//		{
//			if(ActivityCode.ACTIVITY_OFFERS_LIST.equals(resultCode))
//			{
//				intent = new Intent(this, Activity_OffersList.class);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//			else if(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL.equals(resultCode))
//			{
//				idOffer = intent.getExtras().getString("id_offer");
//				String ean = intent.getExtras().getString(Activity_ParticipationSteps.EAN);
//				String mode = intent.getExtras().getString(Activity_ParticipationSteps.MODE);
//				intent = new Intent(this, Activity_OffersListOfferDetail.class);
//				intent.putExtra("id_offer", idOffer);
//				intent.putExtra(Activity_ParticipationSteps.EAN, ean);
//				intent.putExtra(Activity_ParticipationSteps.MODE, mode);
//				startChildActivity(ActivityCode.ACTIVITY_OFFERS_LIST_OFFER_DETAIL, intent, childView, AnimationCode.LEFT_TO_RIGHT);
//			}
//		}
//		
//		// Destroy Child
//		LocalActivityManager manager = getLocalActivityManager();
//		manager.destroyActivity(requestCode, true);
//		if(DEBUG) Log.i(TAG, "Activity : "+ requestCode + " destroyed");
		
	}
	
	
	
}
