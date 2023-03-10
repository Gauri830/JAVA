public class EvenOdd {

    public void printEven() {
        System.out.println("List of Even numbers: ");
        for (int i = 1; i < 201; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printOdd() {
        System.out.println("List of Odd numbers: ");
        for (int i = 1; i < 201; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        System.out.println("Sum of natural numbers in the range of 1-200: ");
        int sum = 0;
        for (int i = 1; i < 201; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.printEven();
        eo.printOdd();
        eo.printSum();
    }
}
