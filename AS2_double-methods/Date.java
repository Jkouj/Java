class Date {
    // Contributers: Curtis McHenry, Brandon Bullough
  public static void printAmerican(String day, String month, int date, int year){
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }
  public static void printEuropean(String day, String month, int date, int year) {
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }
  public static void main(String[] args) {
    // Declare variables
    String day, month;
    int date, year;
    
    //Assign values
    //day = "Wednesday";
    //month = "June";
    //date = 10;
    //year = 2022;
    // Print Output
    printAmerican("Wednesday", "June", 10, 2022);
    printEuropean("Wednesday", "June", 10, 2022);
    System.out.print("\f");
  }
}
/*
 * American format:
 * Wednesday, June 10, 2022
 * European format:
 * Wednesday 10 June, 2022
 */