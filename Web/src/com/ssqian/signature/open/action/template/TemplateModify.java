/**
 * TemplateModify.java
 *
 * @Title:
 * @Description:
 * @Copyright:��������ǩ����Ƽ����޹�˾ Copyright (c) 2014
 * @Company:��������ǩ����Ƽ����޹�˾
 * @Created on 2014-10-31 ����5:14:45
 * @author lijianhang
 * @version 1.0
 */

/**
 * 
 */
package com.ssqian.signature.open.action.template;

import org.json.JSONObject;

import com.ssqian.common.service.BaseAPIService;

/**
 * @author lijianhang
 *
 */
public class TemplateModify extends BaseAPIService {

	public static JSONObject execute(String id, String name, String desc) {

		action = "templateModify.json";

		reqcontent.put("id", id);
		reqcontent.put("name", name);
		reqcontent.put("desc", desc);

		return doService();
	}

}
