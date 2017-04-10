public class Person {

    private String name;
    private String homeTown;

    public Person(String name, String hometown) {
        this.name = name;
        this.homeTown = hometown;
    }

    public String toString() {
        return name + " from " + homeTown;
    }
    // zil moon : For example, ``new Person("Bob", "Baltimore").toString()`` would return ``Bob from Baltimore``
    public String getName() {
        return name;
    }
    public String getHomeTown() {
        return homeTown;
    }
}
