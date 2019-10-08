package by.epam.Unit3;

import by.epam.Unit3.Counter.Counter;
import by.epam.Unit3.Customer.Customer;
import by.epam.Unit3.Customer.CustomerLogic;
import by.epam.Unit3.Customer.Shop;
import by.epam.Unit3.Student.Student;
import by.epam.Unit3.Student.StudentLogic;
import by.epam.Unit3.Time.Time;
import by.epam.Unit3.Train.Train;
import by.epam.Unit3.Train.TrainLogic;

public class Main {

    public static void main(String[] args) {
        Student [] students = new Student[10];
        for (int i = 0; i < 10; ++i) {
            students[i] = new Student();
        }
        int [] excellent = new int[]{9,9,9,9,9};
        students[5].setFullName("qwer");
        students[5].setGroup(746744);
        students[5].setAcademicPerformance(excellent);

        students[6].setFullName("asdf");
        students[6].setGroup(750502);
        students[6].setAcademicPerformance(excellent);

        for (Student i: students) {
            if(StudentLogic.isExcellentStudent(i)){
                System.out.println(i.getFullName() + " " + i.getGroup());
            }
        }


        Train [] trains = new Train[5];
        trains[0] = new Train();
        trains[0].setDestinationPoint("c");
        trains[0].setTrainNumber(1);
        Time time0 = new Time(15, 0,0);
        trains[0].setDepartureTime(time0);

        trains[1] = new Train();
        trains[1].setDestinationPoint("b");
        trains[1].setTrainNumber(1);
        Time time1 = new Time(23, 0,0);
        trains[1].setDepartureTime(time1);

        trains[2] = new Train();
        trains[2].setDestinationPoint("c");
        trains[2].setTrainNumber(1);
        Time time2 = new Time(23, 0,0);
        trains[2].setDepartureTime(time2);

        trains[3] = new Train();
        trains[3].setDestinationPoint("c");
        trains[3].setTrainNumber(1);
        Time time3 = new Time(18, 1,0);
        trains[3].setDepartureTime(time3);

        trains[4] = new Train();
        trains[4].setDestinationPoint("h");
        trains[4].setTrainNumber(1);
        Time time4 = new Time(23, 6,0);
        trains[4].setDepartureTime(time4);

        TrainLogic.sortTrainsByDestination(trains);
        for (Train i: trains) {
                System.out.println(i.getDestinationPoint() + " " + i.getDepartueTime());
           }

        Counter counter = new Counter(0, 0, 15);
        while(!counter.isOnRightBound()){
            System.out.print(counter.getCount() + " ");
            counter.countUp();
        }
        System.out.println();
        while(!counter.isOnLeftBound()){
            System.out.print(counter.getCount() + " ");
            counter.countDown();
        }
        System.out.println();
        Customer [] customers = new Customer[5];
        customers[0] = new Customer(5);
        customers[0].setSurname("dhd");
        customers[1] = new Customer(15);
        customers[1].setSurname("bjht");
        customers[2] = new Customer(25);
        customers[2].setSurname("asd");
        customers[3] = new Customer(1);
        customers[3].setSurname("cdyrjdr");
        customers[4] = new Customer(107);
        customers[4].setSurname("exc");
        Shop shop = new Shop(customers);
        shop.setCustomers(CustomerLogic.sortBySurname(shop.getCustomers()));
        for (Customer i: shop.getCustomers()) {
            if(CustomerLogic.isCardInInterval(i, 20, 200)){
                System.out.println(i.getCreditCardNumber());
            }
        }
    }

    }
