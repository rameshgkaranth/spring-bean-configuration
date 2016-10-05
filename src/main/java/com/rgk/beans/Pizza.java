package com.rgk.beans;

/**
 * Abstract Pizza class
 * @author rkaranth
 *
 */
abstract class Pizza {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Abstract initialize method
	 */
	public abstract void onPizzaCreate();
	
	/**
	 * Abstract destroy method
	 */
	public abstract void onPizzaDestroy();
}