package com.yemeksepeti.ioexamples;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {

        String inputFile = "yemeksepeti-07/resources/nasa.jpg";
        String outputFile = "yemeksepeti-07/resources/nasa-copy.jpg";

        File file = new File(inputFile);
        System.out.println("File has the lenght of " + file.length() + " bytes");

        InputStream inputStream = null;
        OutputStream outputStream = null;

        long startTime, finishTime;

        try {
            // Open streams
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);

            int readByte;

            startTime = System.nanoTime();

            // read & write streams
            while ((readByte = inputStream.read()) != -1) {
                outputStream.write(readByte);
            }

            finishTime = System.nanoTime();

            System.out.println("File is copied to --> " + outputFile);
            System.out.println("Copy operation is elapsed : " + ((finishTime - startTime) / 1000000) + " msec");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
