package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Balaton {

    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Balaton(){
        inicializalas();
        beolvasas();
    }

    private void inicializalas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("balaton.txt"));
            String sor = br.readLine();
            this.sorokSzama = 0;

            this.oszlopokSzama = sor.split("\\t", -1).length;
            while (sor != null){
                this.sorokSzama++;
                sor = br.readLine();
            }
            this.matrix = new int[this.sorokSzama][this.oszlopokSzama];
            br.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }

    private void beolvasas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("balaton.txt"));
            String sor = br.readLine();
            int sorIndex = 0;
            while (sor != null){
                String[] st = sor.split("\\t");
                for (int i = 0; i < st.length; i++) {
                    if (st[i].equals("")){
                        matrix[sorIndex][i] = 0;
                    }
                    else {
                        matrix[sorIndex][i] = Integer.parseInt(st[i]);
                    }
                }
                sorIndex++;
                sor = br.readLine();
            }
            br.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (this.matrix[i][j] == 0)
                {
                    s += " " + this.matrix[i][j] + " ";
                }
                else {
                    s += + this.matrix[i][j] + " ";
                }

            }
            s += "\n";
        }
        return s;
    }
}
