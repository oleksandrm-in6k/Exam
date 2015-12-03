package core.dao;

import core.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by employee on 12/2/15.
 */
public interface ReservationDao extends BaseDao<Reservation> {

    List<Reservation> getByRoomNumber(int number);

    Reservation getReservationsInDate(LocalDate date);

}
