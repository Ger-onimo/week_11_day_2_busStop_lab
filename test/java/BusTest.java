import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Bus bus1;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Leith", 50);
        bus1 = new Bus("Porty", 1);
        person = new Person();
        busStop = new BusStop("Shandwick Place");
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.addPerson(person);

    }

    @Test
    public void busHasDestination(){
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void busHasACapacity(){
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void canAddPassenger() {
        bus.addPassenger();
        assertEquals(1, bus.passengerCount());

    }
    @Test
    public void canAddPassengerAtCapacity() {
        bus1.addPassenger();
        bus1.addPassenger();
        assertEquals(1, bus1.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger();
        assertEquals(1, bus.passengerCount());
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengersFromQueue(){
        assertEquals(3, busStop.getQueueSize());
        bus.addPassengerFromQueue(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(2, busStop.getQueueSize());
    }
    @Test
    public void cantAddPassengersFromQueue(){
        assertEquals(3, busStop.getQueueSize());
        bus1.addPassengerFromQueue(busStop);
        bus1.addPassengerFromQueue(busStop);
        assertEquals(1, bus1.passengerCount());
        assertEquals(2, busStop.getQueueSize());
    }


}
