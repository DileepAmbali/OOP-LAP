import java.util.Random;

class Square implements Runnable {
    int square, n;

    Square(int n) {
        this.n = n;
        square = n * n;
    }

    public void run() {
        System.out.printf("Sq of %d is: %d\n", n, square);
    }
}

class Cube implements Runnable {
    int cube, n;

    Cube(int n) {
        this.n = n;
        cube = n * n * n;
    }

    public void run() {
        System.out.printf("Cube of %d is: %d\n", n, cube);
    }
}

class RandomGen implements Runnable {
    int num;
    Random rand = new Random();

    public void run() {
        for (int i = 0; i < 50; i++) {
            num = rand.nextInt(100);
            Thread t1 = new Thread(new Square(num));
            Thread t2 = new Thread(new Cube(num));
            System.out.print("Num: " + num + "\n");
            if (num % 2 == 0) {
                t1.start();
            } else {
                t2.start();
            }
            try {
                Thread.sleep(125);
            } catch (Exception e) {
            }
        }
    }
}

public class MultiThreading {
    public static void main(String argsp[]) {
        Thread T = new Thread(new RandomGen());
        T.start();
        for (;;)
            System.out.println("WASAAAAAP");

    }
}
