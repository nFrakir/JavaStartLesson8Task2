package com.gmail.seliverstova.hanna;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class App {
    public static void main( String[] args ) {
        int[][] matrix = new int[][] {{12,5,123},{0,789,45},{13,89,1}};
        File file = new File("11.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        saveMatrixToFile(matrix, file);
    }

    public static void saveMatrixToFile (int[][] array, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int[] row : array) {
                for (int elem : row) {
                    pw.print(String.format("%-6.6s\t", ""+elem));
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
