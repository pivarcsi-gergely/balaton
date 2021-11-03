package hu.petrik;

import java.io.*;

public class Main {

    public static void balatonFeltoltes(String path){
        int balatonSor = 0;
        int balatonOszlop = 0;
        int[][] balatonMatrix = new int[balatonSor][balatonOszlop];
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null) {
                String[] adatok = sor.split("   ");
                //balatonSor =
            }
            fr.close();
            br.close();

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        balatonFeltoltes("balaton.txt");
    }
}
