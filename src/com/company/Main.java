package com.company;

public class Main {

    public static void main(String[] args) {
        String[] middleWord = new String[2];
        middleWord[0]=" på ";
        middleWord[1]=" i ";

        String[] firstWord = new String[11];
        firstWord[0]="drengen";
        firstWord[1]="puden";
        firstWord[2]="fjeren";
        firstWord[3]="fuglen";
        firstWord[4]="ægget";
        firstWord[5]="reden";
        firstWord[6]="bladet";
        firstWord[7]="kvitsen";
        firstWord[8]="grenen";
        firstWord[9]="træet";
        firstWord[10]="bjerget";



        for (int i = 0; i < firstWord.length-1; i++){
            String output = firstWord[i];
            String output2 = firstWord[i+1];
            String on = middleWord[0];
            String in = middleWord[1];
            if (i == 4){
                System.out.println(output + in +output2);
            }else
            System.out.println(output + on +output2);
        }
    }
}
