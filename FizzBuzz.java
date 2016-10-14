
public class FizzBuzz {

  public static void main(String[] args) {
    run();
  }
  
  public static void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(fizzBuzz(i));
    }
  }

  public static String fizzBuzz(int number) {
    String result = "";
    if (number % 5 == 0) result += "Fizz";
    if (number % 7 == 0) result += "Buzz";
    if (result.equals("")) result = "" + number;
    return result;
  }

}

