import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel {
    public GLVektor v1;
    public int f=4;
    public GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;
    private int a = 0;
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    private Kugelfangen kugelfangen;

    double s = (double) (Math.random() * 5 - (Math.random() * 5));
    double t = (double) (Math.random() * 5 - (Math.random() * 5));

    public Kugel(Box pbox) {
        v1 = new GLVektor(s, 0, t);
        int x = (int) (Math.random() * 425 - 200);
        int z = (int) (Math.random() * 425 - 200);
        kugel = new GLKugel(0, 30, 0, 20);
        kugel.verschiebe(0, 0, 0);
dieBox=pbox;

    }


    public void bewege() {
            if(this.treffer()){
            kugel.setzePosition(900000,0,0);

        }


        if (this.gibX() < (-440) || this.gibX() > (440) || this.gibZ() > (440) || this.gibZ() < (-440)) {
        } else {
            kugel.verschiebe(s, 0, t);
        }
        if (this.gibX() < (-420) || this.gibX() > (420)) {
            s = -s;

        }
        if (this.gibZ() < (-420) || this.gibZ() > (420)) {
t=-t;
        }

    }


        public boolean treffer () {
            double a = Math.sqrt(
                    Math.pow(dieBox.gibX() - kugel.gibX(), 2) +
                            Math.pow(dieBox.gibY() - kugel.gibY(), 2) +
                            Math.pow(dieBox.gibZ() - kugel.gibZ(), 2)
            );
            if (a < 70)
                return true;

            else return false;
        }


        public double gibX () {
            return kugel.gibX();
        }

        public double gibY () {
            return kugel.gibY();
        }

        public double gibZ () {
            return kugel.gibZ();
        }
    }



// if (kugel.gibX() < -300){

//}
