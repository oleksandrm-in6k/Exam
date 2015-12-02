package web.controller.api;

import core.entity.Room;
import core.service.RoomService;
import core.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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



    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Room room) {
        roomService.addRoom(room);
    }

/*
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void create(@PathVariable("id") Integer id) {
        Note note = noteService.getNoteById(id);
        noteService.removeNote(note);
    }
*/
}