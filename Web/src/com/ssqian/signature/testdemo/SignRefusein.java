package com.ssqian.signature.testdemo;

import com.ssqian.common.service.BaseAPIService;

public class SignRefusein extends BaseAPIService{

	
	public static String execute() {//�ܾ��ӿ�
		String tmpstring = "";
		action ="signRefuseinface.json";
		stype=4;// 4����ͬǩ��
		String status = "2";//��ͬ״̬
		String userName="123456";
		String email="362021204@qq.com";
		String fsdid="1428471503060Q54W2";//��ͬ���		
		reqcontent.put("status", status);
		reqcontent.put("fsdid", fsdid);
		reqcontent.put("email", email);
		reqcontent.put("userName", userName);
		reqcontent.put("status", status);
		tmpstring = doService(stype).toString();
		System.out.println(tmpstring);
		return tmpstring;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		execute();
	}
	
	
	
	
	
	
	
	
}
