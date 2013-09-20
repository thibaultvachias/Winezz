package com.orion.android.region.domaines;

import java.util.ArrayList;
import java.util.TreeSet;

import com.orion.android.R;
import com.orion.android.beans.Domaine;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author tvachias
 *
 */
public class DomainesAdapter extends BaseAdapter implements OnClickListener 
{
	/******************************************************************************************/
	/************************************** CONSTANTES ****************************************/
	/******************************************************************************************/
	
	/**
	 * TAG
	 */
	private final String TAG = "DOMAINES_ADAPTER";
	
	/**
	 * Debug Mode
	 */
	private final Boolean DEBUG = true;
	
	/**
	 * Type of Item
	 */
    public static final int 	TYPE_ITEM 			= 0;
    public static final int 	TYPE_SEPARATOR 		= 1;
    private static final int 	TYPE_MAX_COUNT 		= TYPE_SEPARATOR + 1;
    
    /******************************************************************************************/
	/*************************************** ATTRIBUTS ****************************************/
	/******************************************************************************************/
	
	/**
	 * Graphical Elements
	 */
	private 	LayoutInflater 		mInflater;
	private 	TextView			title;
	private 	TextView			subtitle;
	private 	ImageView 			icon_domaine;
	
    private 	ArrayList<Domaine> 	mData = new ArrayList<Domaine>();
   
	private 	Activity 			mActivity;
	  
    private 	TreeSet<Integer> 	mSeparatorsSet = new TreeSet<Integer>();
    //private 	ImageLoader			imageLoader; 
    private	 	ArrayList<MyCustomAdapterListener> 	mListListener = new ArrayList<MyCustomAdapterListener>();
    
    /******************************************************************************************/
	/************************************** CONSTRUCTEUR **************************************/
	/******************************************************************************************/
    
	/**
	 * Constructor
	 * @param activity
	 */
    public DomainesAdapter(Activity activity) 
    {
    	// Context
    	mActivity = activity;
    	
    	// Layout Inflater
    	mInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    
    	// Initialize offers number 
        //nbOffer = 0;
        //nbFutureOffer = 0;
        
    }

    /******************************************************************************************/
	/***************************************** METHODS ****************************************/
	/******************************************************************************************/
    
    /**
     * Ajoute une offre à la liste des offres
     * @param offer
     */
    public void addDomaine(final Domaine domaine, int type) 
    {
    	if(Domaine.ITEM_DOMAINE == type)
    	{
    		//nbOffer++;
    	}
    	else if(Domaine.ITEM_SEPARATOR == type)
    	{
    		//nbFutureOffer++;
    	}
    	
    	mData.add(domaine);
        notifyDataSetChanged();
    }

    /**
     * Ajoute un séparateur dans la liste des offres
     * @param offer
     */
    public void addSeparatorItem(final Domaine domaine) 
    {
    	if(mData!=null && mSeparatorsSet!=null)
    	{
	    	mData.add(domaine);
	        mSeparatorsSet.add(mData.size() - 1);
	        notifyDataSetChanged();
    	}
    }

    /**
     * Retourne le type de l'item numéro 'position'
     * @return TYPE_ITEM si l'iten est une offre
     * @return TYPE_SEPARATOR si l'item est un séparateur
     */
    public int getItemViewType(int position) 
    {
    	return mData.get(position).getType();
    }

    /**
     * Retourne la constante TYPE_MAX_COUNT
     * @return TYPE_MAX_COUNT
     */
    public int getViewTypeCount() 
    {
        return TYPE_MAX_COUNT;
    }

    /**
     * Getter sur le nombre d'item dans la liste
     * @return size
     */
    public int getCount() 
    {
        return mData.size();
    }

    /**
     * Retourne l'offre numéro 'position'
     * @return offer
     */
    public Domaine getItem(int position) 
    {
        return mData.get(position);
    }

    /**
     * Retourne la position de l'item numéro 'position'
     * @return position
     */
    public long getItemId(int position) 
    {
        return position;
    }

    /**
     * Retourne la vue de l'item numéro 'position'
     * @return view
     */
    public View getView(int position, View convertView, ViewGroup parent) 
    {
    	View v = convertView;
    	
    	int type = getItemViewType(position);
    	if(DEBUG) Log.i(TAG, "Item : " + mData.get(position).getTitre() + ", type=" + type + ", position=" + position + "convertView=" + v);
    	
        if(v == null)
        {
        	switch (type)
        	{
	            case Domaine.ITEM_DOMAINE:
	                v = mInflater.inflate(R.layout.domaine_item, null);
	                break;
	                
	            case Domaine.ITEM_SEPARATOR:
	                //v = mInflater.inflate(R.layout.domaine_item_separator, null);
	                break;
	            
	            default:
                	break;
        	}
        }
	             
        switch (type)
    	{
    		case Domaine.ITEM_DOMAINE:
	            
	            this.title = (TextView)v.findViewById(R.id.domaine_title);
	            this.subtitle = (TextView)v.findViewById(R.id.domaine_subtitle);
	            this.icon_domaine = (ImageView)v.findViewById(R.id.domaine_icon);
	            
	            // Title
	            //this.title.setText(mData.get(position).getTitre());
	            this.title.setTextColor(Color.parseColor("#2e333a"));
	            
	            // Subtitle
	            //this.subtitle.setText(mData.get(position).getSous_titre());
	            this.subtitle.setTextColor(Color.parseColor("#385487"));
	        	
	            // Image
	        	this.icon_domaine.setImageResource(R.drawable.icon_default);
	            
	            
	            break;
	        
	        case Domaine.ITEM_SEPARATOR:
	        	
	            //v = mInflater.inflate(R.layout.domaine_item_separator, null);
	            
	            break;
	        default:
	            	break;
		}

        v.setTag(position);
			
		v.setOnClickListener(this);
        
        return v;
    }

    /**
     * Lance le téléchargement des images des items de la liste
     */
    public void startImageLoader() 
    {
    	//imageLoader = new ImageLoader(mActivity.getApplicationContext());
    }

    /**
     * Au clic sur un item
     * @param view
     */
	public void onClick(View v)
	{
		if(DEBUG) Log.i(TAG, "onClic, v.id() : " + v.getId());
		
		Integer pos = (Integer) v.getTag();
		if(DEBUG) Log.i(TAG, "onclick position=" + pos);
		
		Domaine d = getItem(pos);
		if(d==null)
		{
			if(DEBUG) Log.i(TAG, "offer " + pos + " null");
		}
		
		sendListener(getItem(pos),pos);
		
	}
	
	/******************************************************************************************/
	/*************************************** LISTENER *****************************************/
	/******************************************************************************************/
	
	/**
	 * Ajoute un listener sur l'Adapter
	 */
	public void addListener(MyCustomAdapterListener aListener) 
	{
	    mListListener.add(aListener);
	}
	
	/**
	 * Interface pour écouter les évènements sur un item
	 */
	public interface MyCustomAdapterListener 
	{
		public void onClickItem (Domaine domaine, int position);
	}
	
	/**
	 * Prévient tous les listeners en même temps pour diffuser une information 
	 * @param coupon
	 * @param position
	 */
	private void sendListener(Domaine domaine, int position)
	{
	    for(int i = mListListener.size()-1; i >= 0; i--)
	    {
	    	if(getItemViewType(position) == Domaine.ITEM_DOMAINE)
	    		mListListener.get(i).onClickItem(domaine, position);
	    }
	}
}
