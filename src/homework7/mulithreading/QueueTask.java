package homework7.mulithreading;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueTask {
    private BlockingQueue<Integer> queue;

    public QueueTask(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public Thread[] getThreads() {
        Thread thread1 = new Thread(() -> {
            System.out.println("Начало рабочего дня");
            int i = 0;
            for (int j = 0; j < 100; j++) {
                queue.add(1);
                System.out.println("Добавили элемент " + i++);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Поставки закончились");
                }
            }
            Thread.currentThread().interrupt();
        });

        Thread thread2 = new Thread(() -> {
            int i = 0;
            for (int j = 0; j < 100; j++) {
                try {
                    queue.take();
                    System.out.println("Обработали елемент " + i++);
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Конец рабочего дня");
                }
            }
            Thread.currentThread().interrupt();
        });

        return new Thread[]{thread1, thread2};
    }

    public void doSomething(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QueueTask queueTask = new QueueTask(new ArrayBlockingQueue<>(10));
        queueTask.doSomething(queueTask.getThreads());
    }
}
