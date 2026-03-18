class Main {
  public static void main(String[] args) {

      String[][] studentdb = {{"Kavindu", "19", "Panadura"}, {"Ravindu", "20", "Galle"}, {"Siril", "21", "Matara"}, {"Jeewaka", "22", "Colombo"}};

      System.out.println("+---------------------------------+");
      System.out.printf("|%-13s|%-5s|%-13s|\n", "Name", "Age", "Address");
      System.out.println("+---------------------------------+");
      for(int i=0; i<studentdb.length; i++) {
        System.out.printf("|%-13s|%-5s|%-13s|\n", studentdb[i][0], studentdb[i][1], studentdb[i][2]);
      }
      System.out.println("+---------------------------------+");

  }
}
