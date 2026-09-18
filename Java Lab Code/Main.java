
class Multi extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }
}
