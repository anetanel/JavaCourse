package com.netanel.io;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		copy("files/readme.txt", "files/writeme.txt");
	}

	public static void copy(String src, String dest) {
		try (FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dest)) {
			int bytesRead = 0;
			byte[] bucket = new byte[256];
			while ((bytesRead = in.read(bucket)) > -1) {
				out.write(bucket, 0, bytesRead);	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}