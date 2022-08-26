package baitap1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<Integer> readFile(String fileleuleu) {
        List<Integer>number=new ArrayList<>();
        try{
            File file=new File(fileleuleu);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.out.println("file khong ton tai or noi dung co loi");
        }
        return number;
    }
}
