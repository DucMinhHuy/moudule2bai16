package baitap1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileOut {
    public void writeFile(String writefile){
        try{
            FileWriter writer=new FileWriter(writefile);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("doan nay van chua  hieu");
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
