package org.elevenfifty.shoppingapplication.beans;

public enum PriorityTexts {
	PRIORITYONE(1, "Grab it now!"), PRIORITYTWO(2, "Need it soon!"), PRIORITYTHREE(3, "It can wait!");
	
	private final String text;
		private final Integer num;
	
	PriorityTexts(Integer num, String text){
		this.num = num;
		this.text = text;
	}
	
	public String getText() {return text; }
		public int getNum() {return num; }
}
