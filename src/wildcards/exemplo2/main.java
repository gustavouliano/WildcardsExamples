package wildcards.exemplo2;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		Collection<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(5);
		integerSet.add(1);
		integerSet.add(5);
		
		Collection<Double> doubleList = List.of(1.2, 5.4, 1.2);
		
		printCollection(integerSet);
		printCollection(doubleList);
	}
	
	public static void printCollection(Collection<?> collection) {
		for(Object value : collection) {
			System.out.print(value + " | ");
		}
	}
}
