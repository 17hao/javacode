package xyz.shiqihao.thinking.in.java.chap18_io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("./src/ThinkingInJava.chapter18_io/MemoryInput.java")
        );
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
