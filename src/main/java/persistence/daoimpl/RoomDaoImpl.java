package persistence.daoimpl;

import core.dao.RoomDao;
import core.entity.Room;
import core.entity.RoomClass;
import core.entity.RoomType;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public class RoomDaoImpl extends BaseDaoImpl<Room> implements RoomDao {

    @SuppressWarnings("unchecked")
    public List<Room> getRoomsByType(RoomType roomType) {
        return getSession()
                .createCriteria(Room.class)
                .add(Restrictions.eq("roomType", roomType))
                .list();
    }

    @SuppressWarnings("unchecked")
    public List<Room> getRoomsByClass(RoomClass roomClass) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public Room getRoomByNumber(int number) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public List<Room> getRoomsByPriceRange(BigDecimal from, BigDecimal to) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public List<Room> getAll() {
        return sessionFactory.getCurrentSession().
                createCriteria(Room.class).
                list();
    }

    @SuppressWarnings("unchecked")
    public Room getById(int id) {
        return getSession().load(Room.class, id);
    }



}
