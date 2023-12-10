package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zwembad ZwembadRotterdam = new Zwembad(100.00, 200.00, 25.00);

        System.out.println("Breedte: " + ZwembadRotterdam.getBreedte());
        System.out.println("Lengte: " + ZwembadRotterdam.getLengte());
        System.out.println("Diepte: " + ZwembadRotterdam.getDiepte());
        System.out.println("Inhoud: " + ZwembadRotterdam.getLengte() * ZwembadRotterdam.getBreedte() * ZwembadRotterdam.getDiepte());
        System.out.println("Gegevens zwembad: dit zwembad is " + ZwembadRotterdam.getBreedte() + " meter breed, "
                + ZwembadRotterdam.getLengte() + " meter lang, en "
                + ZwembadRotterdam.getDiepte() + " meter diep");


        ZwembadRotterdam.setBreedte(10.00);
        ZwembadRotterdam.setLengte(20.00);
        ZwembadRotterdam.setDiepte(2.5);
        System.out.println("\nBerekende inhoud: "+ ZwembadRotterdam.getLengte() * ZwembadRotterdam.getBreedte() * ZwembadRotterdam.getDiepte());

    }

    public static class Zwembad {
        private double breedte;
        private double lengte;
        private double diepte;

        public Zwembad (double breedte, double lengte, double diepte) {
            this.breedte = breedte;
            this.lengte = lengte;
            this.diepte = diepte;
        }

        //getter
        public double getBreedte(){
            return breedte;
        }
        public double getLengte(){
            return lengte;
        }
        public double getDiepte(){
            return diepte;
        }


//setter
        public void setBreedte(double nieuwBreedte) {
            this.breedte = nieuwBreedte;
        }

        public void setLengte(double nieuwLengte) {
            this.lengte = nieuwLengte;
        }

        public void setDiepte(double nieuwDiepte) {
            this.diepte = nieuwDiepte;
        }
    } //einde van Zwembad Klasse

}


