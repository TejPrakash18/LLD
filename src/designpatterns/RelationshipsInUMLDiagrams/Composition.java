package RelationshipsInUMLDiagrams;

import java.util.ArrayList;
import java.util.List;

class House{
    String address;
    List<Room> rooms;

    House(String address){
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    void addRoom(String roomName){
        rooms.add(new Room(roomName));
    }
}

class Room{
    String name;
    Room(String name){
        this.name = name;
    }

}
public class Composition {
    public static void main(String[] args) {
        House house = new House("123 Main St");
        house.addRoom("Living Room");
        house.addRoom("Bedroom");

        System.out.println("House at " + house.address + " has rooms:");
        for (Room room : house.rooms) {
            System.out.println("- " + room.name);
        }
    }
}
