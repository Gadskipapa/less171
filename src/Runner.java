import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

       // Person ivan = new Person ("Ivan", "Petrov" , 25, true);
        String fileName = "Ivan.txt";
       // writePersonToFile(ivan,fileName);

        Person tom = new Person("Tom", "Johnes", 40, false);

        Person personFromFile = readPersonFromFile(fileName);
        System.out.println(personFromFile);

//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("tom.txt"))) {
//            dos.writeUTF(tom.getFirstName());
//            dos.writeUTF(tom.getLastName());
//            dos.writeInt(tom.getAge());
//            dos.writeBoolean(tom.isStudent());
//            System.out.println("File has been written ");
//        } catch (IOException ex) {
//            System.out.println(ex.getStackTrace());
//        }
//
//        try(DataInputStream dis = new DataInputStream(new FileInputStream("tom.txt"))) {
//            String name = dis.readUTF();
//            String lastName = dis.readUTF();
//            int age = dis.readInt();
//            boolean isStudent = dis.readBoolean();
//
//            Person person = new Person(name, lastName, age, isStudent);
//            System.out.println(person);
//        } catch (IOException ex) {
//            System.out.println(ex.getStackTrace());
//        }
    }

    public static void writePersonToFile(Person person, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static Person readPersonFromFile (String fileName) {
        Person p = null;
        try (FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream oin = new ObjectInputStream(fis)) {
            p = (Person)oin.readObject();
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
        return p;
    }
}
