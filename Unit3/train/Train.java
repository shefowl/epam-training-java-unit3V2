package by.epam.unit3.train;

import by.epam.unit3.time.Time;

import java.util.Objects;

public class Train {
    private String destinationPoint;
    private int trainNumber;
    private Time departureTime;

    public Train() {
        destinationPoint = "UNKNOWN";
        trainNumber = 0;
        departureTime = new Time();
    }

    public Train(String destinationPoint, int trainNumber, Time departureTime) {
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null){
            return false;
        }

        if(this.getClass() != o.getClass()){
            return false;
        }

        Train train = (Train) o;
        return getTrainNumber() == train.getTrainNumber() &&
                Objects.equals(getDestinationPoint(), train.getDestinationPoint()) &&
                Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestinationPoint(), getTrainNumber(), departureTime);
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Time getDepartueTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
}
