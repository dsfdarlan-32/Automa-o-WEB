package br.com.vivo.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compactador {

	List<String> filesListInDir = new ArrayList<String>();

	/**
	 * Este método compacta o diretório
	 * 
	 * @param dir
	 * @param zipDirName
	 */
	public void zipDirectory(File dir, String zipDirName) {
		try {
			populateFilesList(dir);
			// agora compacta os arquivos um por um
			// cria ZipOutputStream para gravar no arquivo zip
			FileOutputStream fos = new FileOutputStream(zipDirName);
			ZipOutputStream zos = new ZipOutputStream(fos);
			for (String filePath : filesListInDir) {

				// para ZipEntry precisamos manter apenas o caminho relativo do arquivo, então
				// usamos substring no caminho absoluto
				ZipEntry ze = new ZipEntry(filePath.substring(dir.getAbsolutePath().length() + 1, filePath.length()));
				zos.putNextEntry(ze);
				// lê o arquivo e escreve em ZipOutputStream
				FileInputStream fis = new FileInputStream(filePath);
				byte[] buffer = new byte[1024];
				int len;
				while ((len = fis.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}
				zos.closeEntry();
				fis.close();
			}
			zos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este método preenche todos os arquivos em um diretório em uma lista
	 * 
	 * @param dir
	 * @throws IOException
	 */
	private void populateFilesList(File dir) throws IOException {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile())
				filesListInDir.add(file.getAbsolutePath());
			else
				populateFilesList(file);
		}
	}
}