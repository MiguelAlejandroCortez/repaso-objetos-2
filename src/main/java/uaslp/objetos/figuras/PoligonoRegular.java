package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){

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

     teta= (360/(numeroDeLados * numeroDeLados));
     apotema = lado/(2* Math.tan(teta));

     return ((lado*numeroDeLados) * apotema)/2;
    }

    public String getName(){
        return "Poligono Regular";
    }
}
