public class Creation extends Thread{

    public static void main(String[] args) {
        Creation obj = new Creation();

        obj.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<10;i++){
            System.err.println("running");
            try {
                sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}


