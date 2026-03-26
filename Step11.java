import java.util.Scanner;

class Main {

  static String[][] studentdb = {}; // 0

  public static void printStudentTbl() {
      System.out.println("+--------------------------------------+");
      System.out.printf("|%-5s|%-13s|%-5s|%-13s|\n", "Id", "Name", "Age", "Address");
      System.out.println("+--------------------------------------+");
      for(int i=0; i<studentdb.length; i++) {
        System.out.printf("|%-5s|%-13s|%-5s|%-13s|\n", i+1 , studentdb[i][0], studentdb[i][1], studentdb[i][2]);
      }
      System.out.println("+--------------------------------------+");
  }

  public static void addStudent() {
      Scanner input = new Scanner(System.in);

      System.out.println("=========== Add Student ============");
      
      System.out.print("Enter Student's Name: ");
      String name = input.nextLine();

      System.out.print("Enter Student's Age: ");
      int age = input.nextInt();
      input.nextLine();

      System.out.print("Enter Student's Address: ");
      String address = input.nextLine();

      String[] newStudent = {name, Integer.toString(age), address}; // {"Kavindu", "19", "Panadura"}

      int tempArrayLength = studentdb.length + 1;
      String[][] temp = new String[tempArrayLength][3];

      for(int i=0; i<studentdb.length; i++) {
        temp[i] = studentdb[i];
      }

      temp[temp.length - 1] = newStudent;

      studentdb = temp;

      System.out.println("Student added successfully!");
  }

  public static void loadStudentMenu() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("================ Student Management ================");

    System.out.println("1. View Student");
    System.out.println("2. Add Student");

    System.out.print("Please enter the option you want proceed:");
    int option = input.nextInt(); // 3

    switch(option) {
      case 1:
        printStudentTbl();
        break;
      case 2:
        addStudent();
        break;
      default:
          System.out.println("Invalid Input!");
          break;
    }
  }

  public static void main(String[] args) {

      while(true) {
        loadStudentMenu();
      }

  }
}