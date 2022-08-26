package thuchanh1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
//    String filePath
    public void readFileText(){
        try{
            File file=new File("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/thuchanh1/numbers.txt");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line =br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("tong ="+sum);
        }catch (Exception e){
            System.out.println("file k ton tai or noi dung co loi");
        }
    }

    public static void main(String[] args) {
//        System.out.println("in ra");
//        Scanner sc=new Scanner(System.in);
//        String path=sc.nextLine();
        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText();
    }
}
