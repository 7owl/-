/**
 * ContractdocUploadedit.java
 *
 * @Title:
 * @Description:
 * @Copyright:��������ǩ����Ƽ����޹�˾ Copyright (c) 2015
 * @Company:��������ǩ����Ƽ����޹�˾
 * @Created on 2015-1-6 ����10:44:15
 * @author lijianhang
 * @version 1.0
 */

/**
 * 
 */
package com.ssqian.signature.open.action.contract;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.json.JSONObject;

import com.ssqian.common.constant.CoreConstants;
import com.ssqian.common.service.BaseAPIService;
import com.ssqian.common.util.WebUtils;

/**
 * @author lijianhang
 *
 */
public class ContractdocUploadedit extends BaseAPIService {

	public static JSONObject execute(HttpServletRequest request) {

		String tempfile = WebUtils.getTempfile(request);

		try {
			FileItem fileItem = WebUtils.getFileItem(request);

			if (fileItem == null) {
				return null;
			}

			if (!WebUtils.upload(fileItem, tempfile)) {
				return null;
			}

			action = "contractdocUploadedit.json";

			uploadfile = tempfile;

			String filename = fileItem.getName();
			String email = "ljhangok@163.com";
			String name = "���";
			String needvideo = "0";
			String mobile = "13957113102";
			String needmobile = "0";
			String emailtitle = "����һ��Э����Ҫǩ��";
			String emailcontent = "��ǩ��";
			String sxdays = "5";

			upcontent.put("filename", filename);
			upcontent.put("email", email);
			upcontent.put("name", name);
			upcontent.put("needvideo", needvideo);
			upcontent.put("mobile", mobile);
			upcontent.put("needmobile", needmobile);
			upcontent.put("emailtitle", emailtitle);
			upcontent.put("emailcontent", emailcontent);
			upcontent.put("sxdays", sxdays);

			subdata = filename
					+ CoreConstants.SIGN_SPLITSTR + email
					+ CoreConstants.SIGN_SPLITSTR + name
					+ CoreConstants.SIGN_SPLITSTR + needvideo
					+ CoreConstants.SIGN_SPLITSTR + mobile
					+ CoreConstants.SIGN_SPLITSTR + needmobile
					+ CoreConstants.SIGN_SPLITSTR + emailtitle
					+ CoreConstants.SIGN_SPLITSTR + emailcontent
					+ CoreConstants.SIGN_SPLITSTR + sxdays;

			return doUPService();
		} catch (Exception e) {
			return null;
		} finally {
			WebUtils.deleteFile(tempfile);
		}
	}

}
