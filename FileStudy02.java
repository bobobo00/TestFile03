package cn.io.study01;

import java.io.File;

/**
 * 相对路径与绝对路径
 * 相对路径：不存在盘符
 * 绝对路径：存在盘符
 * @author dell
 *
 */

public class FileStudy02 {
	public static void main(String[] args) {
		String path="E:\\workspace-java\\IO流技术\\捕获.PNG";
		
		//绝对路径
		File src=new File(path);
		System.out.println(src.getAbsolutePath());//获取完整路径
		
		//相对路径
		System.out.println(System.getProperty("user.dir"));//相对路径是相对于当前项目的路径
		src=new File("捕获.PNG");
		System.out.println(src.getAbsolutePath());
		
	}

}
