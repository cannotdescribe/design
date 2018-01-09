package com.wanghui.design.filter;

import java.util.HashMap;
import java.util.Map;

public class MyHttpRequest implements Request {

    private Map<Object, Object> map = new HashMap<Object, Object>();

    public void setAttribute(Object key, Object value) {
        map.put(key, value);
    }

    public Object getAttribute(Object key) {
        return map.get(key);
    }
}
