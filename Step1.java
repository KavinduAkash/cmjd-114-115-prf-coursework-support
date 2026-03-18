class Main {
  public static void main(String[] args) {

      String[] studentdb = {"Kavindu", "Ravindu", "Siril", "Jeewaka"};

      System.out.println("+-------------+");
      System.out.printf("|%-13s|\n", "Students");
      System.out.println("+-------------+");
      for(int i=0; i<studentdb.length; i++) {
        System.out.printf("|%-13s|\n", studentdb[i]);
      }
      System.out.println("+-------------+");

  }
}
