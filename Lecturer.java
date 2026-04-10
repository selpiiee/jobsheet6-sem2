public class Lecturer {
    String id, name;
    boolean gender;
    int age;

    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID\t: " + id + "Name\t" + name + " Gender\t: " + genderStr + "Age\t: " + age);
    }
}