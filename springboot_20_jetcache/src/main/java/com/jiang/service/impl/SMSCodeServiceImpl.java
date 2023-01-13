package com.jiang.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.jiang.domain.SMSCode;
import com.jiang.service.SMSCodeService;
import com.jiang.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangronghua
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {
    @Autowired
    private CodeUtils codeUtils;

    // romate 方案
    // @CreateCache(area = "sms", name = "jetCache", expire = 10, timeUnit = TimeUnit.SECONDS)
    @CreateCache(name = "jetCache_", expire = 1000, timeUnit = TimeUnit.SECONDS, cacheType = CacheType.LOCAL)
    private Cache<String, String> jetCache;

    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        jetCache.put(tele, code);
        return code;
    }

    @Override
    public Boolean checkCode(SMSCode smsCode) {
        String code = jetCache.get(smsCode.getTele());
        return smsCode.getCode().equals(code);
    }
}
