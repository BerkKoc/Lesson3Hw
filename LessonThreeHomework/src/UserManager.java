
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar� ile kay�t oldu.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar� ile sislindi.");
	}

}
