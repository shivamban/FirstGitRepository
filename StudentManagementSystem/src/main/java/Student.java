public class Student {
    private final String name;
    private final int age;
    private final int rollNumber;


    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }


}
