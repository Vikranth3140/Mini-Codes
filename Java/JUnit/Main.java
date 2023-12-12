class runnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

class runnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(Thread.currentThread().getName());
            i++;
        }
    }
}

class Main {
    public static void main(String args[]) throws InterruptedException {
        runnable1 r1 = new runnable1();
        runnable2 r2 = new runnable2();

        Thread t1 = new Thread(r1, "th11");
        Thread t2 = new Thread(r2, "th22");

        t1.start();
        t1.join();
        t2.start();
    }
}