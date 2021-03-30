import java.util.Random;

public class Main {
  public static void main (String[] args) {
  int dogCount = 1;
  System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

  int catCount = 2;
  System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

  int turtleCount = 0;
  System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + "."); 

  flipNHeads(0);
  flipNHeads(3);

  }

  public static String pluralize(String word, int count){
    if (!(count == 1)) {
      return word + 's';
    }
    return word;
  }
}

// public class Main {
//   static void roll ();
//   System.out.println(n);
// }