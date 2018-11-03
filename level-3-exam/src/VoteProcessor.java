import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		for (int i = 0; i < votes.size(); i++) {
			String n = votes.get(i);
			for(String num : votes) {
				votes.indexOf(num);
				if (votes.size()>num.length()) {
					n = num;
			}
			
				
			}
			
			return n;
			
			}
		
		
		return null;
	}

}
