public class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      fizzBuzz(i);
    }
  }

  public static void fizzBuzz(int number) {
    String result = "";
    if (number % 3 == 0) result += "Fizz";
    if (number % 4 == 0) result += "Buzz";
    if (result.equals("")) result = "" + number;
    return result;
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

