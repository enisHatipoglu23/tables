package TableTwo;

import tableOne.FoodTime;

public class Kebab extends FoodTime{

	String menuItem = "Kebab";
	String typeAnnotation = "Food";
	
	public Kebab(String retention, String target, String menuItem, String typeAnnotation) {
		super(retention);
		this.menuItem = menuItem;
		this.typeAnnotation = typeAnnotation;
	}
	
	public static void kebabPrice() {
		setAnnotation("Kebab");
		
		FoodTime.price();
	}
	
	public static void kebabTime() {
		setAnnotation("Kebab");
		setTarget("Prepare");
		setTarget("Cook");
		setTarget("Send");
		FoodTime.takes();
	}

	
	private static void setTarget(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public String getTypeAnnotation() {
		return typeAnnotation;
	}

	public void setTypeAnnotation(String typeAnnotation) {
		this.typeAnnotation = typeAnnotation;
	}

	
	
}
