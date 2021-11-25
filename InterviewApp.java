package Abstract.InterviewPortal;

abstract public  class InterviewApp {
	
	
	public void login(String userName,String password)
	{
		System.out.println("Login Successfully");
	}
	public void logout()
	{
		System.out.println("Logout Successfully");
	}
	public void viewResult()
	{
		System.out.println("Scores");
	}
	public void interviewSchedule()
	{
		System.out.println("view Schedule");
	}
	
	abstract public void prepareQuestionSet();
	abstract public void takeTest();
}
