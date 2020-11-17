public class MultiThread {
    static long AllMax=-1;
    public static void main(String[] args) {
        MyThr t1=new MyThr();
        MyThr t2=new MyThr();
        MyThr t3=new MyThr();
        MyThr t4=new MyThr();
        MyThr t5=new MyThr();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("10000个数中的最大值为："+AllMax);
    }

    public static class MyThr extends Thread{
        public void run(){
            long rand;
            for(int i=1;i<=2000;i++){
                rand=(long)(Math.random()*100000)%100000;
                if(rand>AllMax){
                    AllMax=rand;
                }
            }
        }
    }
}
