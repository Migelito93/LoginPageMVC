package se.login;

public class Auth {
	
	private String name,password,value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	protected String[] accounts = new String[]{ "admin","admin1","Marcel","Marcel1","Jeppa","Jeppa1"};

	public boolean validate() {
		if ((name.equals(accounts[0]) && password.equals(accounts[1]))
				|| ((name.equals(accounts[2]) && password.equals(accounts[3])))
				|| ((name.equals(accounts[4]) && password.equals(accounts[5])))) {
			return true;
		} else {
			return false;
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
