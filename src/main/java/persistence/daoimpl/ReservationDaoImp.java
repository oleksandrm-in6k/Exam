//package persistence.daoimpl;
//
//import core.dao.ReservationDao;
//import core.entity.Reservation;
//import core.entity.Room;
//import core.entity.RoomClass;
//import core.entity.RoomType;
//import org.hibernate.criterion.Restrictions;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.List;
//
///**
// * Created by employee on 12/2/15.
// */
//@Service
//public class ReservationDaoImpl extends BaseDaoImpl<Reservation> implements ReservationDao {
//
//    @SuppressWarnings("unchecked")
//    public List<Room> getRoomsByType(RoomType roomType) {
//        return getSession()
//                .createCriteria(Room.class)
//                .add(Restrictions.eq("roomType", roomType))
//                .list();
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<Room> getRoomsByClass(RoomClass roomClass) {
//        return null;
//    }
//
//    @SuppressWarnings("unchecked")
//    public Room getRoomByNumber(int number) {
//        return null;
//    }
//
//
//    @SuppressWarnings("unchecked")
//    public List<Reservation> getAll() {
//        return sessionFactory.getCurrentSession().
//                createCriteria(Room.class).
//                list();
//    }
//
//    @SuppressWarnings("unchecked")
//    public Reservation getById(int id) {
//        return getSession().load(Reservation.class, id);
//    }
//
///*
//    @SuppressWarnings("unchecked")
//    public List<Note> getAll() {
//        return sessionFactory.getCurrentSession()
//                .createCriteria(Note.class)
//                .list();
//    }
//
//    public Note getById(int id) {
//        return getSession().load(Note.class, id);
//    }
//
//
//    @SuppressWarnings("unchecked")
//    public Note getByName(String name) {
//        List<Note> brands = getSession().createCriteria(Note.class).list();
//        for (Note brand : brands) {
//            if ( brand.getName().toLowerCase().equals(name.toLowerCase().trim()) )
//                return brand;
//        }
//        return null;
//    }
//
//    public Note getNoteByName(String name) {
//        return getSession().load(Note.class, name);
//    }
//
//*/
//
//
//}
