package project;

public class User extends Customers{
	
	class newUser {
		
		String userName;
		String password;
		String securityQ;
		String securityA;
		
		//no arg constructor
		  newUser () {
			
		}
		
		//constructor with args
		 newUser  (String newuserName, String newpassword,
				String newsecurityQ, String newsecurityA){
			
			userName = newuserName;
			password = newpassword;
			securityQ = newsecurityQ;
			securityA = newsecurityA;
			
		}

		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * @param userName the userName to set
		 */
		public void setUserName(String userName) {
			this.userName = userName;
		}

		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * @return the securityQ
		 */
		public String getSecurityQ() {
			return securityQ;
		}

		/**
		 * @param securityQ the securityQ to set
		 */
		public void setSecurityQ(String securityQ) {
			this.securityQ = securityQ;
		}

		/**
		 * @return the securityA
		 */
		public String getSecurityA() {
			return securityA;
		}

		/**
		 * @param securityA the securityA to set
		 */
		public void setSecurityA(String securityA) {
			this.securityA = securityA;
		}
		 
		 
		 
	}
}

	