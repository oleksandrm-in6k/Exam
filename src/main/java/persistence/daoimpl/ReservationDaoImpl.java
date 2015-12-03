package persistence.daoimpl;

import core.dao.ReservationDao;
import core.entity.Reservation;
import core.entity.Room;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
@Repository
public class ReservationDaoImpl extends BaseDaoImpl<Reservation> implements ReservationDao {

    @SuppressWarnings("unchecked")
    public List<Reservation> getAll() {
        return getSession()
                .createCriteria(Reservation.class)
                .list();
    }

    @SuppressWarnings("unchecked")
    public Reservation getById(int id) {
        return getSession().load(Reservation.class, id);
    }

    public List<Reservation> getByRoomNumber(int number) {


        return sessionFactory.getCurrentSession()
                .createCriteria(Reservation.class)
                .add(Restrictions.eq("room", getSession().load(Room.class, number)))
                .list();

    }

    public Reservation getReservationsInDate(LocalDate date) {
        return null;
    }



}
