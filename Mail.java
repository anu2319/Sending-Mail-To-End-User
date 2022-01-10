import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Mail
{
    public static Properties property ;
    public  static void testProperty() throws IOException
    {
        property = new Properties();
        FileInputStream fs = new FileInputStream("src/Property");
        property.load(fs);
        System.out.println(property.getProperty("to"));
        System.out.println(property.getProperty("from"));
        System.out.println(property.getProperty("subject"));
        System.out.println(property.getProperty("body"));

    }

    private String from;
    private String to;
    private String password;
    private String subject;
    private String body;

    public static String getFrom()
    {
        return property.getProperty("from");
    }
    public String getTo()
    {
        return property.getProperty("to");
    }
    public static String getPassword()
    {
        return property.getProperty("password");
    }
    public String getSubject()
    {
        return property.getProperty("subject");
    }
    public String getBody()
    {
        return property.getProperty("body");
    }

}


