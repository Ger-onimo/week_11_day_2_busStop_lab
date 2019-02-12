import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name){
        this.queue = new ArrayList<>();
        this.name = name;
    }

    public void addPerson(Person person){
        this.queue.add(person);
    }
    public int getQueueSize(){
        return this.queue.size();
    }

    public Person removePerson(){
        return this.queue.remove(0);
    }


}
