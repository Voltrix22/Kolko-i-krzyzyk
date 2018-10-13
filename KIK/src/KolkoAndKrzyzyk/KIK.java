package KolkoAndKrzyzyk;

public class KIK extends Dane implements Rozwiazania {

    public KIK(){

    }

    //GRACZE
    @Override
    public void graczX(String poleX) {

        if(poleX.equals("7")){
            if(getP0().equals(" ")) {
                setP0("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("8")){
            if(getP1().equals(" ")) {
                setP1("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("9")){
            if(getP2().equals(" ")) {
                setP2("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("4")){
            if(getP3().equals(" ")) {
                setP3("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("5")){
            if(getP4().equals(" ")) {
                setP4("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("6")){
            if(getP5().equals(" ")) {
                setP5("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("1")){
            if(getP6().equals(" ")) {
                setP6("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("2")){
            if(getP7().equals(" ")) {
                setP7("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleX.equals("3")){
            if(getP8().equals(" ")) {
                setP8("X");
                setGracz(2);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else
            System.out.println("NIE MA TAKIEGO POLA");
    }

    @Override
    public void graczY(String poleO) {

        if(poleO.equals("7")){
            if(getP0().equals(" ")) {
                setP0("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("8")){
            if(getP1().equals(" ")) {
                setP1("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("9")){
            if(getP2().equals(" ")) {
                setP2("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("4")){
            if(getP3().equals(" ")) {
                setP3("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("5")){
            if(getP4().equals(" ")) {
                setP4("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("6")){
            if(getP5().equals(" ")) {
                setP5("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("1")){
            if(getP6().equals(" ")) {
                setP6("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("2")){
            if(getP7().equals(" ")) {
                setP7("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else if(poleO.equals("3")){
            if(getP8().equals(" ")) {
                setP8("O");
                setGracz(1);
            }
            else
                System.out.println("POLE JUŻ ZAJĘTE!!!");
        }
        else
            System.out.println("NIE MA TAKIEGO POLA");

    }

    //ROZWIĄZANIA
    @Override
    public void k048() {

        if(getP0().equals("X")&&getP4().equals("X")&&getP8().equals("X")){
            setwGracz(1);
        }
        else if(getP0().equals("O")&&getP4().equals("O")&&getP8().equals("O")){
            setwGracz(2);
        }

    }

    @Override
    public void k246() {
        if(getP2().equals("X")&&getP4().equals("X")&&getP6().equals("X")){
            setwGracz(1);
        }
        else if(getP2().equals("O")&&getP4().equals("O")&&getP6().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void po012() {
        if(getP0().equals("X")&&getP1().equals("X")&&getP2().equals("X")){
            setwGracz(1);
        }
        else if(getP0().equals("O")&&getP1().equals("O")&&getP2().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void po345() {
        if(getP3().equals("X")&&getP4().equals("X")&&getP5().equals("X")){
            setwGracz(1);
        }
        else if(getP3().equals("O")&&getP4().equals("O")&&getP5().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void po678() {
        if(getP6().equals("X")&&getP7().equals("X")&&getP8().equals("X")){
            setwGracz(1);
        }
        else if(getP6().equals("O")&&getP7().equals("O")&&getP8().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void pi036() {
        if(getP0().equals("X")&&getP3().equals("X")&&getP6().equals("X")){
            setwGracz(1);
        }
        else if(getP0().equals("O")&&getP3().equals("O")&&getP6().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void pi147() {
        if(getP1().equals("X")&&getP4().equals("X")&&getP7().equals("X")){
            setwGracz(1);
        }
        else if(getP1().equals("O")&&getP4().equals("O")&&getP7().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void pi258() {
        if(getP2().equals("X")&&getP5().equals("X")&&getP8().equals("X")){
            setwGracz(1);
        }
        else if(getP2().equals("O")&&getP5().equals("O")&&getP8().equals("O")){
            setwGracz(2);
        }
    }

    @Override
    public void remis() {
        if((getP0().equals("X")||getP0().equals("O"))
                &&(getP1().equals("X")||getP1().equals("O"))
                &&(getP2().equals("X")||getP2().equals("O"))
                &&(getP3().equals("X")||getP3().equals("O"))
                &&(getP4().equals("X")||getP4().equals("O"))
                &&(getP5().equals("X")||getP5().equals("O"))
                &&(getP6().equals("X")||getP6().equals("O"))
                &&(getP7().equals("X")||getP7().equals("O"))
                &&(getP8().equals("X")||getP8().equals("O"))){

            setwGracz(3);
        }
    }
}
