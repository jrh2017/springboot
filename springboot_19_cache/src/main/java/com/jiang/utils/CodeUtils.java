package com.jiang.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
public class CodeUtils {

    private String[] patch = {"00000", "0000", "000", "00", "0", ""};

    public String generator(String tele) {
        int hash = tele.hashCode();
        int encryption = 20206666;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        Long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code.toString();
        int len = codeStr.length();
        return patch[len-1] + codeStr;
    }

    public static void main(String[] args) {
        String generator = new CodeUtils().generator("18866668888");
        System.out.println(generator);
    }

    @Cacheable(value = "smsCode", key = "#tele")
    public String get(String tele) {
        return null;
    }
}
