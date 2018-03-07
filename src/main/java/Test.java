/**
 * Created by yangxb on 2018/2/6.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-T1");
        final Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    t1.join();
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-T2");
        final Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    t2.join();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread-T3");
        t3.start();
        t2.start();
        t1.start();
    }
}