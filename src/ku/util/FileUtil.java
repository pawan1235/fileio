package ku.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;

import javax.management.RuntimeErrorException;

import stopwatch.TaskTimer;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class is to copy inputstream to outputstream.
 * 
 * @author Pawan Intawongsa
 *
 */
public class FileUtil {
	/**
	 * Copy inputstream to an outputsteam by one byte.
	 * 
	 * @param in
	 *            is Inputstream that will read
	 * @param out
	 *            is Outputstream that will wite
	 */
	static void copy(InputStream in, OutputStream out) {
		try {
			int count;
			while ((count = in.read()) != -1) {
				out.write(count);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy inputstream to an outputsteam by input byte.
	 * 
	 * @param in
	 *            is Inputstream that will read
	 * @param out
	 *            is Outputstream that will wite
	 * @param blocksize
	 *            is size of byte
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] buffer = new byte[blocksize];
		int count;
		try {
			while ((count = in.read(buffer)) != -1) {
				out.write(buffer, 0, count);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Copy InputStream to OutputStream by using BufferedReader and PrintWriter.
	 * 
	 * @param in
	 *            is Inputstream that will read
	 * @param out
	 *            is Outputstream that will wite
	 * @throws IOException
	 *             if it can't copy to Outputstream
	 */
	static void bcopy(InputStream in, OutputStream out) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		PrintWriter pw = new PrintWriter(out);
		String count;
		try {
			while ((count = br.readLine()) != null) {
				pw.write(count + "\n");
			}
		} finally {
			br.close();
			pw.close();
		}
	}

}
