package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/a.txt");
        FileOutputStream fos = new FileOutputStream("src/main/resources/b.txt");

        int c;
        while ((c = fis.read()) != -1) {
            fos.write(c);
        }

        fis.close();
        fos.close();
    }
}
