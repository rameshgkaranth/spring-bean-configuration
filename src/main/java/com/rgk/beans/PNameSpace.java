/**
 * 
 */
package com.rgk.beans;

/**
 * @author rkaranth
 *
 */
public class PNameSpace {

	private String property1;
	private String property2;
	private int property3;
	private double property4;
	private Address address;
	
	/**
	 * @return the property1
	 */
	public String getProperty1() {
		return property1;
	}
	
	/**
	 * @param property1 the property1 to set
	 */
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	
	/**
	 * @return the property2
	 */
	public String getProperty2() {
		return property2;
	}
	
	/**
	 * @param property2 the property2 to set
	 */
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	
	/**
	 * @return the property3
	 */
	public int getProperty3() {
		return property3;
	}
	
	/**
	 * @param property3 the property3 to set
	 */
	public void setProperty3(int property3) {
		this.property3 = property3;
	}
	
	/**
	 * @return the property4
	 */
	public double getProperty4() {
		return property4;
	}
	
	/**
	 * @param property4 the property4 to set
	 */
	public void setProperty4(double property4) {
		this.property4 = property4;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PNameSpace [property1=").append(property1).append(", property2=").append(property2)
				.append(", property3=").append(property3).append(", property4=").append(property4).append(", address=")
				.append(address).append("]");
		return builder.toString();
	}
}
