package States;
/**
 * Runnable is a functional interface containing one method that is run() which needs to be implemeted while implemeting runnable;
 */

class ABC implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}




public class ThreadStates implements Runnable{

    public static Thread ti;
    public static ThreadStates obj;

    public static void main(String[] args) {
        obj = new ThreadStates();
        ti = new Thread(obj);


        System.out.println("State" +  ti.getState());

        ti.start();

        System.out.println("State" + ti.getState());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        System.out.println("state 2" + t2.getState());

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        System.out.println("state 2" + t2.getState());

        try {
            t2.join(); // will wait for the completion of th2 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        System.out.println("state 2" + t2.getState());
        
    }
}