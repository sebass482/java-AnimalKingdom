package animals;

public class Mammals extends Animal {
    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return " Walk ";
    }

    ;

    @Override
    public String breath() {
        return " Lungs ";
    }

    ;

    @Override
    public String reproduce() {
        return " Live Birth ";
    }

    ;

}