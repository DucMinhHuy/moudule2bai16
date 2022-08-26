package gioithieu;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        String a[]=new String[3];
        a[0]="macbook";
        a[1]="cua ";
        a[2]="huy";
        File file=new File("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/gioithieu/maytinh2.txt");
        OutputStream outputStream=new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(outputStream);
        for(String iteam:a){
            outputStreamWriter.write(iteam);

        }
        outputStreamWriter.flush();


//        // khi bao 1 doi tuong file
//        File file=new File("gioithieu.txt");
//        //tao 1 dong ket noi voi file
//        InputStream inputStream=new FileInputStream(file);
//        //tao dong doc file
//        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
//        // tao bo nho dem
//        BufferedReader reader=new BufferedReader(inputStreamReader);
//        String line="";
//        while ((line=reader.readLine())!=null){
//            System.out.println(line);
//        }
    }
}
