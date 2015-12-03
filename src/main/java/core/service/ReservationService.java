package core.service;

import core.entity.Reservation;
import core.entity.Room;
import core.entity.RoomClass;
import core.entity.RoomType;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by employee on 12/3/15.
 */
public interface ReservationService {

    Reservation getReservationById(int id);

    List<Reservation> getAllReservationByRoomNumber(int number);

    List<Reservation> getAllReservations();

    void addReservation(Reservation room);

    void deleteReservation(Reservation room);

    void updateReservation(Reservation room);

}
