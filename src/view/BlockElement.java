package view;

public enum BlockElement {
	BORDER_LEFT(1),
	BORDER_TOP(2),
	BORDER_RIGHT(4),
	BORDER_BOTTOM(8),
	POINT(16);
	
	private final int value;
	
	BlockElement(final int newValue) {
		value = newValue;
	}
	
	public int getValue() {
		return value;
	}
}
