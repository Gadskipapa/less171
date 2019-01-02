import java.io.Serializable;

public class Person implements Serializable{

    private static String gender = "male";
    private String firstName;
    private String lastName;
    private int age;
    private boolean isStudent;
    private String newField;
    private static final long serialVersionUID = -2122781621387812643L;

    public Person(String firstName, String lastName, int age, boolean isStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isStudent = isStudent;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public String getNewField() {
        return newField;
    }

    public void setNewField(String newField) {
        this.newField = newField;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                '}';
    }
}
