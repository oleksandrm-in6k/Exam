package core.dao;

import core.entity.Room;
import core.entity.RoomClass;
import core.entity.RoomType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public interface RoomDao extends BaseDao<Room> {

    List<Room> getRoomsByType(RoomType roomType);

    List<Room> getRoomsByClass(RoomClass roomClass);

    Room getRoomByNumber(int number);

    List<Room> getRoomsByPriceRange(BigDecimal from, BigDecimal to);

}
