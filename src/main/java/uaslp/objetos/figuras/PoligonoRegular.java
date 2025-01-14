package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados=numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados, double lado) {
        this.lado = lado;
        this.numeroDeLados = numeroDeLados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
     double teta;
     double apotema;

     teta= Math.toRadians((360.0/(numeroDeLados))/2);
     apotema = lado/(2* Math.tan(teta));

     return ((lado*numeroDeLados) * apotema)/2;
    }

    public String getName(){
        return "Poligono Regular";
    }
}
