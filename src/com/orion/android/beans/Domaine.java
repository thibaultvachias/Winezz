package com.orion.android.beans;

/**
 * The Model of a Domaine
 * 
 * @author Thibault Vachias
 * @version 24/09/2012
 *
 */
public class Domaine 
{
	/****************************************************************************/
	/******************************** CONSTANTES ********************************/
	/****************************************************************************/
	
	/**
	 * The Item type is a Domaine
	 * When you create a Domaine, this Type is selected by default
	 */
	public final static int ITEM_DOMAINE = 1;
	
	/**
	 * The Item type is a Separator
	 * When you create a Domaine, the type Domaine is selected by default
	 */
	public final static int ITEM_SEPARATOR = 2;
	
	/****************************************************************************/
	/******************************** ATTRIBUTES ********************************/
	/****************************************************************************/
	
	/**
	 * The title of the Domaine
	 */
	private String titre = "";
	
	/**
	 * The subtitle of the Domaine
	 */
	private String sous_titre = "";

	/**
	 * The item list icon of the Domaine
	 */
	private String url_icone = "";
	
	/**
	 * The description of the Domaine
	 */
	private String description;
	
	/**
	 * Type of the Domaine
	 * 1) Domaine
	 * 2) Separator
	 */
	private int type;
	
	/****************************************************************************/
	/******************************* CONSTRUCTORS *******************************/
	/****************************************************************************/
	
	/**
	 * Constructor of Domaine
	 */
	public Domaine()
	{
		titre = "";
		sous_titre = "";
		url_icone = "";
		description = "";
		type = ITEM_DOMAINE;
	}
	
	/**
	 * Constructor of Domaine
	 * @param s_titre
	 * @param s_sous_titre
	 * @param s_url_icone
	 * @param s_description
	 */
	public Domaine(String s_titre, String s_sous_titre, String s_url_icone, String s_description)
	{
		titre = s_titre;
		sous_titre = s_sous_titre;
		url_icone = s_url_icone;
		description = s_description;
		type = ITEM_DOMAINE;
	}

	/****************************************************************************/
	/***************************** GETTERS SETTERS ******************************/
	/****************************************************************************/
	
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the sous_titre
	 */
	public String getSous_titre() {
		return sous_titre;
	}

	/**
	 * @param sousTitre the sous_titre to set
	 */
	public void setSous_titre(String sousTitre) {
		sous_titre = sousTitre;
	}

	/**
	 * @return the url_icone
	 */
	public String getUrl_icone() {
		return url_icone;
	}

	/**
	 * @param urlIcone the url_icone to set
	 */
	public void setUrl_icone(String urlIcone) {
		url_icone = urlIcone;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	
}
