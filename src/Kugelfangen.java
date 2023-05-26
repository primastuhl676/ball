import GLOOP.*;

import javax.media.opengl.GL;

public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    public GLTafel t1;

    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel [] kugel;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(600, 500, 800);
t1=new GLTafel(200,0,0,250,50);
t1.verschiebe(0,200,0);
        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

        Spielfeld spielfeld = new Spielfeld(1000, 1000);
        kugel = new Kugel[4];
        dieBox = new Box();
        for(int i=0;i< kugel.length;i++){
            kugel[i]=new Kugel(dieBox);
            kugel[i].bewege();
        }
        fuehreAus();

    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
           t1.setzeText("Punkte: "+dieBox.gibpunkte(),16);
            if (tastatur.links()) {
                dieBox.bewegeLinks();
            }
            if (tastatur.rechts()) {
                dieBox.bewegeRechts();
            }
            if (tastatur.oben()) {
                dieBox.bewegeOben();
            }
            if (tastatur.unten()) {
                dieBox.bewegeUnten();
            }
            Sys.warte();
            for(int i=0;i< kugel.length;i++){
                kugel[i].bewege();
                kugel[i].ende();

            }
        }
    }
}