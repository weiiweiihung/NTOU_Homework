package softwareRegularMethod.tool;

import java.io.*;
import java.util.Base64;

/**
 * 為解決網路無法將檔案帶出 
 * 一、作業於封閉環境:檔案欲攜出 
 * 1.使用方法將欲攜出之檔案放置於"encryptPath"
 * 2.產出base64文字檔位於"writeBase64FileStr"，請將此檔案以email,google表單,hackMD方式寄出
 * =============================================================== 
 * 二、於其他環境:接收封閉環境之檔案 
 * 1.將email收到的檔案放置於"readBase64FileStr" 
 * 2.將base64還原成檔案，放置於"decryptPath"
 */
public class Base64Tool {
	public static void main(String[] args) {
//		String base64Str = fileToBase64();// 產生file的string base64
//		writeIntoFile(base64Str);// 將string base64寫入.txt
		String readFile = readFileBase64Str();//讀取string base64 .txt
		decodeFileString(readFile);//(base64Str);//將base64解為檔案
	}

	private static final String encryptPath = "D:\\base64Files\\1encrypt\\";
	private static final String encryptPathFileName = "Junit.pptx";
	private static final String writeBase64FileStr = "D:\\base64Files\\1encrypt\\decryptStr.txt";
	private static final String readBase64FileStr = "D:\\base64Files\\2decrypt\\123";
	private static final String decryptPath = "D:\\base64Files\\2decrypt\\";
	private static final String decryptfileName = "1";

	/** 將檔案轉為base64，並return String base64 */
	public static String fileToBase64() {
		String base64 = null;
		InputStream in = null;
		try {
			File file = new File(encryptPath + encryptPathFileName);
			in = new FileInputStream(file);
			byte[] bytes = new byte[(int) file.length()];
			in.read(bytes);
			base64 = Base64.getEncoder().encodeToString(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return base64;
	}

	/** 將String base64寫入.txt */
	public static void writeIntoFile(String base64Str) {
		try {
			// Constructs a FileWriter object given a file name.
			FileWriter fw = new FileWriter(writeBase64FileStr);
			fw.write(base64Str);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 解碼base64成文件至指定路徑 */
	private static void decodeFileString(String base64Str) {
		File dir = new File(decryptPath);
		if (!dir.exists() && !dir.isDirectory()) {
			dir.mkdirs();
		}
		byte[] bytes = Base64.getDecoder().decode(base64Str);

		File file = new File(decryptPath + decryptfileName);
		try (FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			bos.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** 讀取txt內容(內容應為單行之base64 String) */
	private static String readFileBase64Str() {
		FileReader fr = null;
		try {
			fr = new FileReader(readBase64FileStr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String tmp = null;

		try {
			return br.readLine();
			// while (((tmp = br.readLine()) != null)) {
			// System.out.println(tmp);
			// }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
}
