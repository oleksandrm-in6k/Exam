package core.dao;

import core.entity.Reservation;

import java.time.LocalDate;

/**
 * Created by employee on 12/2/15.
 */
public interface ReservationDao extends BaseDao<Reservation> {

    Reservation getReservationsInDate(LocalDate date);

}
