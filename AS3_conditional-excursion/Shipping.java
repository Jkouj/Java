public class Shipping {

//  add your shippingCost method here
  public static void shippingCost(double weight, double size) {
      double cost;
      if (weight < 8) {
          cost = 5.50;
      }
      else if (weight < 16) {
          cost = 8.50;
      }
      else if (weight < 32) {
          cost = 12.00;
      }
      else {
          cost = weight/2;
      }
      if (size < 12 ) {
          cost = cost;
      }
      else if (size < 24) {
          cost = cost + 2;
      }
      else {
          cost = cost + Math.cbrt(size);
      }
      System.out.printf("$%1.2f\n", cost);
  }
  
  public static void main(String[] args) {
        shippingCost(8, 20);
        shippingCost(4, 27);
        shippingCost(20, 6); 
        shippingCost(34, 30);
  }
}
/*
 * $10.50
 * $8.50
 * $12.00
 * $20.11
 */