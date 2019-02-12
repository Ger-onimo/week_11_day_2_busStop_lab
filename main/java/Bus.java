import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }
    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int passengerCount(){
        return this.passengers.size();
    }
    public void addPassenger(){
        Person person = new Person();
        if (this.passengers.size() < getCapacity()) {
            this.passengers.add(person);
        }
    }

    public void addPassengerFromQueue(BusStop busStop){
        if (this.passengers.size() < getCapacity()) {
            Person person = busStop.removePerson();
            this.passengers.add(person);
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }
}
