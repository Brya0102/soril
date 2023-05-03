package shalgalt;

public class rn extends Thread {

    private String name;

    private int priority;

    private boolean isActive;

    

    public rn(String name, int priority) {

        this.name = name;

        this.priority = priority;

        this.isActive = true;

        System.out.println(name + " үүсгэлээ.");

    }

    

    public void run() {

        int count = 0;

        while(isActive) {

            System.out.println(name + " ажиллаж байна.");

            count++;

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                System.out.println(name + " ажлыг хаахад алдаа гарлаа.");

            }

        }

        System.out.println(name + " ажлыг дууслаа.");

    }

    

    public void stopThread() {

        isActive = false;

    }

    

    public static void main(String[] args) {

        rn thread1 = new rn("Thread 1", 5);

        rn thread2 = new rn("Thread 2", 8);

        

        thread1.start();

        thread2.start();

        

        try {

            Thread.sleep(5000);

        } catch (InterruptedException e) {

            System.out.println("Үйлдлийн системд алдаа гарлаа.");

        }

        

        thread1.stopThread();

        thread2.stopThread();

        

        System.out.println("Thread-ийн ажиллагаа дууслаа.");

    }

}