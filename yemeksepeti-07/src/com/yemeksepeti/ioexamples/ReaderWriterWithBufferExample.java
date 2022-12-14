package com.yemeksepeti.ioexamples;

import java.io.*;

public class ReaderWriterWithBufferExample {

    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            reader = new FileReader(new File("yemeksepeti-07\\resources\\story.txt"));
            writer = new FileWriter(new File("yemeksepeti-07\\resources\\story-copy.txt"));

            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);

            int readByte;
            long count = 0;

            while((readByte = bufferedReader.read()) != -1){
                bufferedWriter.write(readByte);
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
