import java.util.*;

public class setday2 {

	public static void main(String[] args) {
		
		String[] words = {"Namath", "Sauer", "Maynard", "Namath", "Bradshaw", "Maynard", "Namath", "Snell", "Sauer", "Todd","Sauer", "Namath", "Bradshaw"};
		

		Map<String, Integer> mapwords = new TreeMap<String, Integer>();
		
		
		System.out.println("Use a for loop to read the values of the array into the map and count the frequency of each word");
	
		for(int i = 0; i < words.length; i++) {
			
			if(mapwords.get(words[i]) == null) {
				mapwords.put(words[i], new Integer(1));
				
			}
			
			else { mapwords.put(words[i], new Integer(mapwords.get(words[i]).intValue() + 1));
			
		}
		
		
		
		}
		
		
		for(String keyword:mapwords.keySet()) {
			
			System.out.println(keyword + " Frequency: " + mapwords.get(keyword));
			
		}
	}

}
