package com.wanghui.design.filter;

public interface Request {
    void setAttribute(Object key, Object value);
    Object getAttribute(Object key);
}
