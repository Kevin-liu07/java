import java.sql.Connection;
import java.sql.DriverManager;

public class test {
    public static void main(String[] args)  throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("驱动类加载成功！！");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost: 1433;DataBaseName=test", "kevin", "lll666888");

            System.out.println("连接数据库成功！！");
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
