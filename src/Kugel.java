import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel{

    public GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    private Kugelfangen kugelfangen;


    public Kugel() {

        int x = (int) (Math.random() * 425 - 200 );
        int z = (int) (Math.random() * 425 - 200);
        kugel= new GLKugel(200, 30, 0, 20);
        kugel.verschiebe(0, 0, 0);


    }


    public void bewege() {
        double s = (double) (Math.random() * 10);
        double t = (double) (Math.random() * 10);
 kugel.verschiebe(s,0,t);
 if(this.gibX()<(0)){
   kugel.verschiebe(-s,0,-t);
 }
        if(this.gibX()>(850)){
            kugel.verschiebe(-s,0,-t);
        }

 if(this.gibZ()>(425)){
  kugel.verschiebe(-s,0,-t);
 }
        if(this.gibZ()<(-425)){
            kugel.verschiebe(-s,0,-t);
        }

    }
    private boolean habdich(){
        double abstand=Math.sqrt(
                        Math.pow(kugel.gibX()-dieBox.gibX(),2)+
                        Math.pow(kugel.gibZ()-dieBox.gibZ(),2)
        );
        if(abstand<70)return true;
        else return false;

    }




    public double gibX(){
        return kugel.gibX();}

    public double gibY(){
        return kugel.gibY();}

    public double gibZ(){
        return kugel.gibZ();}
}

// if (kugel.gibX() < -300){

//}
