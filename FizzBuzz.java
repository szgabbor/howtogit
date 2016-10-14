
public class FizzBuzz {

  public static void main(String[] args) {
    run();
  }
  
  public static void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(fizz(i));
    }
  }

  public static String fizz(int number) {
    String result = "" + number;
    if (number % 5 == 0) result = "Fizz";
    return result;
  }

}

