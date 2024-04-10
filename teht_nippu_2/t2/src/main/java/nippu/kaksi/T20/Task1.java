package nippu.kaksi.T20;

public class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Task 1 iteration: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
