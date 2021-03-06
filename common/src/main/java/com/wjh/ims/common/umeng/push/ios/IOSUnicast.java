package com.wjh.ims.common.umeng.push.ios;


import com.wjh.ims.common.umeng.exception.RecruitException;
import com.wjh.ims.common.umeng.push.IOSNotification;

public class IOSUnicast extends IOSNotification {
	public IOSUnicast(String appkey,String appMasterSecret) throws RecruitException {
			setAppMasterSecret(appMasterSecret);
			setPredefinedKeyValue("appkey", appkey);
			this.setPredefinedKeyValue("type", "unicast");	
	}
	
	public void setDeviceToken(String token) throws RecruitException {
    	setPredefinedKeyValue("device_tokens", token);
    }
}
