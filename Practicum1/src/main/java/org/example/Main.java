package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Practicum I\n");

//        Opdracht 1

        System.out.print("Opdracht 1:\n");
        int getalNul = 0;
        int getalTien = 10;
        String spatie = " ";

        for (; getalNul <= getalTien; getalNul++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Getal = " + getalNul);
        }


//       Opdracht 2
        System.out.print("Opdracht 2:\n");
        getalNul = 0;
        while (getalNul <= getalTien){
            System.out.print(getalNul+spatie);
            getalNul++;
        }

//       Opdracht 3
        int minGetal = 1;
        int maxGetal = 10;

        System.out.print("\nOpdracht 3:\n");
        getalNul = 0;

        while (getalNul <= getalTien){
            int randomNum = (int)(Math.random() * 10);  // 0 tot 10
//            System.out.println(Math.max(minGetal, maxGetal));
            System.out.print(randomNum +spatie);
            getalNul++;
        }
//       Opdracht 4
        getalNul = 0;
        System.out.println("\nOpdracht 4 & vraag voor docent op regel #55:");
        int zevenhonderdTachtig = 780;
        int getalnegenEnDertig = 39;
//        Vraag voor docent:  regel 55 geeft aan: wanneer wordt gehoverd op de 'for'
//        "loop executes zero or bilions times", dat lijkt mij niet zo efficiënt,
//        maar klopt dat wel? wat ik stop wanneer het getal 780 is.
        for (; getalNul <= getalnegenEnDertig; getalnegenEnDertig++){
            getalNul +=1;
            if (getalNul == 780){
                System.out.print(getalNul);

            }
        }

//      Opdracht 5
        System.out.print("\nOpdracht 5:\n");
        for (int i =0; i < 4; i++){
            if ((i % 2)==0){
                System.out.print("s\n");
            }
            else{
                System.out.print("ss\n");
            }
        }

    }
}