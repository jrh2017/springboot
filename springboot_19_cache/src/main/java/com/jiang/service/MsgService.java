package com.jiang.service;

/**
 * @author jiangronghua
 */
public interface MsgService {
    public String get(String tele);
    public Boolean check(String tele, String code);
}
