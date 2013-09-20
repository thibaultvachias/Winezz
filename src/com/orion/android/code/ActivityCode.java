package com.orion.android.code;

/**
 * Activity Codes
 * 
 * @author Thibault Vachias
 * @version 1.0
 * @since 04/07/2012
 *
 */
public class ActivityCode 
{
	/**
	 * ResultCode of the activity
	 */
	public static int code = 0;
	
	/******************************************************************************************/
	/***************************************** START ******************************************/
	/******************************************************************************************/
	
	/*------------------------------------- REQUEST CODE -------------------------------------*/
	
	/**
	 * Go To SplashScreen
	 */
	public final static int REQUEST_CODE_SPLASHSCREEN								= 11;
	
	/**
	 * Go To Brand
	 */
	public final static int REQUEST_CODE_BRAND										= 12;
	
	/**
	 * Go To List Domaine
	 */
	public final static int REQUEST_CODE_DOMAINES									= 13;
	
	/**
	 * Go To Domaine Detail
	 */
	public final static int REQUEST_CODE_DOMAINE_DETAIL								= 14;
	
	
	/*------------------------------------- RESULT CODE --------------------------------------*/
	
	/**
	 * ResultCode SplashScreen finished
	 */
	public final static int RESULT_CODE_SPLASHSCREEN_FINISHED						= 10; // Fixe dans HCNX_SPLASHSCREEN
	
	/**
	 * ResultCode Brand finished
	 */
	public final static int RESULT_CODE_BRAND_FINISHED								= 15;
	
	/******************************************************************************************/
	/**************************************** PROFILE *****************************************/
	/******************************************************************************************/
	
	/*------------------------------------- REQUEST CODE -------------------------------------*/
	
	/**
	 * Go To Profile Universe (Resume or Login)
	 */
	public final static int REQUEST_CODE_PROFILE_UNIV 								= 100;
	
	/**
	 * Go To Profile Resume
	 */
	public final static int REQUEST_CODE_PROFILE_RESUME 							= 110;
	
	/**
	 * Go To Profile Tab
	 */
	public final static int REQUEST_CODE_PROFILE_TAB 								= 120;
	
	/**
	 * Go To Profile Password Forgotten
	 */
	public final static int REQUEST_CODE_PROFILE_PASSWORD_FORGOTTEN 				= 130;
	
	/**
	 * Go To Profile Help
	 */
	public final static int REQUEST_CODE_HELP										= 140;
	
	/**
	 * Go To Profile Send Password
	 */
	public final static int REQUEST_CODE_SEND_PASSWORD								= 145;
	
	/*------------------------------------- RESULT CODE --------------------------------------*/
	
	/**
	 * ResultCode Close Application
	 */
	public final static int RESULT_CODE_CLOSE_APP 									= 150;
	
	/**
	 * ResultCode Login Ok
	 */
	public final static int RESULT_CODE_LOGIN_OK 									= 160;
	
	/**
	 * ResultCode Quitt Profile
	 */
	public final static int RESULT_CODE_QUITT_PROFILE								= 170;
	
	/**
	 * ResultCode Go To Profile
	 */
	public final static int RESULT_CODE_GO_TO_PROFILE_TAB							= 180;
	
	/******************************************************************************************/
	/************************************** MODR/PROME ****************************************/
	/******************************************************************************************/
	
	/*------------------------------------- REQUEST CODE -------------------------------------*/
	
	/**
	 * RequestCode Go To Offers List
	 */
	public final static int REQUEST_CODE_ACTIVITY_OFFERS_LIST						= 200;
	
	
	/*------------------------------------- RESULT CODE --------------------------------------*/
	
	/**
	 * ResultCode Offers Universe Quitt
	 */
	public final static int RESULT_CODE_OFFERS_UNIV_QUITT							= 201;
	
	/******************************************************************************************/
	/***************************************** GAMES ******************************************/
	/******************************************************************************************/
	
	/*------------------------------------- REQUEST CODE -------------------------------------*/
	
