package com.capg.streamapi;

public class CharacterCount {
	
	private String stringName;
	private int distinctCharacterCount;
	
	
	public CharacterCount(String stringName, int distinctCharacterCount) {
		super();
		this.stringName = stringName;
		this.distinctCharacterCount = distinctCharacterCount;
	}


	@Override
	public String toString() {
		return "CharacterCount [stringName=" + stringName + ", distinctCharacterCount=" + distinctCharacterCount + "]";
	}
	
	
	
	

}
