package com.codegym.findmaxvalue;

import java.util.List;

public class FindMaxValue {
    private static final String INPUT_FILE_PATH =
            "D:\\codegym\\module-02-advanced-programming-with-java\\" +
            "sources\\lesson-16-io-text-file\\src\\numbers.txt";

    private static final String OUTPUT_FILE_PATH =
            "D:\\codegym\\module-02-advanced-programming-with-java\\" +
                    "sources\\lesson-16-io-text-file\\src\\result.txt";
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(INPUT_FILE_PATH);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(OUTPUT_FILE_PATH, maxValue);
    }
}
