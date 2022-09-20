public class MultithreadingThing extends Thread{
    private int threadNumber;
    public MultithreadingThing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println(i + " from thread " + threadNumber);
            if (threadNumber == 1){
                throw new RuntimeException("thread 1 got exception");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
