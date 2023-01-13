package com.jiang.service.impl;

import com.jiang.domain.SMSCode;
import com.jiang.service.SMSCodeService;
import com.jiang.utils.CodeUtils;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeoutException;

/**
 * @author jiangronghua
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {
    @Autowired
    private CodeUtils codeUtils;

    // 以下是Spring中使用memcached

    @Autowired
    private MemcachedClient memcachedClient;
    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        try {
            memcachedClient.set(tele, 10, code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }

    @Override
    public Boolean checkCode(SMSCode smsCode) {
        String code = null;
        try {
            code = memcachedClient.get(smsCode.getTele()).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smsCode.getCode().equals(code);
    }

    // @Override
    // // @Cacheable(value = "smsCode", key = "#tele")
    // @CachePut(value = "smsCode", key = "#tele")
    // public String sendCodeToSMS(String tele) {
    //     String code = codeUtils.generator(tele);
    //     return code;
    // }
    //
    // @Override
    // public Boolean checkCode(SMSCode smsCode) {
    //     String code = smsCode.getCode();
    //     String cacheCode = codeUtils.get(smsCode.getTele());
    //     return code.equals(cacheCode);
    // }



}
