package animals;

abstract class Animal {
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public Animal(String name, int yearDiscovered) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //UNSURE
    public String eat() {
        return "Eat";
    }

    ;

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    abstract String move();

    abstract String breath();

    abstract String reproduce();

    @Override
    public String toString() {
        return "Animals{id = " + id + ", name=" + name + " yearNamed=" + yearDiscovered + "}\n";
    }
}
