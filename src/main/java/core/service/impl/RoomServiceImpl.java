package core.service.impl;

import core.dao.RoomDao;
import core.entity.Room;
import core.entity.RoomClass;
import core.entity.RoomFilter;
import core.entity.RoomType;
import core.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;


    public Room getRoomById(int id) {
        return roomDao.getById(id);
    }

    public Room getRoomByNumber(int number) {
        return roomDao.getRoomByNumber(number);
    }

    public List<Room> getAllRooms() {
        return roomDao.getAll();
    }

    public List<Room> getRoomsByType(RoomType roomType) {
        return roomDao.getRoomsByType(roomType);
    }

    public List<Room> getRoomsByClass(RoomClass roomClass) {
        return roomDao.getRoomsByClass(roomClass);
    }

    public List<Room> getRoomsByPriceRange(BigDecimal from, BigDecimal to) {
        return getRoomsByPriceRange(from, to);
    }

    public void addRoom(Room room) {
        roomDao.add(room);
    }

    public void deleteRoom(Room room) {
        roomDao.delete(room);
    }

    public void updateRoom(Room room) {
        roomDao.update(room);
    }

    public List<Room> applyFilter(RoomFilter roomFilter, List<Room> rooms) {
        List<Room> result = new ArrayList<Room>();

        for (Room room: rooms) {
            if (roomFilter.test(room)) {
                result.add(room);
            }
        }

        return result;
    }

    public boolean isValid(Room room){
        if(room.getRoomType() == null || room.getRoomClass() == null || room.getNumber() <= 0 ) {
            return false;
        }

        return true;
    }

}

