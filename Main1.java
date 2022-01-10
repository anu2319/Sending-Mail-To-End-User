import java.io.IOException;
public class Main1
{
    public static void main(String[] args) throws IOException
    {
        sendMail s = new sendMail();
        Mail mail = new Mail();
        mail.testProperty();
        s.sendmail();
    }

}

