package com.ssqian.signature.open.action.test;

import com.ssqian.common.service.BaseAPIService;

public class ContractInfo extends BaseAPIService {

	public static String execute() {
		String tmpstring = "";
		action ="contractInfo.json";
		stype=2;//1����ͬ�б��ѯ ��2����ͬ��Ϣ��ѯ��3����ͬ���� 4����ͬǩ��
		String status = "2";//��ͬ״̬
		String fsdid="1430380557067F8Y32";//��ͬ���		
		reqcontent.put("fsdid", fsdid);
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
