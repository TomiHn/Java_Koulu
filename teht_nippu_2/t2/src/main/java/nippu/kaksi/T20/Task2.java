package nippu.kaksi.T20;

public class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Task 2 iteration: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
