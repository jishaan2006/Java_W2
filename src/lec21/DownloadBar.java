package lec21;

class Bar extends Thread{
    public void run(){
        for (int i = 0; i <=10;i++){
            System.out.println("Downloading file...."+i*10+"%");
            try{
                sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Download Complete.");
    }
}

class DownloadBar {
    public static void main(String[] args) {
        Bar b1=new Bar();
        b1.start();

    }
}
