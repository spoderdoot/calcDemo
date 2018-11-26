package exceptions;

public class UndefinedMathException extends Exception{

    public UndefinedMathException(){
        super();
    }

    public UndefinedMathException(String m){
        super(m);
    }
}
