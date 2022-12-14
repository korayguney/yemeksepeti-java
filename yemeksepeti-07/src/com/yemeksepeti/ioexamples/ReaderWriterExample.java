package com.yemeksepeti.ioexamples;

import java.io.*;

public class ReaderWriterExample {

    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(new File("yemeksepeti-07\\resources\\story.txt"));
            writer = new FileWriter(new File("yemeksepeti-07\\resources\\story-copy.txt"));

            int readByte;
            long count = 0;

            while((readByte = reader.read()) != -1){
                writer.write(readByte);
                count += readByte;
            }

            System.out.println("Read count : " + count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
