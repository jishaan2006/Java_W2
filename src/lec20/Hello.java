package lec20;
import java.io.*;
public class Hello {
    public static void main(String[] args) {
        try{
            File file=new File("Dog.html");
            if(file.createNewFile()){
                System.out.println("New file created ");
            }
            else{
                System.out.println("File already created");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        deleteFile();
    }

    static void createData(){
        try {
            FileWriter writer=new FileWriter("Dog.html",true);
            writer.write("barks");
            writer.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static void readFileData(){
        try{
            FileReader reader=new FileReader("Dog.html");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static void deleteFile(){
        try{
            File file=new File("Dog.html");
            if(file.delete()){
                System.out.println("File deleted");
            }
            else{
                System.out.println("not deleted");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
