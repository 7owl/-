/**
 * TemplatecfgGet.java
 *
 * @Title:
 * @Description:
 * @Copyright:��������ǩ����Ƽ����޹�˾ Copyright (c) 2014
 * @Company:��������ǩ����Ƽ����޹�˾
 * @Created on 2014-11-10 ����9:57:41
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
public class TemplatecfgGet extends BaseAPIService {

	public static JSONObject execute(String id) {

		action = "templatecfgGet.json";

		reqcontent.put("id", id);

		return doService();
	}

}
