package data;

public class Painting extends Item {
	private int height;
	private int width;
	private boolean isWatercolour;
	private boolean isFramed;
	
	public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
		super(value, creator);
		this.height = height;
		this.width = width;
		this.isWatercolour = isWatercolour;
		this.isFramed = isFramed;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean getisWatercolour() {
		return isWatercolour;
	}

	public void setWatercolour(boolean isWatercolour) {
		this.isWatercolour = isWatercolour;
	}

	public boolean isFramed() {
		return isFramed;
	}

	public void setFramed(boolean isFramed) {
		this.isFramed = isFramed;
	}

	public String toString(){
		String info1, info2;
		if(this.isWatercolour){
			info1 = " it is WaterColour";
		} else{
			info1 = " it is not Watercolour";
		}
		if(this.isFramed){
			info2 = " it is framed";
		}else{
			info2 = " it is not framed";
		}

		return "PAINTING --\t" +"[" +super.toString() + " Height: " + this.height + " Width: " + this.width + info1 + info2+"]";
	}

	
}