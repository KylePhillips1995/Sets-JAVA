import java.util.*;
public class SetExample {

	public static <Type> Set<Type> setUnion(Set<Type> A, Set<Type> B){
	
		Set<Type> result = new TreeSet<Type>();
		
		Iterator<Type> iterA = A.iterator();
		
		while (iterA.hasNext()) {
			
			result.add(iterA.next());
			
		}
		
		Iterator <Type> iterB = B.iterator();
		
		while(iterB.hasNext()) {
			
			result.add(iterB.next());
			
		}
		return result;
		
	}
	
	
	public static<Type> Set<Type> SetIntersection(Set<Type> A, Set<Type> B){
		
		
		Set<Type> result = new TreeSet<Type>();
		Iterator <Type> iterA = A.iterator();
		
		while(iterA.hasNext()) {
			
			Type value = iterA.next();
			if(B.contains(value)) {
				
				result.add(value);
			}
			
		}
		
		return result;
		
		
	}
	
	
	public static<Type> Set<Type> SetDifference(Set<Type> A, Set<Type> B){
		
		Set<Type> result = new TreeSet<Type>();
		Iterator<Type> iterA = A.iterator();
		
		while(iterA.hasNext()) {
			
			Type value = iterA.next();
			
			if(! B.contains(value)) {
				
				result.add(value);
			}
		}
		
		
		return result;
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String[] array = {"Bill", "Xavior", "Cat", "Mouse", "Horse", "Bill", "Cat"};
		
		Set<String> sample1 = new HashSet<String>();
		Set<String> sample2 = new TreeSet<String>();
		
		
	for (int i = 0; i <array.length; i++) {
		System.out.println("");
		System.out.println(array[i]);
		System.out.println(sample1.add(array[i]));
		System.out.println(sample2.add(array[i]));
	}
		
	
	System.out.println("");
	System.out.println(sample1);
	System.out.println(sample2);
	
	System.out.println("----------------------------------------------------");
	Set<String> x1 = new HashSet<String>();
	Set<String> x2 = new HashSet<String>();
	x1.add("Sam");
	x1.add("Bill");
	x1.add("Sally");
	x2.add("Bill");
	x2.add("Sam");
	x2.add("Kathy");
	
	System.out.println(setUnion(x1, x2));
	System.out.println(SetIntersection(x1, x2));
	System.out.println(SetDifference(x1, x2));
	System.out.println("----------------------------------------------------");
	
	Set<String> setUnion = new TreeSet<String>();
	Set<String> setIntersection = new TreeSet<String>();
	Set<String> setDifference = new TreeSet<String>();
	setUnion.addAll(x1);
	setUnion.addAll(x2);
	setIntersection.addAll(x1);
	setIntersection.retainAll(x2);
	setDifference.addAll(x1);
	setDifference.removeAll(x2);
	 
	System.out.println(setUnion);
	System.out.println(setIntersection);
	System.out.println(setDifference);
	
	
	
	
	
	
	
	
	
	}

}
