package utill;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Assert;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class ConfigSSH {

	private JSch jsch;
	private Session sessao;
	private Channel canal;
	private String host;
	private String usuario;
	private Integer porta = 22;
	private String senha;
	private InputStream mSShInput;
	private OutputStream mSSHOutput;

	/**
	 * Conectar ao servidor via SSH, e abri um canal para executar comandos.
	 * 
	 * @param esteira Host para abrir conexão
	 * 
	 * @author dsilvafe
	 */
	public void openConexao(String esteira) {
		JSch.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
		this.jsch = new JSch();

		try {
			this.sessao = jsch.getSession(usuario, host, porta);
			this.sessao.setPassword(senha);
			this.sessao.setConfig("StrictHostKeyChecking", "no");
			System.out.println("Estabelecendo conexão...");
			this.sessao.connect();
			System.out.println("Conexão Estabelecida - host:" + host + " - Porta:" + porta + " - Usuario:" + usuario);
			this.canal = this.sessao.openChannel("shell");
			this.canal.connect();
			System.out.println("canal criado.");
			this.mSShInput = this.canal.getInputStream();
			this.mSSHOutput = this.canal.getOutputStream();

		} catch (JSchException | IOException e) {
			e.printStackTrace();
			Assert.fail("Falha na conexão");
		}
	}

	/**
	 * Executa comando passado
	 * 
	 * @param strComando Comando a ser executado
	 * @return Retorna "true" se o comando foi execultado "false" caso der alguma
	 *         falha
	 * 
	 * @author dsilvafe
	 */
	public boolean sendCommand(String strComando) {
		boolean blResult = false;
		try {
			if (this.mSSHOutput != null) {
				this.mSSHOutput.write(strComando.getBytes());
				this.mSSHOutput.flush();
				blResult = true;
			}
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return blResult;
	}

	/**
	 * retorna String da saida do comando executado.
	 * 
	 * @author dsilvafe
	 */
	public String outputSSH() {
		String strData = "";
		try {
			if (this.mSShInput != null) {
				int iAvailable = this.mSShInput.available();
				while (iAvailable > 0) {
					byte[] btBuffer = new byte[iAvailable];
					int iByteRead = this.mSShInput.read(btBuffer);
					iAvailable = iAvailable - iByteRead;
					strData += new String(btBuffer);
				}
			}
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		return strData;
	}

	/**
	 * Fecha conexão SSH
	 * 
	 * @author dsilvafe
	 */
	public void closeConexao() {
		if (this.sessao != null) {
			this.sessao.disconnect();
		}
		if (this.canal != null) {
			this.canal.isClosed();
		}
		if (this.mSShInput != null) {
			try {
				this.mSShInput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (this.mSSHOutput != null) {
			try {
				this.mSSHOutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.jsch = null;
	}
}
