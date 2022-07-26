package Thread;

public class ticketsale implements Runnable {
    private int ticketnum = 1;//100张票

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticketnum <= 100) {
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售出第" + (ticketnum++) + "张票");
                } else break;
            }
            try {
                Thread.sleep(50);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ticketsale t=new ticketsale();
        Thread t1=new Thread(t,"窗口1");
        Thread t2=new Thread(t,"窗口2");
        Thread t3=new Thread(t,"窗口3");
        Thread t4=new Thread(t,"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}







