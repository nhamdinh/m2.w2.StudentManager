import java.util.Scanner;

public class Person {

    private String name;
    private String gender;
    private String birthday;
    private String address;

//    private String rollNo;
//    private float mark;
//    private String email;

    public Person() {
    }

//    public Person(String name, String gender, String birthday, String address) {
//        this.name = name;
//        this.gender = gender;
//        this.birthday = birthday;
//        this.address = address;
//    }


    public void inputInfo() {
        Scanner dataStudent = new Scanner(System.in);

        System.out.println(" Enter your name: ");
        name = dataStudent.nextLine();

        System.out.println(" Enter your gender: ");
        gender = dataStudent.nextLine();

        System.out.println(" Enter your birthday: ");
        birthday = dataStudent.nextLine();

        System.out.println(" Enter your address: ");
        address = dataStudent.nextLine();
    }


    public void showInfo() {
        System.out.println(" name is " + name + "; gender is " + gender +
                " ; birthday is " + birthday + " ; address is " + address);
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
