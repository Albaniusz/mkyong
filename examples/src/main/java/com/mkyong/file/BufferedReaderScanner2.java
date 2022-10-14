package com.mkyong.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderScanner2 {
    public static void main(String args[]) {
        String fileName = "resources/testing.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
