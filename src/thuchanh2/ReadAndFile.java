package thuchanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndFile {
    public List<Integer>readFile(String filePath){
        List<Integer>numbers=new ArrayList<>();
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.out.println("file loi or k ton tai");
        }
        return numbers;
    }
    public void writeFile(String filePath,int max){
        try{
            FileWriter writer=new FileWriter(filePath,true);
            BufferedWriter br=new BufferedWriter(writer);
            br.write("gia tri lon:"+max);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
