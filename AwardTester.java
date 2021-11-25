package Abstract.AwardsShowApp;

public class AwardTester {

	public static void main(String[] args) {
		AMAAwards a1=new AMAAwards();
		a1.login("g3", "bts");
		a1.selectFavoiteGroup();
		a1.selectIdols();
		a1.logout();
		System.out.println();
		MMAAwards a2=new MMAAwards();
		a2.login("g3","bts");
		a2.selectFavoiteGroup();
		a2.selectIdols();
		a2.logout();
	}

}
