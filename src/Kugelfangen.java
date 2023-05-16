import GLOOP.*;
public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel [] kugel;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(400, 500, 800);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        tastatur = new GLTastatur();

        Spielfeld spielfeld = new Spielfeld(1000, 1000);
        kugel = new Kugel[4];
        dieBox = new Box();
        for(int i=0;i< kugel.length;i++){
            kugel[i]=new Kugel();
        }
        fuehreAus();

    }

    public void fuehreAus() {
        while (!tastatur.esc()) {
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
            }
        }
    }
}