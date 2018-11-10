import java.util.HashMap;

public class HashMapCalculator {
int num;
	public static void main(String[] args) {
		HashMapCalculator hc = new HashMapCalculator();
		HashMap<String, String> hashmap1 = new HashMap<String, String>();
		HashMap<String, String> hashmap2 = new HashMap<String, String>();
		hc.commonKeyValuePairs(hashmap1, hashmap2);
	}
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		num = 0; //set a counter to keep track of how many entries there are for each person
			
			for(String a : hashmap1.keySet()) { //iterating through each key in hashmap1
				for(String b : hashmap2.keySet() ) { //iterating through each key in hashmap2
					if (a.equals(b)) { //comparing the the keys in the first hashmap to the keys in the second hashmap
						if (hashmap1.get(a).equals(hashmap2.get(b))) { //comparing the values in the first hashmap to the second hashmap
						num+=1; //if there is an entry in each hashmap with the same values and the keys, the counter increases by one 
					}
					}
					
					
				}
			}

			
			return num;
			
		
	}

}
