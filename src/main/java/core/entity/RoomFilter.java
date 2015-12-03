package core.entity;

import java.math.BigDecimal;

/**
 * Created by employee on 12/3/15.
 */
public class RoomFilter {


    private RoomType roomType;

    private RoomClass roomClass;

    private BigDecimal pricePerDayFrom;

    private BigDecimal pricePerDayTo;

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

    public BigDecimal getPricePerDayFrom() {
        return pricePerDayFrom;
    }

    public void setPricePerDayFrom(BigDecimal pricePerDayFrom) {
        this.pricePerDayFrom = pricePerDayFrom;
    }

    public BigDecimal getPricePerDayTo() {
        return pricePerDayTo;
    }

    public void setPricePerDayTo(BigDecimal pricePerDayTo) {
        this.pricePerDayTo = pricePerDayTo;
    }

    public Boolean test(Room room) {
        if(roomType != null && roomType != room.getRoomType()) {
            return false;
        }

        if(roomClass != null && roomClass != room.getRoomClass()) {
            return false;
        }

        if(pricePerDayFrom != null && pricePerDayFrom.compareTo(room.getPricePerDay()) > 0) {
            return false;
        }

        if(pricePerDayTo != null && pricePerDayTo.compareTo(room.getPricePerDay()) < 0) {
            return false;
        }

        return true;
        
    }
}
