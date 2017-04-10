package Junk;
public class Peoplebase {

    Person[] personArray;

    public Peoplebase(Person... people) {
        personArray = people;
    }
    public Person findByName(String name) {
        for (int i = 0; i < personArray.length; i++) {
            if ( name.equals(personArray[i].getName())) {
                return personArray[i];
            }
        }
        return null;
    }
    public Person findByHomeTown(String homeTown) {
        for (int i = 0; i < personArray.length; i++) {
            if (homeTown.equals(personArray[i].getHomeTown())) {
                return personArray[i];
            }
        }
        return null;

    }
}
