package project;

public class Customers {

	class Customer {

		// declare variables
		String firstName;
		String lastName;
		char middleName;
		long streetNum;
		String streetName;
		String city;
		String state;
		long zipCode;

		// create a non-arg constructor
		Customer() {

		}

		// create a constructor with args
		Customer(String newFirstName, String newLastName, char newMiddleName,
				long newStreetNum, String newStreetName, String newCity,
				String newState, long newZipCode) {

			firstName = newFirstName;
			lastName = newLastName;
			middleName = newMiddleName;
			streetNum = newStreetNum;
			streetName = newStreetName;
			city = newCity;
			state = newState;
			zipCode = newZipCode;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName
		 *            the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName
		 *            the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the middleName
		 */
		public char getMiddleName() {
			return middleName;
		}

		/**
		 * @param middleName
		 *            the middleName to set
		 */
		public void setMiddleName(char middleName) {
			this.middleName = middleName;
		}

		/**
		 * @return the streetNum
		 */
		public long getStreetNum() {
			return streetNum;
		}

		/**
		 * @param streetNum
		 *            the streetNum to set
		 */
		public void setStreetNum(long streetNum) {
			this.streetNum = streetNum;
		}

		/**
		 * @return the streetName
		 */
		public String getStreetName() {
			return streetName;
		}

		/**
		 * @param streetName
		 *            the streetName to set
		 */
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city
		 *            the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state
		 *            the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the zipCode
		 */
		public long getZipCode() {
			return zipCode;
		}

		/**
		 * @param zipCode
		 *            the zipCode to set
		 */
		public void setZipCode(long zipCode) {
			this.zipCode = zipCode;
		}

	}
}
