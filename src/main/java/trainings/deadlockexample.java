package trainings;

public class deadlockexample {
    String s1 = "sai";
    String s2 = "swetha";

    Thread t1 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s1) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "locked" + s1);
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                      //  throw new RuntimeException(e);
                       e.printStackTrace();
                    }


                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + "locked" + s2);
                        System.out.println(s1 + s2);

                    }
                }
            }
        }
    };

    Thread t2 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s2) {

                    System.out.println(Thread.currentThread().getName() + "locked" + s2);


                synchronized (s1) {
                    System.out.println(Thread.currentThread().getName() + "locked" + s1);
                    System.out.println(s1 + s2);
                }
            }
        }
      }
    };

    public static void main(String[] args) {
        deadlockexample obj=new deadlockexample();
        obj.t1.start();
        obj.t2.start();
    }
}

