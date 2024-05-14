public class CreationUsingRunnable implements Runnable {
    public static void main(String[] args) {
        CreationUsingRunnable obj = new CreationUsingRunnable();

        System.out.println("ThreadCreationOne");

        Thread newThread = new Thread(obj);
        System.out.println(newThread.getState());
        newThread.start();
        System.out.println(newThread.getState());

        System.out.println("ThreadCreationTwo");
        BMW bmw = new BMW();
        Thread bmwThread = new Thread(bmw);
        System.out.println(bmwThread.getState());
        bmwThread.start();
        System.out.println(bmwThread.getState());

        System.out.println("endOfMain--//");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<10;i++){
            try {
                System.out.println("running");
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }
}


class BMW implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
                System.out.println("IShowSpeed");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
