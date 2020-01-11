import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Choose = ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    int n= 0;
                    System.out.println("Enter number add student ");
                    n = Integer.parseInt(scan.nextLine());

                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputInfo();
                        studentsList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentsList.size(); i++) {
                        studentsList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;
                    minMark = studentsList.get(0).getMark();
                    maxMark = studentsList.get(0).getMark();
                    for (int i = 1; i < studentsList.size(); i++) {
                        if (studentsList.get(i).getMark() < minMark) {
                            minIndex = i;
                            minMark = studentsList.get(i).getMark();
                        }
                        if (studentsList.get(i).getMark() > maxMark) {
                            maxIndex = i;
                            maxMark = studentsList.get(i).getMark();
                        }
                    }
                    System.out.println("mark highest ");
                    studentsList.get(maxIndex).showInfo();

                    System.out.println(" mark lowest");
                    studentsList.get(minIndex).showInfo();
                    break;
                case 4:
                    System.out.println("Enter rollNo need find: ");
                    String rollNoSearch = scan.nextLine();
                    int count = 0;

                    for (Student student : studentsList) {
                        if (student.getRollNo().equalsIgnoreCase(rollNoSearch)) {
                            student.showInfo();
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println(" Can not Find !!!");
                    }
                    break;

                case 5:
                    Collections.sort(studentsList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            int cmp = student.getName().compareTo(t1.getName());
                            if (cmp >= 0) {
                                return 1;
                            }
                            return -1;
                        }
                    });
                    for (int i = 0; i < studentsList.size(); i++) {
                        studentsList.get(i).showInfo();
                    }
                    break;
                case 6:
                    Collections.sort(studentsList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            return student.getMark() >= t1.getMark()? -1:1;
                        }
                    });
                    for (int i = 0; i < studentsList.size(); i++) {
                        if (studentsList.get(i).checkStudentship()){
                            studentsList.get(i).showInfo();
                        }
                    }
                    break;
                case 7:
                    System.out.println(" goodbye!!");
                    break;
                default:
                    System.err.println(" Enter wrong!!");
                    break;

            }
        } while (choose != 7);
    }

    static void showMenu() {
        System.out.println("1.Enter N students ");
        System.out.println("2.Show info students ");
        System.out.println("3.Show mark highest and lowest of students ");
        System.out.println("4.Find students follow rollNo ");
        System.out.println("5.Sort by A to Z then show ");
        System.out.println("6.Show students have studentship");
        System.out.println("7.Exit");
    }

}
