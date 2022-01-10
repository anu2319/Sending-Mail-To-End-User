import org.junit.Test;

import javax.mail.Session;
import javax.mail.*;
import javax.activation.*;
import javax.mail.internet.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sendMail extends Mail
{
    private Properties properties = null;
    @Test

    public void sendmail()
    {
        properties = new Properties();
        System.out.println("Preparing to send mail...");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port",587);

        Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(Mail.getFrom(),Mail.getPassword());
            }
        });

        try
        {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(property.getProperty("from")));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(property.getProperty("to")));
            mimeMessage.setSubject(property.getProperty("subject"));
            mimeMessage.setText(property.getProperty("body"));
            Transport.send(mimeMessage);
            System.out.println("Sent message successfully");
        }
        catch (MessagingException  mex)
        {
            mex.printStackTrace();
        }

    }

}



