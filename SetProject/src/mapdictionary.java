import java.util.*;
import java.io.*;

public class mapdictionary {

public static void main(String[] args) throws IOException{
	

	Map<String, LinkedList<String>> dictionary = new TreeMap<String, LinkedList<String>>();
	
	String word1 = "circle"; 
	String defn1 = "A set of points at a certain point form a center in a plane";
	
	String word2 = "circle";
	String defn2 = " An object whose area is rad * rad * pi";
	String word3 = "Rectangle";
	String defn3 = "A quad with 4 right angles";
	String word4 = "Rectangle";
	String defn4 = "A quad with congruent diagonals that bisect each other";
	String word5 = "Box";
	String defn5 = " A 3 dimensional object with 6 rectangles as faces";
	String word6 = "Box";
	String defn6 = "A Object with 3 dimensions, length, width, height";
	
	
	if(dictionary.get(word1) == null) {
			
		LinkedList<String> list = new LinkedList<String>();
		list.add(defn1);
		dictionary.put(word1, list);
		
		}
	
	else {
	
		dictionary.get(word1).add(defn1);
		
	}
		
	if(dictionary.get(word2) == null) {
			
		LinkedList<String> list = new LinkedList<String>();
		list.add(defn2);
		dictionary.put(word2, list);
		
		}
	
	else {
	
		dictionary.get(word2).add(defn2);
		
	}	
		
	if(dictionary.get(word3) == null) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add(defn3);
		dictionary.put(word3, list);
	
	}
	
	else {
	
		dictionary.get(word3).add(defn3);
	
	}
	
	if(dictionary.get(word4) == null) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add(defn4);
		dictionary.put(word4, list);
	
	}
	
	else {
	
	dictionary.get(word4).add(defn4);
	
	}
	
	if(dictionary.get(word5) == null) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add(defn5);
		dictionary.put(word5, list);
	
	}
	
	else {
	
		dictionary.get(word5).add(defn5);
	
	}	
	
	
	if(dictionary.get(word6) == null) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add(defn6);
		dictionary.put(word6, list);
	
	}
	
	else {
	
		dictionary.get(word6).add(defn6);
	
	}
	
	
	System.out.println(dictionary);
	
	
	String file = "Dictionary.txt";
	BufferedWriter outfile = new BufferedWriter(new FileWriter(file));
	
	for(String word: dictionary.keySet()) {
		
		outfile.write(word + ": ");
		
		for (int i = 0; i < dictionary.get(word).size(); i++) {
			
			outfile.write(dictionary.get(word).get(i) + "." );
		}
	
		outfile.write("\r\n");
	}
	
		outfile.close();
	
	
		
		
		
	File inFile = new File("Dictionary.txt");
	Scanner scan = new Scanner(inFile);
	Map<String, LinkedList<String>> dictionary2 = new TreeMap<String, LinkedList<String>>();
	
	while(scan.hasNext())
	{
		String line = scan.nextLine();
		StringTokenizer tokenizer1 = new StringTokenizer(line, ":.\r\n");
		String word = tokenizer1.nextToken();
		while(tokenizer1.hasMoreTokens()) {
			String definition = tokenizer1.nextToken();
			if(dictionary2.get(word) == null) {
				LinkedList<String> newList = new LinkedList<String>();
				newList.add(definition);
				dictionary2.put(word, newList);
		}
			
			else { 
				dictionary2.get(word).add(definition);
				}
		
		
		}}
	

scan.close();
System.out.println(dictionary2);

}




}
	
		
	
	
		
		
	
