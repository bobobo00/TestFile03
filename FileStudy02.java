package cn.io.study01;

import java.io.File;

/**
 * ���·�������·��
 * ���·�����������̷�
 * ����·���������̷�
 * @author dell
 *
 */

public class FileStudy02 {
	public static void main(String[] args) {
		String path="E:\\workspace-java\\IO������\\����.PNG";
		
		//����·��
		File src=new File(path);
		System.out.println(src.getAbsolutePath());//��ȡ����·��
		
		//���·��
		System.out.println(System.getProperty("user.dir"));//���·��������ڵ�ǰ��Ŀ��·��
		src=new File("����.PNG");
		System.out.println(src.getAbsolutePath());
		
	}

}
