public class Fizz {

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }

  public static void buzz() {
    for (int i = 0; i < 100; i++) {
      if (i % 4 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}

