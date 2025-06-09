package parfait.object;

public class Voiture {

	// Name of the car
	private String name;
	// Brand of the car
	private String brand;

	/**
	 * Constructor
	 * @param name The name
	 * @param brand The brand
	 */
	public Voiture(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	/**	
	 * Gets the name
	 * 
	 * @return The car name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name
	 * 
	 * @param name The car name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the brand
	 * 
	 * @return The brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Sets the brand
	 * 
	 * @param brand The brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
