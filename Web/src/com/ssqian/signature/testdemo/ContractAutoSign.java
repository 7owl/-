package com.ssqian.signature.testdemo;

import com.ssqian.common.service.BaseAPIService;

public class ContractAutoSign extends BaseAPIService{


	public static String execute() {//�Զ�ǩ��ӿ�
		String tmpstring = "";
		action ="AutoSign.json";
		stype=2;//��ͬ��Ϣ��ѯ
		String signid="1439884271910BXDF2";//��ͬ���
		String email="13706532684@nomail.visual";
		String pagenum="0";
		String signx="0.5";
		String signy="0.5";
		
		String openflag="1";//��ͬ������־ 1 ��ʾ��ͬǩ�������0��ʾ��ͬǩ��û�н���
		
		reqcontent.put("email", email);
		reqcontent.put("signid", signid);
		reqcontent.put("email", email);
		reqcontent.put("pagenum", pagenum);
		reqcontent.put("signx", signx);
		reqcontent.put("signy", signy);
		reqcontent.put("openflag", openflag);
		
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
