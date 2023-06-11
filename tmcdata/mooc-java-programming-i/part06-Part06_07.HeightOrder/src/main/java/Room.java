import java.util.ArrayList;
public class Room {
    private ArrayList<Person> people;
    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person returnPerson = this.people.get(0);
        for (Person person : this.people) {
            if (returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }
    
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person shortie = this.shortest();
        this.people.remove(shortie);
        return shortie;
    }
}
