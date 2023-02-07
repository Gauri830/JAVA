public class diamond {
    
        public static void main(String[] args) {
          int n = 5;
          int spaces = n - 1;
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
              System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
              System.out.print("* ");
            }
            System.out.println();
            spaces--;
          }
          spaces = 0;
          for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < spaces; j++) {
              System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
              System.out.print("* ");
            }
            System.out.println();
            spaces++;
          }
        }
      }