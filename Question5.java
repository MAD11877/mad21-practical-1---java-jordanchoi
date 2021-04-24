import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    HashMap<Integer, Integer> intDict = new HashMap<Integer, Integer>(); 

    // System.out.print("Please enter the initial number: ");
    int amountOfPrompts = in.nextInt();
    int i = 0;

    while (i++ < amountOfPrompts) {
      // System.out.print(String.format("Integer number %s: ", i));
      int digits = in.nextInt();
      if (intDict.containsKey(digits)) {
        int addOne = intDict.get(digits);
        addOne++;
        intDict.replace(digits, addOne);
      }
      else {
        intDict.put(digits, 1);
      }
    }

    int currentMode = 0;
    int compareValue = 0;

    for (Integer k : intDict.keySet()) {
      if (intDict.get(k) > compareValue) {
       compareValue = intDict.get(k);
       currentMode = k; 
      }
      else {
        continue;
      }
    }

    System.out.println(currentMode);
  }
}
