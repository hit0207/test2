package test;

import java.io.File;

public class test {

	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir"));
		String path = file.getAbsolutePath().replace('\\', '/');
		System.out.println(path);
			   path = path.substring(0, path.indexOf('/'));
		System.out.println("test"+path);
		System.out.println("testpush and merge");
	}
}
