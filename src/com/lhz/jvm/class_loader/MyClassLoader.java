package com.lhz.jvm.class_loader;

import com.lhz.jvm.bytecode.String1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author lhzlhz
 * @create 2020/8/5
 */
public class MyClassLoader extends ClassLoader{
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		File file = new File("D:/JavaSoft/Workspase/JVM-learn/out/production/JVM-learn",name.replace(".","/").concat(".class"));
		try {
			FileInputStream fis = new FileInputStream(file);

			ByteArrayOutputStream bis = new ByteArrayOutputStream();
			int len = 0;
			while ((len = fis.read()) != -1) {
				bis.write(len);
			}
			byte[] bytes = bis.toByteArray();
			bis.close();
			fis.close();
			return defineClass(name, bytes, 0, bytes.length);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		MyClassLoader mc = new MyClassLoader();
		//mc.findClass();
		Class<?> clazz = mc.loadClass("com.lhz.jvm.bytecode.String1");
		String1 string1 = (String1)clazz.newInstance();
		string1.hello();

		System.out.println(String1.class.getClassLoader());
	}
}
