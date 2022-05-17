package apiit.myjava.day6.functional.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	/**
	 * filter() -  remove the elem upon Predicate
	 * 
	 */
	
	/**
	 * REQ: Given nameList, remove a target name.
	 * 	//john, ali, kau, mutu
	 * 
	 * 	//remove "john"
	 */
	
	//1)
	List<String> remove( String[] arr, String obj2Remove){
		List<String> newLst = new ArrayList<>();
		for (String name : arr) {
			if(name.equalsIgnoreCase(obj2Remove))
				continue;
			newLst.add(name);
		}
		return newLst;
	}
	
	public static void main(String[] args) {
		String[] nameLst = {"john", "ali","kau","mutu"};
	
		System.out.println("--- ORIGINAL LIST ---");
		Arrays.asList(nameLst).stream().forEach(System.out :: println);
		
		System.out.println();

		System.out.println("--- FILTERED LIST ---");	
		String nameToRemove = "john";
//		1)
//		List<String> filteredLst = new Demo().remove(nameLst, nameToRemove);

//		//2
		List<String> filteredLst = Arrays.asList(nameLst).stream()
			.filter( elem -> !elem.equalsIgnoreCase(nameToRemove)) 
			.collect( Collectors.toCollection( ArrayList :: new ) );
	
		
		filteredLst.forEach(System.out :: println);
				
		
	}
	
}





