package helper;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.Scanner;


public class Utils {
    
    public static void print(String message) {
        System.out.print(message);
    }
    
    public static void println(String message) {
        System.out.println(message);
    }
    
    public static int scanInt() {
        int value = new Scanner(System.in).nextInt();
        return value;
    }
    
    public static double scanDouble() {
        double value = new Scanner(System.in).nextDouble();
        return value;
    }
        
    public static String scanString() {
        String value = new Scanner(System.in).nextLine();
        return value;
    }
    
    public static void printSymbol(String symbol, int value) {
        Stream.generate(() -> symbol).limit(value).forEach(System.out::print);
    }
    
    private static String makeDashes(int n){
        return String.join("", Collections.nCopies(n, "-"));
    }
    
    public static void printHeadings(int n, String[] h){
        System.out.printf("%n");
        for(int i=0;i<n;i++) {
            System.out.printf("%-25s", h[i]);
        }
        
        System.out.printf("%n");
        for(int i=0;i<n;i++) {
            System.out.printf("%-25s", makeDashes(20));
        }
    }
    
        public static void printItems(int n, String[] h){
        System.out.printf("%n");
        for(int i=0;i<n;i++) {
            System.out.printf("%-25s", h[i]);
        }
    }
}