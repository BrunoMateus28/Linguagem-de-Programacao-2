public class AnguloObj {
    private double arcRad;

    public AnguloObj(double angulo){
        this.arcRad = angulo * Math.PI / 180;
    }

    public double cvtAngulo() {
        return this.arcRad * Math.PI / 180;
    }

    public double fSeno() {
        return Math.sin(this.arcRad);
    }

    public double fCosseno() {
        return Math.cos(this.arcRad);
    }

    public double fTangente() {
        return Math.tan(this.arcRad);
    }

    public double fCotangente() {
        return 1.0 / Math.tan(this.arcRad);
    }

    public String toString(){
        return "Arco: "+Math.round(this.arcRad * 100.0) / 100.0+"\n"+
        "Seno: "+Math.round(this.fSeno() * 100.0) / 100.0+"\n"+
        "Cosseno: "+Math.round(this.fCosseno() * 100.0) / 100.0+"\n"+
        "Tangente: "+Math.round(this.fTangente() * 100.0) / 100.0+"\n"+
        "Cotangente: "+Math.round(this.fCotangente() * 100.0) / 100.0+"\n";
        
    }
}
