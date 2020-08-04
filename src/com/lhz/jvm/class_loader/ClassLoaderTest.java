package com.lhz.jvm.class_loader;

/**
 * @author lhzlhz
 * @create 2020/8/5
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		String app = System.getProperty("java.class.path");
		System.out.println("APP ClassLoader:"+app.replaceAll(";",System.lineSeparator()));
		System.out.println("--------------------");
		String ext = System.getProperty("java.ext.dirs");
		System.out.println("ext ClassLoader:"+ext.replaceAll(";","\r\n"));
		System.out.println("--------------------");

		String bootClassPath = System.getProperty("sun.boot.class.path");
		System.out.println("boot ClassLoader:"+bootClassPath.replaceAll(";","\r\n"));
	}

	//APP ClassLoader:D:\JavaSoft\JDK8\jdk\jre\lib\charsets.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\deploy.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\access-bridge-64.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\cldrdata.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\dnsns.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\jaccess.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\jfxrt.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\localedata.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\nashorn.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\sunec.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\sunjce_provider.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\sunmscapi.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\sunpkcs11.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\ext\zipfs.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\javaws.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jce.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jfr.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jfxswt.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jsse.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\management-agent.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\plugin.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\resources.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\rt.jar
	//D:\JavaSoft\Workspase\JVM-learn\out\production\JVM-learn
	//E:\Soft\javasoft\idea2020\IntelliJ IDEA 2020.1.1\lib\idea_rt.jar
	//--------------------
	//ext ClassLoader:D:\JavaSoft\JDK8\jdk\jre\lib\ext
	//C:\WINDOWS\Sun\Java\lib\ext
	//--------------------
	//boot ClassLoader:D:\JavaSoft\JDK8\jdk\jre\lib\resources.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\rt.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\sunrsasign.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jsse.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jce.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\charsets.jar
	//D:\JavaSoft\JDK8\jdk\jre\lib\jfr.jar
	//D:\JavaSoft\JDK8\jdk\jre\classes
}
