package web.controller.api;

import core.entity.Reservation;
import core.entity.Room;
import core.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/reservations")
public class ReservationsController {

    @Autowired
    private ReservationService reservationService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Reservation> index() {
        return reservationService.getAllReservations();
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
    }

//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void create(@PathVariable("id") Integer id) {
//        Room room = roomService.getRoomById(id);
//        roomService.deleteRoom(room);
//    }

}