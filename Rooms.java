public class RoomDesign {
private String wallColor;
private String floorType;
private int window;
private String otherRooms;

public RoomDesign() {
	this.wallColor = "yellow";
	this.floorType = "hard wood";
	this.window = 1;
	this.otherRooms = "Other room";

}

public void setOtherRoom(String otherRooms) {
	this.otherRooms = otherRooms;
}

public String getotherRooms() {
	return this.otherRooms;
}


public void setWallColor (String wallColor) {
	this.wallColor = wallColor;
	
}

public String getwallColor() {
	return this.wallColor;
}

public void setFloorType (String floorType) {
	this.floorType = floorType;
}

public String getFloorType(){
	return this.floorType;
}

public void setwindow (int window) {
	this.window = window;
}

public int getwindow() {
	return this.window;
}


public String toString() {
	return this.otherRooms + " has " + this.wallColor + " walls. " + "It also has " + this.floorType + " floors, and " + this.window + " window.";
}
}

