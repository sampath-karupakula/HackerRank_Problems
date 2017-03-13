import java.io.*;
import java.util.*;

public class HourGlassSum {

    public static void main(String[] args) {
        List<List<Integer>> m = readValues();
        int max = Integer.MIN_VALUE;
        for(int r = 0; r < 4; r++){
            for(int c = 0; c < 4; c++){
                int total = m.get(r).get(c)+
                        m.get(r).get(c+1)+
                        m.get(r).get(c+2)+
                        m.get(r+1).get(c+1)+
                        m.get(r+2).get(c)+
                        m.get(r+2).get(c+1)+
                        m.get(r+2).get(c+2);
                if(total > max)
                    max = total;
            }
        }
        System.out.print(max);

    }



    public static List<List<Integer>> readValues(){
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> ma = new ArrayList<List<Integer>>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] values = line.split(" ");
            List<Integer> l = new ArrayList<Integer>();
            for(String value : values){
                l.add(Integer.parseInt(value));
            }
            ma.add(l);
        }
        return ma;
    }
}