package Creation;
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

        System.out.println(bmwThread.getName());
        System.out.println(newThread.getName());

        // changing the name of the thread bmw

        bmwThread.setName("BMW__SPEED");

        System.out.println(bmwThread.getName());

        System.out.println(newThread.getPriority());
        System.out.println(bmwThread.getPriority());
        // the default priority of the thread is 5
        // min -1
        // max - 10

        newThread.setPriority(10);

        System.out.println(newThread.getPriority());

        System.out.println("endOfMain--//");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<5;i++){
            try {
                System.out.println("running");
                // Thread.sleep(1000);
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }
}


class BMW implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("IShowSpeed");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
