public class Multithreading {
    public static void main(String[] args){
  /*      for(int i = 0 ; i <=2; i++){
            MultithreadingThing mything = new MultithreadingThing(i);
            mything.start();
        }*/

        for(int i=0;i<=5;i++){
            MultithreadingRunnable myThing = new MultithreadingRunnable(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }

    }
}
