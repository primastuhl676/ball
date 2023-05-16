import GLOOP.*;


import javax.media.opengl.GL;

public class Kugel{

    public GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;
private int a=0;
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;
    private Kugelfangen kugelfangen;

    double s = (double) (Math.random() * 10-(Math.random()*10));
    double t = (double) (Math.random() * 10-(Math.random()*10));
    public Kugel() {

        int x = (int) (Math.random() * 425 - 200 );
        int z = (int) (Math.random() * 425 - 200);
        kugel= new GLKugel(0, 30, 0, 20);
        kugel.verschiebe(0, 0, 0);


    }


    public void bewege() {
       if(a==0){
      kugel.verschiebe(s,0,t);}

 if(this.gibX()<(-425)){
   kugel.verschiebe(-s,0,-t);
 }
        if(this.gibX()>(425)){
            kugel.verschiebe(-s,0,-t);
        }

 if(this.gibZ()>(425)){
  kugel.verschiebe(-s,0,-t);
 }
        if(this.gibZ()<(-425)){
            kugel.verschiebe(-s,0,-t);
        }
a=a++;
if(a>0){
kugel.verschiebe(Math.random() * 10-Math.random()*10,0,Math.random() * 10-Math.random()*10);}

    }

public boolean treffer(){
double a=Math.sqrt(
 Math.pow(dieBox.gibX()- kugel.gibX(),2 )+
 Math.pow(dieBox.gibY()-kugel.gibY(),2 )+
 Math.pow(dieBox.gibZ()-kugel.gibZ(),2)
);
if(a<70)
    return true;

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
