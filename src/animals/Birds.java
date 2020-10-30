package animals;

public class Birds extends Animal {
    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return " Fly ";
    }

    ;

    @Override
    public String breath() {
        return " Lungs ";
    }

    ;

    @Override
    public String reproduce() {
        return " Eggs ";
    }

    ;

    @Override
    public String toString() {
        String rtnStr = super.toString();
        rtnStr += "\n";
        return rtnStr;
    }
}