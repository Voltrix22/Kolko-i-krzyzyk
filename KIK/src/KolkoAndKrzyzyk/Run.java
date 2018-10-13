package KolkoAndKrzyzyk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        int wybor;
        boolean menu = true;

        Scanner input = new Scanner(System.in);

        KIK rozgrywka = new KIK();

        System.out.println("WITAM W GRZE KÓŁKO I KRZYŻYK");
        System.out.println("----------------------------");

        //MENU POCZĄTKOWE
        while(menu) {
            System.out.println("Wybierz jedną z dwóch poniższych opcji");
            System.out.println("1 - Pokaż instrukcję do gry");
            System.out.println("2 - Rozpocznij grę");

            try {
                wybor = input.nextInt();
            }
            catch(InputMismatchException e) {
                wybor = 0;
                input.nextLine();
            }

            switch (wybor) {
                case 1:
                    System.out.println("INSTRUKCJA");
                    System.out.println("----------");
                    System.out.println("Układ planszy w tej grze jest odzwierciedleniem klawiatury numerycznej po prawej stronie twojej klawiatury,");
                    System.out.println("co można zauważyć na obrazku poniżej");
                    System.out.println();
                    System.out.println("7"+" | "+"8"+" | "+"9");
                    System.out.println("---------");
                    System.out.println("4"+" | "+"5"+" | "+"6");
                    System.out.println("---------");
                    System.out.println("1"+" | "+"2"+" | "+"3");
                    System.out.println();
                    System.out.println("Grę zawsze rozpoczyna gracz ze znakiem 'X'");
                    System.out.println();
                    System.out.println("MIŁEJ GRY");
                    System.out.println("---------");
                    System.out.println();
                    break;
                case 2:
                    menu = false;
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("ZOSTAŁ PODANY NIEWŁAŚCIWY ZNAK");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println();
            }
        }

        System.out.println();
        System.out.println(rozgrywka.getP0()+" | "+rozgrywka.getP1()+" | "+rozgrywka.getP2());
        System.out.println("---------");
        System.out.println(rozgrywka.getP3()+" | "+rozgrywka.getP4()+" | "+rozgrywka.getP5());
        System.out.println("---------");
        System.out.println(rozgrywka.getP6()+" | "+rozgrywka.getP7()+" | "+rozgrywka.getP8());

        input.nextLine();

        while (rozgrywka.getwGracz() == 0) {

            //RUCH GRACZA X
            while (rozgrywka.getGracz() == 1 && rozgrywka.getwGracz() == 0) {

                System.out.println();
                System.out.println("Kolej gracza X");
                System.out.println("wybierz pole: ");
                String poleX = input.nextLine();

                rozgrywka.graczX(poleX);

                System.out.println();
                System.out.println(rozgrywka.getP0() + " | " + rozgrywka.getP1() + " | " + rozgrywka.getP2());
                System.out.println("---------");
                System.out.println(rozgrywka.getP3() + " | " + rozgrywka.getP4() + " | " + rozgrywka.getP5());
                System.out.println("---------");
                System.out.println(rozgrywka.getP6() + " | " + rozgrywka.getP7() + " | " + rozgrywka.getP8());

            }
            rozgrywka.remis();
            rozgrywka.k048();
            rozgrywka.k246();
            rozgrywka.pi036();
            rozgrywka.pi147();
            rozgrywka.pi258();
            rozgrywka.po012();
            rozgrywka.po345();
            rozgrywka.po678();


            if (rozgrywka.getwGracz() == 1 || rozgrywka.getwGracz() == 2) {
                break;
            }

            //RUCH GRACZA O
            while (rozgrywka.getGracz() == 2 && rozgrywka.getwGracz() == 0) {

                System.out.println();
                System.out.println("Kolej gracza O");
                System.out.println("wybierz pole: ");
                String poleY = input.nextLine();

                rozgrywka.graczY(poleY);

                System.out.println();
                System.out.println(rozgrywka.getP0() + " | " + rozgrywka.getP1() + " | " + rozgrywka.getP2());
                System.out.println("---------");
                System.out.println(rozgrywka.getP3() + " | " + rozgrywka.getP4() + " | " + rozgrywka.getP5());
                System.out.println("---------");
                System.out.println(rozgrywka.getP6() + " | " + rozgrywka.getP7() + " | " + rozgrywka.getP8());
            }
            rozgrywka.remis();
            rozgrywka.k048();
            rozgrywka.k246();
            rozgrywka.pi036();
            rozgrywka.pi147();
            rozgrywka.pi258();
            rozgrywka.po012();
            rozgrywka.po345();
            rozgrywka.po678();


            if (rozgrywka.getwGracz() == 1 || rozgrywka.getwGracz() == 2) {
                break;
            }
        }
        //ROZTRZYGNIĘCIE
        if (rozgrywka.getwGracz() == 1) {
            System.out.println();
            System.out.println("WYGRAŁ GRACZ X!!!!");
        } else if (rozgrywka.getwGracz() == 2) {
            System.out.println();
            System.out.println("WYGRAŁ GRACZ O!!!!");
        } else if (rozgrywka.getwGracz() == 3){
            System.out.println();
            System.out.println("REMIS!!!!!!");
        }
    }
}
