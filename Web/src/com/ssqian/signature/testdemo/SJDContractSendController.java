package com.ssqian.signature.testdemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.ssqian.common.service.BaseAPIService;

public class SJDContractSendController extends BaseAPIService {//��ͬ���ͽӿ�

	public static String execute() {
		List<Map<String, Object>> contractlist = new ArrayList<Map<String, Object>>();
		String email[]={"352021205@qq.com","wenji_lixx2@163.com","wenji_lixx3@163.com","wenji_lixx4@163.com","wenji_lixx5@163.com"};
		String name[]={"���� ��","���Զ�","������","������","������"};
		String mobile[]={"18206532682","18698237444","18698237445","18698237446","18698237447"};
		int lenth=1;
		for (int i = 0; i <lenth ; i++) {
			Map<String, Object> contrinfoMap = new LinkedHashMap<String, Object>();
			contrinfoMap.put("email", email[i]);
			contrinfoMap.put("name", name[i]);
			contrinfoMap.put("isvideo", "0");
			contrinfoMap.put("mobile", mobile[i]);
			contrinfoMap.put("emailtitle", "����δ ���ͨ");
			contrinfoMap.put("emailcontent", "����δ���ͨ������");
			contrinfoMap.put("sxdays", "0");
			contrinfoMap.put("selfsign", "0");
			contrinfoMap.put("usertype", "1");
			contrinfoMap.put("Signimagetype", "0");	
			contractlist.add(contrinfoMap);	
		}
		JSONArray jsonArray = JSONArray.fromObject(contractlist);
		
		userlist=jsonArray.toString();
		String tmpstring = "";
		action ="sjdsendcontract.json";
		stype=2;//��ͬ��Ϣ��ѯ
		String signid="1439862282045C5LF2";//��ͬ���		
		reqcontent.put("signid", signid);
		reqcontent.put("userlist", userlist);
		
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
