
public class Main {

	public static void main(String[] args) {
		
		UserLogin userlogin = new UserLogin();
		userlogin.setId(1);
		userlogin.setLastName("Mustafa AGA");
		userlogin.setName("Mustafa");
		userlogin.setUserName("I�IK");
		
		UserLoginManager userLoginManager = new UserLoginManager();
		userLoginManager.add(userlogin);
		userLoginManager.delete(userlogin);
		
		TrainingCamp training1 = new TrainingCamp(); 
		training1.setId(1);
		training1.setName("C# E�itim Kamp�");
		training1.setInstructorName("Engin Demiro�");
		training1.setPrice(0);
		
		TrainingCamp training2 = new TrainingCamp();
		training2.setId(2);
		training2.setName("Java E�itim Kamp�");
		training2.setInstructorName("Engin Demiro�");
		training2.setPrice(0);
		
		
		TrainingCampManager trainingCampManager = new TrainingCampManager();
		trainingCampManager.add(training1);		
		trainingCampManager.delete(training2);
		
	}

}
