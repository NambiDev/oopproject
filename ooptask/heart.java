package ooptask;

public class heart extends patient{
    int heartBeat;

    public heart(String name, int age, String medicalCondition, int heartBeat) {
        super(name, age, medicalCondition);
        this.heartBeat = heartBeat;
    }

    public int getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(int heartBeat) {
        this.heartBeat = heartBeat;
    }
}
