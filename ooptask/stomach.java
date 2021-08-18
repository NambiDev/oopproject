package ooptask;

public class stomach extends patient{
    boolean isFed;

    public stomach(String name, int age, String medicalCondition, boolean isFed) {
        super(name, age, medicalCondition);
        this.isFed = isFed;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }
}
