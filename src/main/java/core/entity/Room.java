package core.entity;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
@Validated
public class Room {

    @Id
    @GeneratedValue
    private int id;

    @Min(1)
    @Max(1000)
    @Column(name = "number")
    private int number;

    @Column(name = "room_type")
    private RoomType roomType;

    @Column(name = "room_class")
    private RoomClass roomClass;

    @Min(0)
    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomClass getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(RoomClass roomClass) {
        this.roomClass = roomClass;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

}
