/**
 * ContractQuery.java
 *
 * @Title:
 * @Description:
 * @Copyright:��������ǩ����Ƽ����޹�˾ Copyright (c) 2014
 * @Company:��������ǩ����Ƽ����޹�˾
 * @Created on 2014-11-6 ����1:57:31
 * @author lijianhang
 * @version 1.0
 */

/**
 * 
 */
package com.ssqian.signature.open.action.contract;

import org.json.JSONObject;

import com.ssqian.common.service.BaseAPIService;

/**
 * @author lijianhang
 *
 */
public class ContractQuery extends BaseAPIService {

	public static JSONObject execute(String status) {

		action = "contractQuery.json";

		reqcontent.put("status", status);

		return doService();
	}
	
	

}
