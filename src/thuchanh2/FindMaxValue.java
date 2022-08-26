package thuchanh2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for(int i=0;i<numbers.size();i++){
            if(max<numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndFile readAndWriteFile=new ReadAndFile();
        List<Integer> numbers=readAndWriteFile.readFile("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/thuchanh2/numbers.txt");
        int maxValue=findMax(numbers);
        readAndWriteFile.writeFile("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/thuchanh2/result.txt",maxValue);
    }
}
