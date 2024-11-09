class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {
            System.out.println( "Another thread woke me up");
            return;
        }

        System.out.println("Three seconds have passed and I'm awake");
    }
}

class MyRunnable implements Runnable 
{

    @Override
    public void run() {
        System.out.println("Hello from MyRunnable's implementation of run()");
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello from the anonymous class's implementation of run()");
                try 
                {
                    anotherThread.join();
                    System.out.println("AnotherThread terminated, or timed out, so I'm running again");
                } catch(InterruptedException e) {
                    System.out.println("I couldn't wait after all. I was interrupted");
                    return;
                }
            }
        });

        myRunnableThread.start();

        System.out.println("Hello again from the main thread.");


    }
}
