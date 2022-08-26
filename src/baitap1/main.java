package baitap1;

import java.util.List;

public class main {
    public static int prime(List<Integer>number){
        int n=number.get(0);
        for (int i=0;i<n;i++){
        }
        return n;
    }
    public static void main(String[] args) {
         ReadFile readFile=new ReadFile();
        List<Integer>number=readFile.readFile("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/baitap1/huydaica");
        int value=prime(number);
        readFile.readFile("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/baitap1/chuarolam");
    }
}
