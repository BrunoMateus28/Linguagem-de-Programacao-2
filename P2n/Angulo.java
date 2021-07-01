public class Angulo {
    public double cvtAngulo(double graus) {
        return graus * Math.PI / 180;
    }

    public double fSeno(double angulo) {
        return Math.sin(angulo);
    }

    public double fCosseno(double angulo) {
        return Math.cos(angulo);
    }

    public double fTangente(double angulo) {
        return Math.tan(angulo);
    }

    public double fCotangente(double angulo) {
        return 1.0 / Math.tan(angulo);
    }
}
