package data;

public class Statue extends Item {
	private int weight;
	private String color;
	
	public Statue(int value, String creator, int weight, String color) {
		super(value, creator);
		this.weight = weight;
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "STATUE --\t" +"["+ super.toString() + ", weight=" + this.weight + ", color=" + this.color + "]";
	}

}