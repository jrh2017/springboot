package com.jiang.service;

import com.jiang.domain.SMSCode;

/**
 * @author jiangronghua
 */
public interface SMSCodeService {
    public String sendCodeToSMS(String tele);
    public Boolean checkCode(SMSCode smsCode);

}
