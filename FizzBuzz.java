public class FizzBuzz {

  public static void main(String[] args) {
    int maxNumber = Integer.parseInt(args[0]);
    int step1 = Integer.parseInt(args[1]);
    int step2 = Integer.parseInt(args[2]);
    run(maxNumber, step1, step2);
  }
  
  public static void run(int maxNumber, int step1, int step2) {
    for (int i = 0; i < maxNumber; i++) {
      System.out.println(fizzBuzz(i, step1, step2));
    }
  }

  public static String fizzBuzz(int number, int step1, int step2) {
    String result = "";
    if (number % step1 == 0) result += "Fizz";
    if (number % step2 == 0) result += "Buzz";
    if (result.equals("")) result = "" + number;
    return result;
  }

}

