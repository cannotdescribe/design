package com.wanghui.design.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<Filter>();
    private int size = 0;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void doFilter(Request request, Response response, FilterChain fc) {
        if(size == filters.size()) return ;
        Filter f = filters.get(size);
        size ++;
        f.doFilter(request, response, fc);
    }
}
