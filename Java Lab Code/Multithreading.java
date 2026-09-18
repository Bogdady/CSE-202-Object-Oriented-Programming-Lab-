
/*public class Multithreading extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        t1.start();
    }
}*/

 /*class Multithreading implements Runnable {/

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multithreading m1 = new Multithreading();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}*/
 /*public class Multithreading extends Thread {

    public void run() {

        Thread t = Thread.currentThread();
        System.out.println("Priority of " + t.getName() + " is " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(t.getName() + " running: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        Multithreading t1 = new Multithreading();
        Multithreading t2 = new Multithreading();
        Multithreading t3 = new Multithreading();
        long getid;

        t1.setPriority(1);
        t1.setName("My Thread-1");
        System.out.println("Thread id: " + t1.getId());
        t1.start();
        System.out.println("Is thread alive: " + t1.isAlive());

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.setPriority(2);
        t2.setName("My Thread-2");
        System.out.println("Thread id: " + t2.getId());
        t2.start();
        System.out.println("Is thread alive: " + t2.isAlive());

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.setPriority(3);
        t3.setName("My Thread-3");
        System.out.println("Thread id: " + t3.getId());
        t3.start();
        System.out.println("Is thread alive: " + t3.isAlive());

        //System.out.println("Is thread alive after join: " + t1.isAlive());
    }
}*/
/*class Customer {

    int amount = 10000;

    synchronized void withdraw(int money) {
        System.out.println("Going to withdraw...");

        if (amount < money) {
            System.out.println("Less balance, waiting for deposit...");

            try {
                wait();   // thread waits
            } catch (Exception e) {
            }
        }

        amount = amount - money;
        System.out.println("Withdraw completed");
        System.out.println("Remaining Balance: " + amount);
    }

    synchronized void deposit(int money) {
        System.out.println("Going to deposit...");

        amount = amount + money;
        System.out.println("Deposit completed");

        notify();   // wakes waiting thread
    }
}

public class Multithreading {

    public static void main(String[] args) {

        Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}*/