	/**
	 * RequestCode Go To Offers List
	 */
	public final static int REQUEST_CODE_ACTIVITY_GAMES_LIST						= 300;
	
	
	/*------------------------------------- RESULT CODE --------------------------------------*/
	
	/**
	 * ResultCode Offers Universe Quitt
	 */
	public final static int RESULT_CODE_GAMES_UNIV_QUITT							= 301;
	
	/******************************************************************************************/
	/***************************************** HELP *******************************************/
	/******************************************************************************************/
	
	/*------------------------------------- REQUEST CODE -------------------------------------*/
	
	/**
	 * Go To Help from Portal
	 */
	public final static int REQUEST_CODE_HELP_UNIV									= 400;
	
	/*------------------------------------- RESULT CODE --------------------------------------*/
	
	/**
	 * ResultCode Help
	 */
	public final static int RESULT_CODE_QUITT_HELP									= 410;
	
	/******************************************************************************************/
	/************************************** PARTICIPATION *************************************/
	/******************************************************************************************/
	
	/*---------------------------------------- MQODE -----------------------------------------*/
	
	/**
	 * Request Code Participation MQode
	 */
	public final static int REQUEST_CODE_PARTICIPATION_MQODE						= 500;
	
	/**
	 * ResultCode Participation MQode Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_MQODE_OK						= 501;
	
	/**
	 * ResultCode Participation MQode return
	 */
	public final static int RESULT_CODE_PARTICIPATION_MQODE_RETURN					= 502;
	
	/*--------------------------------------- EAN SCAN ---------------------------------------*/
	
	/**
	 * Request Code Participation EAN Scan
	 */
	public final static int REQUEST_CODE_PARTICIPATION_EAN_SCAN						= 510;
	
	/**
	 * ResultCode Participation EAN Scan Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_EAN_SCAN_OK					= 511;
	
	/**
	 * ResultCode Participation EAN Scan return
	 */
	public final static int RESULT_CODE_PARTICIPATION_EAN_SCAN_RETURN				= 512;
	
	/*--------------------------------------- EANS SCAN --------------------------------------*/
	
	/**
	 * Request Code Participation EANs Scan
	 */
	public final static int REQUEST_CODE_PARTICIPATION_EANS_SCAN					= 520;
	
	/**
	 * ResultCode Participation EANs Scan Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_EANS_SCAN_OK					= 521;
	
	/**
	 * ResultCode Participation EANs Scan return
	 */
	public final static int RESULT_CODE_PARTICIPATION_EANS_SCAN_RETURN				= 522;
	
	/*-------------------------------------- TC PICTURE --------------------------------------*/
	
	/**
	 * Request Code Participation TC Picture
	 */
	public final static int REQUEST_CODE_PARTICIPATION_TC_PICTURE					= 530;
	
	/**
	 * ResultCode Participation TC Picture Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_TC_PICTURE_OK					= 531;
	
	/**
	 * ResultCode Participation TC Picture return
	 */
	public final static int RESULT_CODE_PARTICIPATION_TC_PICTURE_RETURN				= 532;
	
	/*----------------------------------- STICKER_PICTURE ------------------------------------*/
	
	/**
	 * Request Code Participation Sticker Picture
	 */
	public final static int REQUEST_CODE_PARTICIPATION_STICKER_PICTURE				= 540;
	
	/**
	 * ResultCode Participation Sticker Picture Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_STICKER_PICTURE_OK			= 541;
	
	/**
	 * ResultCode Participation Sticker Picture return
	 */
	public final static int RESULT_CODE_PARTICIPATION_STICKER_PICTURE_RETURN		= 542;
	
	/*----------------------------------- STICKERS_PICTURE ------------------------------------*/
	
	/**
	 * Request Code Participation Stickers Picture
	 */
	public final static int REQUEST_CODE_PARTICIPATION_STICKERS_PICTURE				= 550;
	
	/**
	 * ResultCode Participation Stickers Picture Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_STICKERS_PICTURE_OK			= 551;
	
	/**
	 * ResultCode Participation Stickers Picture return
	 */
	public final static int RESULT_CODE_PARTICIPATION_STICKERS_PICTURE_RETURN		= 552;
	
