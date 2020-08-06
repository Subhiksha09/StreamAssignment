package com.capg.streamapi;

import java.util.function.Predicate;

public class FilterClass {
	
	public static Predicate <String> startingWithPrefix (String str) {
		
		return result -> result.startsWith(str);
		                 
	}
}
