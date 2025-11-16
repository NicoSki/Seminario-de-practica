package modelo;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class ModeloEmail {
    private String emailFrom = "notificacionessistema6@gmail.com";
    private String contrasena = "nzwlykwazuhyzynh";
    private String emailTo = "notificacionessistema6@gmail.com";
    private String subject;
    private String content;
    
    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;
    
    public ModeloEmail() {
        this.mProperties = new Properties();
    }

    public void setEmailData(String subject, String content){
        this.subject = subject;
        this.content = content;
    }
    
    public void crearEmail(String subject, String content){
        
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        try{
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "UTF-8","html");
        }catch(AddressException ex){
            System.out.println(ex.toString());
        }catch(MessagingException ex){
            System.out.println(ex.toString());
        }
    }
    
    public boolean enviarNotificacion(){
        try{
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, contrasena);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
            System.out.println("Correo Enviado");
            return true;
        }catch(NoSuchProviderException ex){
            System.out.println(ex.toString());
            return false;
        }catch(MessagingException ex){
            System.out.println(ex.toString());
            return false;
        }
    }

    public String getEmailFrom() {
        return emailFrom;
    }

        public String getContrasena() {
        return contrasena;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Properties getmProperties() {
        return mProperties;
    }

    public void setmProperties(Properties mProperties) {
        this.mProperties = mProperties;
    }

    public Session getmSession() {
        return mSession;
    }

    public void setmSession(Session mSession) {
        this.mSession = mSession;
    }

    public MimeMessage getmCorreo() {
        return mCorreo;
    }

    public void setmCorreo(MimeMessage mCorreo) {
        this.mCorreo = mCorreo;
    }
    
    
    
}
