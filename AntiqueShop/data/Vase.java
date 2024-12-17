package data;

public class Vase extends Item {
	private int height;
	private String material;

	public Vase(int value, String creator, int height, String material) {
		super(value, creator);
		this.height = height;
		this.material = material;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "VASE --\t \t" +"["+ super.toString() + ",  Height:" + this.height +",  Material:" + this.material+"]";
	}
}