package lec21;

class NewThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i+" t1");
            try{
                sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MultiThreadIntroduction{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        NewThread t1=new NewThread();
        t1.setName("New Thread");
        t1.start();
        try{
            t1.join(); //T1 will run first
        }
        catch (Exception e){
            System.out.println(e);
        }
        for(int i=0;i<5;i++){
            System.out.println(i+" main");
        }
    }
}
