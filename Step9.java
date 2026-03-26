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

  public static void main(String[] args) {
      
      printStudentTbl();

      Scanner input = new Scanner(System.in);

      // Enter -> "\n"

      System.out.print("Enter Student's Name: ");
      String name = input.nextLine(); // Kavindu

      System.out.print("Enter Student's Age: ");
      int age = input.nextInt(); // 19
      input.nextLine();

      System.out.print("Enter Student's Address: ");
      String address = input.nextLine(); // Panadura

      String[] newStudent = {name, Integer.toString(age), address}; // {"Kavindu", "19", "Panadura"}

      int tempArrayLength = studentdb.length + 1;
      String[][] temp = new String[tempArrayLength][3];

      for(int i=0; i<studentdb.length; i++) {
        temp[i] = studentdb[i];
      }

      temp[temp.length - 1] = newStudent;

      studentdb = temp;

      printStudentTbl();

      System.out.println("Done!!!");
  }
}