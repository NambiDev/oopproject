package ooptask;

public class righteye extends patient{
    boolean isOpened;
    String color;

    public righteye(String name, int age, String medicalCondition, boolean isOpened, String color) {
        super(name, age, medicalCondition);
        this.isOpened = isOpened;
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
