
public class UserLoginManager {
	void add(UserLogin userLogin) {
		System.out.println("Kullan�c� Eklendi : " + userLogin.getLastName());		
	}
	
	void delete(UserLogin userLoginDelete) {
		System.out.println("Kullan�c silindi : " + userLoginDelete.getLastName());
	}
}
