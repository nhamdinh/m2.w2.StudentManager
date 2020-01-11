import java.util.Scanner;

public class Student extends Person {
    String rollNo;
    float mark;
    String email;


    public Student() {
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("");

        System.out.print(" rollNo: " + rollNo + "; mark: " + mark +
                "; email: " + email);
        System.out.println("");
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner dataNumber = new Scanner(System.in);

        System.out.println(" Enter your rollNo: ");
        while (true) {
            String rollNoInput = dataNumber.nextLine();
            boolean check = setRollNo(rollNoInput);
            if (check) {
                break;
            }
        }

        // code ngan
        //   while(!setRollNo(dataNumber.nextLine()));

        System.out.println(" Enter your mark: ");
        while (true) {
            float markInput = Float.parseFloat(dataNumber.nextLine());
            boolean check = setMark(markInput);
            if (check) {
                break;
            }
            ;
        }

        System.out.println(" Enter your email: ");

        while (true) {
            String emailInput = dataNumber.nextLine();
            boolean check = setEmail(emailInput);
            if (check) {
                break;
            }
            ;
        }

    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println(" Please enter your rollNo again ( pls enter 8 characters)");
            return false;
        }
    }


    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println(" Please enter your mark again: ( dien so)");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.println(" Please enter your email again: ");
            return false;
        }
    }

    public boolean checkStudentship() {
        if (mark >= 8) {
            return true;
        }
        return false;
    }


}
