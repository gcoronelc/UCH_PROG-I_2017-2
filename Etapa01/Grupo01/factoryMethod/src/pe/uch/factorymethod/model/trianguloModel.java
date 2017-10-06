
package pe.uch.factorymethod.model;

public abstract class trianguloModel {
   private int ladoA;
   private int ladob;
   private int ladoc;

    public trianguloModel() {
    }

   
   
    public trianguloModel(int ladoA, int ladob, int ladoc) {
        this.ladoA = ladoA;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }
   
    public abstract String getDescripcion();
   
    
    

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladob;
    }

    public void setLadob(int ladob) {
        this.ladob = ladob;
    }

    public int getLadoC() {
        return ladoc;
    }

    public void setLadoc(int ladoc) {
        this.ladoc = ladoc;
    }
    
    
}
