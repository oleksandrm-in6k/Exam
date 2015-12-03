package web.controller.api;

import core.entity.Room;
import core.entity.RoomFilter;
import core.entity.RoomType;
import core.service.RoomService;
import core.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping(value = "/api/rooms")
public class RoomsController {

    @Autowired
    private RoomService roomService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Room> index() {
        return roomService.getAllRooms();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Room getRoom(@PathVariable("id") Integer id) {
        return roomService.getRoomById(id);
    }


    @RequestMapping(value = "", method = RequestMethod.POST)

    public void create(@RequestBody Room room, HttpServletResponse response) {

        if (!roomService.isValid(room)) {
            response.setStatus(400);
            return;
        }
        response.setStatus(201);
        roomService.addRoom(room);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void create(@PathVariable("id") Integer id) {
        Room room = roomService.getRoomById(id);
        roomService.deleteRoom(room);
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public List<Room> find(@RequestBody RoomFilter roomFilter) {
        List<Room> allRooms = roomService.getAllRooms();

        return roomService.applyFilter(roomFilter, allRooms);
    }

}