
package com.ssqian.signature.open.action.test;
import java.io.IOException;
import com.ssqian.common.constant.CoreConstants;
import com.ssqian.signature.util.SignUtil;
public class GetDragNoSignPagePc {

	public static void excute() throws IOException {//���׷�ָ����ʼ��λ�ã�����Ĭ��ǩ���������ҷ��϶��� 
		String action = "getDragNoSignPagePc.json";
		String pagenum="1";
		String signx="0.5";
		String signy="0.5";
		String typedevice="1";
		String returnurl="http://www.baidu.com";
		StringBuilder signdata = new StringBuilder();
		signdata.append(action);
		signdata.append(CoreConstants.SIGN_SPLITSTR + CoreConstants.MID);
		signdata.append(CoreConstants.SIGN_SPLITSTR + "1432029022943GRU12");
		signdata.append(CoreConstants.SIGN_SPLITSTR + "362021204@qq.com");
		signdata.append(CoreConstants.SIGN_SPLITSTR + pagenum);
		signdata.append(CoreConstants.SIGN_SPLITSTR + signx);
		signdata.append(CoreConstants.SIGN_SPLITSTR + signy);
		signdata.append(CoreConstants.SIGN_SPLITSTR + returnurl);
		signdata.append(CoreConstants.SIGN_SPLITSTR + typedevice);
	
		String sign = null;
		try {
			sign = SignUtil.sign(signdata.toString()).trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sign = java.net.URLEncoder.encode(sign);
		String url = "http://192.168.30.193:8080/openpage2/getDragNoSignPagePc.json?fsid=1432029022943GRU12&pagenum="+pagenum+"&signx="+signx+"&signy="+signy+"&typedevice="+typedevice+"&returnurl="+returnurl+"&email=362021204@qq.com&mid=E0000000000000000009&sign="
				+ sign;
		System.out.println(url);
	}
	public static void main(String[] args) throws IOException {
		excute();
	}
}