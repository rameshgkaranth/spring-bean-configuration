package com.rgk.beans;

import java.util.List;

public class FarmFreshPizza extends Pizza {
	
	private List<String> veggiesList;
	private List<String> spicesList;

	/**
	 * Static factory method used to create {@code FarmFreshPizza}
	 * 
	 * @param veggiesList
	 * @param spicesList
	 * @return
	 */
	public static FarmFreshPizza getInstance(List<String> veggiesList, List<String> spicesList) {
		FarmFreshPizza farmFreshPizza = new FarmFreshPizza();
		farmFreshPizza.setVeggiesList(veggiesList);
		farmFreshPizza.setSpicesList(spicesList);
		
		return farmFreshPizza;
	}
	
	/**
	 * @return the veggiesList
	 */
	public List<String> getVeggiesList() {
		return veggiesList;
	}

	/**
	 * @param veggiesList the veggiesList to set
	 */
	private void setVeggiesList(List<String> veggiesList) {
		this.veggiesList = veggiesList;
	}

	/**
	 * @return the spicesList
	 */
	public List<String> getSpicesList() {
		return spicesList;
	}

	/**
	 * @param spicesList the spicesList to set
	 */
	private void setSpicesList(List<String> spicesList) {
		this.spicesList = spicesList;
	}

	@Override
	public void onPizzaCreate() {
		System.out.println("INIT - Adding freshly cut veggies to pizza along with secret spices ... ");
	}

	@Override
	public void onPizzaDestroy() {
		System.out.println("DESTROY - Farm fresh pizza getting destroyed ... ");
	}
	
	@Override
	public String toString() {
		return "I am thin crust, pan pizza loaded with fresh veggies!";
	}
}