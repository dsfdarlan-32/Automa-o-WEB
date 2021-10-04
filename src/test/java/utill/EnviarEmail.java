package utill;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;

public class EnviarEmail {
	String meuEmail = "teste659887@gmail.com";
	String minhaSenha = "0000000000";

	public void enviarEmailSimples(String emailDestino) {
		try {
			SimpleEmail email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setStartTLSEnabled(true);
			email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
			email.setSSLOnConnect(true);
			email.setFrom(meuEmail);
			email.setSubject("Teste");
			email.setMsg("Teste Envio Email java");
			email.addTo(emailDestino);
			System.out.println("Enviando email...");
			email.send();
			System.out.println("Email enviando com sucesso");
		} catch (EmailException e) {
			System.out.println("Erro ao enviar Email");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void enviarEmailComAnexo(String emailDestino, String caminhoArq) {
		try {
			MultiPartEmail email = new MultiPartEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setStartTLSEnabled(true);
			email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
			email.setSSLOnConnect(true);
			email.setFrom(meuEmail);
			email.setSubject("Arquivo SIRS");
			email.setMsg("Segue em anexo o arquivo SIRS gerado.");
			email.addTo(emailDestino);
			System.out.println("Enviando email...");
			EmailAttachment anexo = new EmailAttachment();
			anexo.setPath(caminhoArq);
			email.attach(anexo);
			email.send();
			System.out.println("Email enviando com sucesso.");
		} catch (EmailException e) {
			System.out.println("Erro ao enviar Email");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void enviarArquivoSIRS() {
		EnviarEmail enviarEmail = new EnviarEmail();
		enviarEmail.enviarEmailComAnexo("nalrad32@gmail.com", "C:/SIRS/SIRS.zip");
	}
}
