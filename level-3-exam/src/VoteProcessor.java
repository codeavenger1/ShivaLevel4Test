import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		
			for (String num : votes) {
		
				if (num.toLowerCase().contains("edward snowden")) {
					a++;
				} else if (num.toLowerCase().contains("pope francis")) {
					b++;
				}

			}
			if (a == b) {
				return "TIE";
			}
			else if (a>b) {
				return "edward snowden";
			}
			else if (b>a) {
				return "pope francis";
			}
			System.out.println("a" + a);
			System.out.println("b" + b);

			
				
		return null;
}
	}


