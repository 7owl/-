package com.ssqian.signature.open.action.test;

import com.ssqian.common.service.BaseAPIService;

public class SignRefusein extends BaseAPIService{

	
	public static String execute() {
		String tmpstring = "";
		action ="signRefuseinface.json";
		stype=4;//1����ͬ�б��ѯ ��2����ͬ��Ϣ��ѯ��3����ͬ���� 4����ͬǩ��
		String status = "1";//��ͬ״̬
		String userName="123456";
		String email="liwenjixxxx@163.com";
		String fsdid="14380636434435CJ82";//��ͬ���		
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
