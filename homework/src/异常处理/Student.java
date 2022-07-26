package 异常处理;

public class Student {
    String Name,Address;
    public void setAddress(String address) throws IllegalAddressException{
        int T=0;
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='省'||address.charAt(i)=='市')
                T=1;
        }
        if(T==0){
            throw new IllegalAddressException("地址格式错误，必须包含省或市");
        }
        Address = address;
    }
    public void setName(String name) throws IllegaNameException {
        if(name.length()>5||name.length()<1){
            throw new IllegaNameException("姓名格式不正确，长度需要在1-5");
        }
        Name = name;
    }

    public static void main(String[] args) {
        Student s=new Student();
        try {
            s.setAddress("安徽省");
        }catch(IllegalAddressException e){
            e.printStackTrace();
        }

        try {
            s.setName("刘凯文");
        } catch (IllegaNameException e) {
            e.printStackTrace();
        }
    }
}
