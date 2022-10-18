public class Main {
  public static void main(String[] args) {
    // 1
    for (int i = 0; i <= 30; i++) {
      System.out.println(i);
    }

    // 2
    for (int i = 30; i >= 0; i--) {
      System.out.println(i);
    }

    // 3
    for (int i = 0; i <= 18; i = i + 3 ) {
      System.out.println(i);
    }

    // 4
    for (int i = 10; i >= 0; i = i - 2 ) {
      System.out.println(i);
    }

    // 5
    for (int i = 0; i < 5; i++ ) {
      for (int f = 1; f <= i; f++ ) {
        System.out.print("*");
      }
      System.out.println("*");
    }

    // 6
    for (int i = 1; i <= 5; i++ ) {
      for (int f = 4; f >= i; f-- ) {
        System.out.print("*");
      }
      System.out.println("*");
    }
    System.out.println();

    // 7
    for (int i = 0; i < 5; i++ ) {
      for (int f = 1; f < 5; f++ ) {
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
}