	/*-------------------------------------- IBAN BIC --------------------------------------*/
	
	/**
	 * Request Code Participation Iban Bic
	 */
	public final static int REQUEST_CODE_PARTICIPATION_IBAN_BIC						= 560;
	
	/**
	 * ResultCode Participation Iban Bic ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_IBAN_BIC_OK					= 561;
	
	/**
	 * ResultCode Participation Iban Bic return
	 */
	public final static int RESULT_CODE_PARTICIPATION_IBAN_BIC_RETURN				= 562;
	
	/*------------------------------------ DELIVERY ADDRESS ---------------------------------*/
	
	/**
	 * Request Code Participation Delivery Address
	 */
	public final static int REQUEST_CODE_PARTICIPATION_DELIVERY_ADDRESS				= 570;
	
	/**
	 * ResultCode Participation Delivery Address Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_DELIVERY_ADDRESS_OK			= 571;
	
	/**
	 * ResultCode Participation Delivery Address return
	 */
	public final static int RESULT_CODE_PARTICIPATION_DELIVERY_ADDRESS_RETURN		= 572;
	
	/*-------------------------------------- PACKAGE CODE -----------------------------------*/
	
	/**
	 * Request Code Participation set Package Code
	 */
	public final static int REQUEST_CODE_PARTICIPATION_SET_PACKAGE_CODE				= 580;
	
	/**
	 * ResultCode Participation set Package Code Ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_SET_PACKAGE_CODE_OK 			= 581;
	
	/**
	 * ResultCode Participation set Package Code return
	 */
	public final static int RESULT_CODE_PARTICIPATION_SET_PACKAGE_CODE_RETURN 		= 582;
	
	/*------------------------------------------ CODE ---------------------------------------*/
	
	/**
	 * Request Code Participation set Single Code
	 */
	public final static int REQUEST_CODE_PARTICIPATION_SET_SINGLE_CODE				= 590;
	
	/**
	 * ResultCode Participation set Single Code ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_SET_SINGLE_CODE_OK			= 591;
	
	/**
	 * ResultCode Participation set Single Code return
	 */
	public final static int RESULT_CODE_PARTICIPATION_SET_SINGLE_CODE_RETURN 		= 591;
	
	/*------------------------------------- QCM_VALIDATION ----------------------------------*/
	
	/**
	 * Request Code Participation QCM
	 */
	public final static int REQUEST_CODE_PARTICIPATION_QCM							= 600;
	
	/**
	 * Result Code Participation QCM ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_QCM_OK 						= 601;
	
	/**
	 * Result Code Participation QCM return
	 */
	public final static int RESULT_CODE_PARTICIPATION_QCM_RETURN 					= 602;
	
	/*-------------------------------------- QCM_SONDAGE ------------------------------------*/
	
	/**
	 * Request Code Participation Sondage
	 */
	public final static int REQUEST_CODE_PARTICIPATION_SONDAGE						= 610;
	
	/**
	 * Result Code Participation Sondage ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_SONDAGE_OK 					= 611;
	
	/**
	 * Result Code Participation Sondage return
	 */
	public final static int RESULT_CODE_PARTICIPATION_SONDAGE_RETURN 				= 612;
	
	/*------------------------------------- INSTANT_GAGNANT ---------------------------------*/
	
	/**
	 * Request Code Participation Instant Gagnant
	 */
	public final static int REQUEST_CODE_PARTICIPATION_INSTANT_GAGNANT				= 620;
	
	/**
	 * ResultCode Participation Instant Gagnant ok
	 */
	public final static int RESULT_CODE_PARTICIPATION_INSTANT_GAGNANT_OK 			= 621;
	
	/**
	 * ResultCode Participation Instant Gagnant return
	 */
	public final static int RESULT_CODE_PARTICIPATION_INSTANT_GAGNANT_RETURN 		= 622;
	
	/******************************************************************************************/
	/***************************************** NAME *******************************************/
	/******************************************************************************************/
	
	/**
	 * ACTIVITY GROUP CODE
	 */
	// Request
	public final static String REQUEST_CODE										= "REQUEST_CODE";
	
