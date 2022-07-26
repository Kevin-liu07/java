package 异常处理;

public class IllegalAddressException extends Exception{
    public IllegalAddressException(){

    }
    public IllegalAddressException(String message){
        super(message);
    }
}
