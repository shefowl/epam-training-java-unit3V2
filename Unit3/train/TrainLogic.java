package by.epam.unit3.train;

import by.epam.unit3.time.Time;

public class TrainLogic {
    public static Train[] sortTrainsByNumber(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            int min = trains[i].getTrainNumber();
            int minIndex = i;
            for (int j = i+1; j < trains.length; j++) {
                if (trains[j].getTrainNumber() < min) {
                    min = trains[j].getTrainNumber();
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Train tmp = trains[i];
                trains[i] = trains[minIndex];
                trains[minIndex] = tmp;
            }
        }
        return trains;
    }

    public static Train getTrainByNumber(Train[] trains, int number){
        for (Train i: trains) {
            if(i.getTrainNumber() == number){
                return i;
            }
        }
        return null;
    }

    public static Train[] sortTrainsByDestination(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            Train min = trains[i];
            int minIndex = i;
            for (int j = i+1; j < trains.length; j++) {
                for(int k = 0; k < trains[j].getDestinationPoint().length() || k < min.getDestinationPoint().length(); k++){
                    if (trains[j].getDestinationPoint().charAt(k) < min.getDestinationPoint().charAt(k)) {
                        min = trains[j];
                        minIndex = j;
                        k = 0;
                        break;
                    }
                    else{
                        if(trains[j].getDestinationPoint().charAt(k) != min.getDestinationPoint().charAt(k)){
                            break;
                        }
                    }
                }
                if(trains[j].getDestinationPoint().equals(min.getDestinationPoint())) {
                    Time minTime = min.getDepartueTime();
                        if ((trains[j].getDepartueTime().getHour() < minTime.getHour()) ||
                                (trains[j].getDepartueTime().getHour() == minTime.getHour() &&
                                        trains[j].getDepartueTime().getMinute() < minTime.getMinute()))
                        minIndex = j;
                  //  }
                }
            }
            if (i != minIndex) {
                Train tmp = trains[i];
                trains[i] = trains[minIndex];
                trains[minIndex] = tmp;
            }
        }
        return trains;
    }

}
