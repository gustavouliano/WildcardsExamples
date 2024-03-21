package wildcards.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Integer> integerList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		List<Object> objectList = new ArrayList<>();
		integerList.add(2);
		integerList.add(3);
		doubleList.add(2.1);
		doubleList.add(3.2);
		objectList.add(new Object());
		objectList.add(5);
		
		addUpperBounded(integerList);
		addLowerBounded(objectList);
	}
	
	public static void addUpperBounded(List<? extends Number> list) {
		list.add(5.3); // Erro de compilação, wildcard upper bounded não permite adicionar novos items à lista
	}
	
	public static void addLowerBounded(List<? super Number> list) {
		list.add(5.3);
	}

}
