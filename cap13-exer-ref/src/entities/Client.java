package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private Date birthDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public Client() {
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name + ", (" + sdf.format(birthDate) + ") - " + email);
		
		return sb.toString();
	}
}
