package baitap1;

import java.io.*;

public class huy {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/baitap1/huydaica"));
            outStream = new FileOutputStream(new File("/Users/minhhuyduc/Documents/codegym/moudule2/bai16/src/baitap1/chuarolam"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
