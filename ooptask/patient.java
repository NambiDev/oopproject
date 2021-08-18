package ooptask;

public class patient {
    String name;
    int age;
    String medicalCondition;

    public patient(String name, int age, String medicalCondition) {
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
