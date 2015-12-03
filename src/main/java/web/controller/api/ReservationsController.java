package web.controller.api;

import core.entity.Reservation;
import core.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/rooms")
public class ReservationsController {

//    @Autowired
//    private ReservationService reservationService;

//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public List<Room> index() {
//        return roomService.getAllRooms();
//    }
//
//
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.CREATED)
//    public void create(@RequestBody Room room) {
//        roomService.addRoom(room);
//    }
//
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void create(@PathVariable("id") Integer id) {
//        Room room = roomService.getRoomById(id);
//        roomService.deleteRoom(room);
//    }

}