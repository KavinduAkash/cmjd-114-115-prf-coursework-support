import java.util.Scanner;

class Main {

  static String[][] studentdb = {};

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
      Scanner input = new Scanner(System.in);

      System.out.print("Enter value 01: ");
      String s1 = input.nextLine();

      System.out.print("Enter value 02: ");
      int n1 = input.nextInt();

      System.out.print("Enter value 03: ");
      String s2 = input.nextLine();

      System.out.println("Done!!!");
  }
}
