package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {
    private T unit;

    public void in(T t) {
        this.unit = t;
    }

    public T out() {
        T outUnit = unit;
        this.unit = null;
        return outUnit;
    }

    public void showInfo() {
        System.out.println(unit);
    }
}
