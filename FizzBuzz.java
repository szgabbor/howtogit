
public class FizzBuzz {

  public static void main(String[] args) {
    int maxNumber = Integer.parseInt(args[0]);
    run(maxNumber);
  }
  
  public static void run(int maxNumber) {
    for (int i = 0; i < maxNumber; i++) {
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

