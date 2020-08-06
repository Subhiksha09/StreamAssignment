package com.capg.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapperClass {
	
	public static Function<String, CharacterCount> getDistinctCharactersCount()
	{
		return result->
		{
			List <Character> characters = new ArrayList<Character>();
			
			for(char c: result.toCharArray())
			{
				characters.add(new Character(c));
			}
			
			return new CharacterCount(result, characters.size());
		};
	}

}
