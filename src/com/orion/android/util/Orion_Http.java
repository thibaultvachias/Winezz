package com.orion.android.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.util.Log;

/**
 * HTTP Connections class
 * @author Thibault Vachias
 * @version 1.1
 * @since 09/07/2012
 */
public class Orion_Http
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
	
	/**
	 * Cache Directory
	 */
	private static File cacheDir;
	
	/******************************************************************************************/
	/************************************* PUBLICS METHODS ************************************/
	/******************************************************************************************/
	
	/**
	 * Call HTTP GET Url
	 * @param url, the Url
	 * @return the String response
	 * @throws IOException 
	 * @since v1.0 (MerciQui V1.0)
	 */
	public static String executeGetURL(String url) throws IOException {
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = null;
		HttpGet httpGet = new HttpGet(url);
		HttpContext localContext = new BasicHttpContext();
		String rep = "";
		
		try
		{
			response = httpClient.execute(httpGet, localContext);
			ByteArrayOutputStream outstream = new ByteArrayOutputStream();
			response.getEntity().writeTo(outstream);
			rep = outstream.toString("ISO-8859-1");
		}
		catch(IOException e)
		{
			throw new IOException("Probleme lors de l'execution de l'URL");
		}
		
		return rep;
	}
	
	/**
	 * Call HTTP POST Url
	 * @param url, the Url
	 * @return the String response
	 * @throws IOException 
	 * @since v1.0 (MerciQui V1.0)
	 */
	public static String executePostURL(String url, List<NameValuePair> nameValuePairs) throws IOException 
	{
		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = null;
		HttpPost httppost = new HttpPost(url);
		String rep = "";
		
		try
		{
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	        response = httpClient.execute(httppost);
	        rep = EntityUtils.toString(response.getEntity());
		}
		catch (ClientProtocolException e) 
	    {
			throw new ClientProtocolException("Client protocol exception");
		}
		catch(IOException e)
		{
			throw new IOException("Probleme lors de l'execution de l'URL");
		}
		
		return rep;
	}
	
	/**
	 * Connectivity test function
	 * @param context, the context
	 * @return true if the application is online else false
	 * @since v1.0 (MerciQui V1.0)
	 */
	public static boolean isOnline(Context context) 
	{
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		
		if (cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting())
		{
            return true;
		}
		else
		{
            return false;
		}
	}
	
	/**
	 * Call a WS XML HighCo Data
	 * @param url
	 * @param soapAction
	 * @param envelope
	 * @return
	 * @throws IOException
	 */
	public String CallWebService(String url, String soapAction, String envelope) throws IOException 
	{
		URL address = new URL(url);
		URLConnection connection=address.openConnection();
		HttpsURLConnection post=(HttpsURLConnection)connection;
		post.setDoInput(true);
		post.setDoOutput(true);
		post.setRequestMethod("POST");
		post.setRequestProperty("SOAPAction", soapAction);
		post.setRequestProperty( "Content-type", "text/xml; charset=utf-8" );
		post.setRequestProperty( "Content-Length", String.valueOf(envelope.length()));
		post.setReadTimeout(4000);

		OutputStream outStream = post.getOutputStream();
		Writer out = new OutputStreamWriter(outStream);
		out.write(envelope);
		out.flush();
		out.close();

		InputStream inStream = post.getInputStream();
		BufferedInputStream in = new BufferedInputStream(inStream,4);
		StringBuffer buffer=new StringBuffer();
		// read 4 bytes a time
		byte[] buffArray=new byte[4];
		int c=0;
			while((c=in.read(buffArray))!=-1){
				for(int i=0;i<c;i++)
					buffer.append((char)buffArray[i]);
			}

			return buffer.toString();
	}
	
	/**
	 * Get the Url Picture Bitmap
	 * @param url
	 * @return the Bitmap 
	 */
	public static Bitmap getBitmap(Context context, String url) 
    {
		// Cache
        if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
    	{
    		cacheDir = new File(android.os.Environment.getExternalStorageDirectory(), "MerciQui");
    	}
    	else
    	{
            cacheDir = context.getCacheDir();
    	}
		
        String filename = String.valueOf(url.hashCode());
        File f = new File(cacheDir, filename);
        
        //from SD cache
        Bitmap b = decodeFile(f);
        if(b!=null)
        {
            return b;
        }
        else
        {
        	
        }
        
        //from web
        try 
        {
            Bitmap bitmap=null;
            InputStream is=new URL(url).openStream();
            OutputStream os = new FileOutputStream(f);
            CopyStream(is, os);
            os.close();
            bitmap = decodeFile(f);
            return bitmap;
        } 
        catch (Exception e)
        {
        	if(DEBUG) Log.e(TAG, "Exception : " + e.getMessage(), e);
           return null;
        }
    }
	
	/**
	 * Get the Url Picture Bitmap on the cache
	 * @param url
	 * @return the Bitmap 
	 */
	public static Bitmap getBitmapCache(Context context, String url) 
    {
		// Cache
        if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
    	{
    		cacheDir = new File(android.os.Environment.getExternalStorageDirectory(), "MerciQui");
    	}
    	else
    	{
            cacheDir = context.getCacheDir();
    	}
		
        String filename = String.valueOf(url.hashCode());
        File f = new File(cacheDir, filename);
        
        //from SD cache
        Bitmap b = decodeFile(f);
        if(b!=null)
        {
            return b;
        }
        else
        {
        	return null;
        }
    }
	
	/******************************************************************************************/
	/************************************* PRIVATES METHODS ***********************************/
	/******************************************************************************************/
	
	/**
	 * Decode File
	 * @param f
	 * @return
	 */
	private static Bitmap decodeFile(File f)
	{
        try 
        {
            //decode image size
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(new FileInputStream(f),null,o);
            
            //decode with inSampleSize
            BitmapFactory.Options o2 = new BitmapFactory.Options();
            o2.inSampleSize=1;
            return BitmapFactory.decodeStream(new FileInputStream(f), null, o2);
        } 
        catch (FileNotFoundException e) 
        {
        	if(DEBUG) Log.e(TAG, "FileNotFoundException : " + e.getMessage(), e);
        }
        return null;
    }
	
	/**
     * Copy a Stream
     * @param is
     * @param os
     */
    private static void CopyStream(InputStream is, OutputStream os) {
        
    	final int buffer_size = 1024;
        try 
        {
        	byte[] bytes = new byte[buffer_size];
        	for (;;)
        	{
        		int count = is.read(bytes, 0, buffer_size);
        		if (count == -1)
        			break;
        		os.write(bytes, 0, count);
        	}
        }
        catch (Exception e)
        {
        	if(DEBUG) Log.e(TAG, "Exception : " + e.getMessage(), e);
        }
    }
}