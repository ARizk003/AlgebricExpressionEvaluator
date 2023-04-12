import java.util.*;

/**
 1) x^2+x+1
 2) x+1
 3) x+x^2-1
 4) -x^2-x-1
 5) -1-5+2+x-x^3+1-x^4
*/

/**
 * 1) split the experession by operators
 * ['-x^2', 'x', '-1']
 * 2) detect for the splitteted parts
 * 2.a) is numeric
 * 2.b) is variable
 * 3) evaluate the splitted
 */

public class App {

  public static List<String> exprissionSplit() {
    List<String> res = new ArrayList<String>();
    // TODO: implement the method.

    return res;
  }

  /*
   * 1) input opeand string
   * 2) iterate over operand
   * 2.1)check char is number by comparing to ascii
   * 2.1.1) if is not number return false
   * 
   * 
   */
  public static boolean isNumeric(String operand) {
    // TODO: implement the method.

    for (int i = 0; i < operand.length(); i++) {
      char c = operand.charAt(i);
      if (!(c <= '9' && c >= '0') && !(c == '.')) {
        return false;
      }
    }
    return true;
  }

  public static boolean isNegative(String operand) {

    // TODO: implement the method.
    if (operand.charAt(0) == '-') {
      return true;
    }

    return false;
  }

  public static double evaluate(String operand) {
    // "-x^2"
    boolean isNegative = App.isNegative(operand);
    // }
    if (isNegative == true) {
      operand = operand.substring(1);
    }

    boolean isNumeric = App.isNumeric(operand);

    if (isNumeric == true) {
      double n1 = Double.parseDouble(operand);

      if (isNegative == true) {
        n1 = n1 * -1;

      }

      return n1;

    }

    // TODO: implement is variable flow.

    return 0.0;

  }

  public static void main(String[] args) {
    System.out.println("Hello World.");

    double result = App.evaluate("55");
    System.out.println(result == 55);

    double result1 = App.evaluate("01");
    System.out.println(result1 == 1);

    double result2 = App.evaluate("1.09");
    System.out.println(result2 == 1.09);

    double result3 = App.evaluate("-1");
    System.out.println(result3 == -1);

    boolean b1 = App.isNumeric("1");
    System.out.println(b1 == true);

    boolean b2 = App.isNumeric("2");
    System.out.println(b2 == true);

    boolean b3 = App.isNumeric("x");
    System.out.println(b3 == false);

    boolean b4 = App.isNumeric("x^2");
    System.out.println(b4 == false);

    boolean b5 = App.isNumeric("1.09");
    System.out.println(b5 == true);
  }

  // public static char findChar(char number , )

}
