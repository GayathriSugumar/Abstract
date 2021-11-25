package Abstract.InterviewPortal;

public class InfosysInterviewPortal extends InterviewApp {
	
	public InfosysInterviewPortal()
	{
		System.out.println("Infosys Interview Portal");
	}
	
	@Override
	public void prepareQuestionSet() {
		System.out.println("Multiple choice question");
	}
	
	@Override
	public void takeTest() {
		System.out.println("Click any one option");
	}
	
	
}
