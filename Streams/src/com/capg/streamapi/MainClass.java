package com.capg.streamapi;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("aaryanna", "aayanna", "airianna",
				"alassandra", "allanna", "allannah","allessandra", "allianna", 
				"allyanna", "anastaisa", "anastashia", "anastasia", "annabella", 
				"annabelle", "annebelle");
		
		names.stream().filter(FilterClass.startingWithPrefix("anast"))
		.map(MapperClass.getDistinctCharactersCount()).forEachOrdered(System.out::println);
		
		}
	}

