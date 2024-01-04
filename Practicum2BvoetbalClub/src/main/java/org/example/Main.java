package org.example;
//https://www.javatpoint.com/java-string-format

public class Main {


    public static class Voetbalclub {
        private String naam;
        private int aantalGewonnen;
        private int aantalGelijk;
        private int aantalVerloren;


        public Voetbalclub(String nm) {
           naam = nm;
        }

        public void verwerkResultaat(char ch) {
            if (ch == 'w')
                aantalGewonnen +=1 ;
            if (ch == 'g')
                aantalGelijk +=1;
            if (ch == 'v')
                aantalVerloren +=1;
        }

        public int aantalGespeeld(){
            return aantalGewonnen + aantalGelijk + aantalVerloren;
        }

        public int aantalPunten(){
            return (3*aantalGewonnen) + (aantalGelijk);
        }

        public String toString() {
            return String.format("%s %d %d %d %d %d", naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
        }

    }

        public static void main(String[] args) {
            Voetbalclub ajx = new Voetbalclub("Ajax      ");
            Voetbalclub feij = new Voetbalclub("Feijenoord");

            feij.verwerkResultaat('w');
            feij.verwerkResultaat('w');
            feij.verwerkResultaat('w');
            feij.verwerkResultaat('g');
            ajx.verwerkResultaat('g');

            feij.verwerkResultaat('g');

            System.out.println("Feijenoord punten: " + feij.aantalPunten());
            System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld() + "\n");


            System.out.println(ajx);
            System.out.println(feij);
        }
    }
//to do: resultaten netjes in een kolom met de betekenis van het nummer