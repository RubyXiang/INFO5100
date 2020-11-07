public class ReverseHello implements Runnable{
    private static int thread = 0;

    public void run(){
        while (thread<50) {
            thread++;
            System.out.println("Hello from Thread " + thread + "!");
            new Thread(new ReverseHello()).start();
        }
    }

    public static void main(String args[]){
        ReverseHello th = new ReverseHello();
        Thread t1 = new Thread(th);
        t1.start();
    }
}
