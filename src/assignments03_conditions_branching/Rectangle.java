package assignments03_conditions_branching;

public class Rectangle {

    public static void main(String[] args) {

        int M = 20;
        int N = 10;

        // barvy
        String cervena = "\u001B[31m";
        String bila = "\u001B[37m";
        String modra = "\u001B[34m";

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(modra + "* ");
            }
            System.out.println(" ");
        }
    }
}
