package ReflectionObjects;

public class Employee {

	private String name;
	private String surname;
	private int wiek;
	/**
	 * @param name
	 * @param surmane
	 * @param wiek
	 */
	public Employee(String name, String surmane, int wiek) {
		this.name = name;
		this.surname = surmane;
		this.wiek = wiek;
	}
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
	 * @return the surmane
	 */
	public String getSurmane() {
		return surname;
	}
	/**
	 * @param surmane the surmane to set
	 */
	public void setSurmane(String surmane) {
		this.surname = surmane;
	}
	/**
	 * @return the wiek
	 */
	public int getWiek() {
		return wiek;
	}
	/**
	 * @param wiek the wiek to set
	 */
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surmane=" + surname + ", wiek="
				+ wiek + "]";
	}
	
	
	
}
