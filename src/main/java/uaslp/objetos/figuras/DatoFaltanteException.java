package uaslp.objetos.figuras;

public class DatoFaltanteException extends RuntimeException {
    public DatoFaltanteException(String text){
        super(text);
    }

    DatoFaltanteException(){}
}
