package core.service.impl;

import core.dao.ReservationDao;
import core.entity.Reservation;
import core.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {


    @Autowired
    private ReservationDao reservationDao;

    public Reservation getReservationById(int id) {
        return reservationDao.getById(id);
    }

    public List<Reservation> getAllReservationByRoomNumber(int number) {
        return reservationDao.getByRoomNumber(number);
    }

    public List<Reservation> getAllReservations() {
        return reservationDao.getAll();
    }

    public void addReservation(Reservation reservation) {
        reservationDao.add(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        reservationDao.delete(reservation);
    }

    public void updateReservation(Reservation reservation) {
        reservationDao.update(reservation);
    }
}
