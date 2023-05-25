import GLOOP.*;
public class Spielfeld{
    private GLQuader untergrund, rand1, rand2, rand3, rand4,boden,wand,wand2,wand3,wand4;
    private double breite, tiefe;

    public Spielfeld(double pBreite, double pTiefe){
        breite = pBreite;
        tiefe = pTiefe;
        untergrund = new GLQuader(0,0,0, breite,20,tiefe);
        untergrund.setzeTextur("src/img/Marmor.jpg");

        rand1 = new GLQuader(475,20,0,breite,40,50);
        rand1.drehe(0,90,0);
        rand2 = new GLQuader(-475,20,0,breite,40,50);
        rand2.drehe(0,90,0);
        rand3 = new GLQuader(0,20,475,breite,40,50);
        rand4 = new GLQuader(0,20,-475,breite,40,50);


    }
}
