package com.rgk.beans;

public class Address {

	private String addressLine1;
	private String addressLine2;
	private String cityCode;
	private String stateCode;
	private String zipCode;
	
	/**
	 * @param addressLine1
	 * @param addressLine2
	 * @param cityCode
	 * @param stateCode
	 * @param zipCode
	 */
	public Address(String addressLine1, String addressLine2, String cityCode, String stateCode, String zipCode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.cityCode = cityCode;
		this.stateCode = stateCode;
		this.zipCode = zipCode;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [addressLine1=").append(addressLine1).append(", addressLine2=").append(addressLine2)
				.append(", cityCode=").append(cityCode).append(", stateCode=").append(stateCode).append(", zipCode=")
				.append(zipCode).append("]");
		return builder.toString();
	}
	
	public void init() {
		System.out.println("INIT - Called as a part of spring bean life cycle after bean properties are set : "+this);
	}
	
	public void destroy() {
		System.out.println("DESTROY - Called as a part of spring bean life cycle after beans has been destroyed");
	}
}
