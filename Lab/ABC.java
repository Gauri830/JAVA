public class ABC {
    public void printPattern() {
        int size = 5;
        int alpha = 65;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
                System.out.print((char) (alpha + j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ABC p1 = new ABC();
        p1.printPattern();
    }
}