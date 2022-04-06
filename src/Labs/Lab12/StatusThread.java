package Labs.Lab12;

public class StatusThread extends Thread {
    int interval;

    StatusThread(String name, int interval){
        super(name);
        this.interval = interval;
    }

    public void run(){
        System.out.println("Поток " + Thread.currentThread().getName() + " запущен!");
        for (int i = 1; i <= 100 ; i++) {
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " завершен!");
    }
}