public class RoomDriver {
	public static void main(String [] args) {
		RoomDesign otherRooms = new RoomDesign();
		otherRooms.setOtherRoom("First room");
		otherRooms.setWallColor("yellow");
		otherRooms.setFloorType("hard wood");
		otherRooms.setwindow(1);
		System.out.println(otherRooms);
		
		RoomDesign secondRoom = new RoomDesign();
		secondRoom.setOtherRoom("Second room");
		secondRoom.setWallColor("purple");
		secondRoom.setFloorType("tiled");
		secondRoom.setwindow(0);
		System.out.println(secondRoom);
		
		RoomDesign lastRoom = new RoomDesign();
		lastRoom.setOtherRoom("Third room");
		lastRoom.setWallColor("white");
		lastRoom.setFloorType("carpeted");
		lastRoom.setwindow(3);
		System.out.println(lastRoom);
	}
	}

