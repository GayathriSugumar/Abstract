package Abstract.InterviewPortal;

public class InterviewTester {

	public static void main(String[] args) {
		InfosysInterviewPortal infosys=new InfosysInterviewPortal();
		infosys.login("gayu", "3333");
		infosys.interviewSchedule();
		infosys.prepareQuestionSet();
		infosys.takeTest();
		infosys.viewResult();
		infosys.logout();
		System.out.println();
		
		WiproInterviewPortal wipro=new WiproInterviewPortal();
		wipro.login("gayu", "0003");
		wipro.interviewSchedule();
		wipro.prepareQuestionSet();
		wipro.takeTest();
		wipro.viewResult();
		wipro.logout();
		
	}

}
