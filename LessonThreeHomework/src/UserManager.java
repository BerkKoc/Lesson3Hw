
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarý ile kayýt oldu.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarý ile sislindi.");
	}

}
