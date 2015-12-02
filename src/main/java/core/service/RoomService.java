package core.service;

import core.entity.Room;
import core.entity.RoomClass;
import core.entity.RoomType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public interface RoomService {

    Room getRoomById(int id);

    Room getRoomByNumber(int number);

    List<Room> getAllRooms();

    List<Room> getRoomsByType(RoomType roomType);

    List<Room> getRoomsByClass(RoomClass roomClass);

    List<Room> getRoomsByPriceRange(BigDecimal from, BigDecimal to);

    void addRoom(Room room);

    void deleteRoom(Room room);

    void updateRoom(Room room);



}
