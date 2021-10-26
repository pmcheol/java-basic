package io;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/main/resources/a.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/main/resources/b.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            out.write(line);
            out.newLine();
        }

        out.close();
        in.close();
    }
}