	// Result
	public final static String RESULT_CODE										= "RESULT_CODE";
	

	/*************************************** DOMAINES *****************************************/
	
	// DOMAINES_LIST
	public final static String ACTIVITY_DOMAINES_LIST							= "DOMAINES LIST";
	
	// DOMAINES_LIST DETAIL
	public final static String ACTIVITY_DOMAINES_LIST_DETAIL					= "DOMAINES LIST DETAIL";
	
	
	
	/***************************************** MODR *******************************************/
	
	// OFFERS_LIST
	public final static String ACTIVITY_OFFERS_LIST								= "OFFERS_LIST";
	
	// OFFERS_LIST_DETAIL
	public final static String ACTIVITY_OFFERS_LIST_DETAIL						= "OFFERS_LIST_DETAIL";
	
	// OFFERS_LIST_OFFER_DETAIL
	public final static String ACTIVITY_OFFERS_LIST_OFFER_DETAIL				= "OFFERS_LIST_OFFER_DETAIL";
	
	// OFFERS_LIST_OFFER_INFORMATIONS
	public final static String ACTIVITY_OFFERS_LIST_OFFER_DETAIL_DESCRIPTION	= "OFFERS_LIST_OFFER_DETAIL_DESCRIPTION";

	// OFFERS_LIST_OFFER_PRODUCT_INFORMATION
	public final static String ACTIVITY_OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION = "OFFERS_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION";

	// OFFERS_LIST_OFFER_DETAIL_MAP
	public final static String ACTIVITY_OFFERS_LIST_OFFER_DETAIL_MAP			= "OFFERS_LIST_OFFER_DETAIL_MAP";

	// OFFERS_LIST_OFFER_DETAIL_SHARE
	public final static String ACTIVITY_OFFERS_LIST_OFFER_DETAIL_SHARE			= "OFFERS_LIST_OFFER_DETAIL_SHARE";
	
	// OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN
	public final static String ACTIVITY_OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN		= "OFFERS_LIST_OFFER_DETAIL_VERIFY_EAN";
	
	// OFFERS_LIST_PUB
	public final static String ACTIVITY_OFFERS_LIST_PUB							= "OFFERS_LIST_PUB";
	
	/***************************************** GAMES *******************************************/
	
	// GAMES_LIST
	public final static String ACTIVITY_GAMES_LIST								= "GAMES_LIST";
	
	// GAMES_LIST_DETAIL
	public final static String ACTIVITY_GAMES_LIST_DETAIL						= "GAMES_LIST_DETAIL";
	
	// GAMES_LIST_OFFER_DETAIL
	public final static String ACTIVITY_GAMES_LIST_OFFER_DETAIL				= "GAMES_LIST_OFFER_DETAIL";
	
	// GAMES_LIST_OFFER_INFORMATIONS
	public final static String ACTIVITY_GAMES_LIST_OFFER_DETAIL_DESCRIPTION	= "GAMES_LIST_OFFER_DETAIL_DESCRIPTION";

	// GAMES_LIST_OFFER_PRODUCT_INFORMATION
	public final static String ACTIVITY_GAMES_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION = "GAMES_LIST_OFFER_DETAIL_PRODUCT_DESCRIPTION";

	// GAMES_LIST_OFFER_DETAIL_MAP
	public final static String ACTIVITY_GAMES_LIST_OFFER_DETAIL_MAP			= "GAMES_LIST_OFFER_DETAIL_MAP";

	// GAMES_LIST_OFFER_DETAIL_SHARE
	public final static String ACTIVITY_GAMES_LIST_OFFER_DETAIL_SHARE			= "GAMES_LIST_OFFER_DETAIL_SHARE";
	
	// GAMES_LIST_OFFER_DETAIL_VERIFY_EAN
	public final static String ACTIVITY_GAMES_LIST_OFFER_DETAIL_VERIFY_EAN		= "GAMES_LIST_OFFER_DETAIL_VERIFY_EAN";
	
	// GAMES_LIST_PUB
	public final static String ACTIVITY_GAMES_LIST_PUB							= "GAMES_LIST_PUB";
}
