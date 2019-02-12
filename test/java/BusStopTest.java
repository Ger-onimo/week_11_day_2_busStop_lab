import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Shandwick Place");
        person = new Person();

    }

    @Test
    public void canAddPersonToStop(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void canRemovePersonFromStop(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueSize());
        busStop.removePerson();
        assertEquals(0, busStop.getQueueSize());
    }

}
