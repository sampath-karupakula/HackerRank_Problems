import java.util.*;
import java.io.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(size);
        String s = "";
        while(sc.hasNext()){
            s = sc.next() + " "+s;
        }
        System.out.print(s);
    }
}