/**
 * ContractAudit.java
 *
 * @Title:
 * @Description:
 * @Copyright:��������ǩ����Ƽ����޹�˾ Copyright (c) 2014
 * @Company:��������ǩ����Ƽ����޹�˾
 * @Created on 2014-11-20 ����7:44:44
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
public class ContractAudit extends BaseAPIService {

	public static JSONObject execute(String fsdid, String status) {

		action = "contractAudit.json";

		reqcontent.put("fsdid", fsdid);
		reqcontent.put("status", status);

		return doService();
	}

}
