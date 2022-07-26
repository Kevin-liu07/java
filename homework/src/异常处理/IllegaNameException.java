package 异常处理;

public class IllegaNameException extends Exception{
    public IllegaNameException(){

    }
    public IllegaNameException(String message){
        super(message);
    }
}
