package Synchronisation;

public class Synchronisation {
    public static void main(String[] args) {
        Table obj = new Table();

        One one = new One(obj);
        Two two = new Two(obj);

        one.start();
        two.start();
    }
}



class Table{
    synchronized void print(int n){
        for(int i=0;i<5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}


class One extends Thread{
    Table t;
    One(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        t.print(5);
    }
}

class Two extends Thread{
    Table t;
    Two(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        t.print(5);
    }
}