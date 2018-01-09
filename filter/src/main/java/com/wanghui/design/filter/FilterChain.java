package com.wanghui.design.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<Filter>();

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void doFilter(Request request, Response response) {
        for(Filter filter : filters){
            filter.doFilter(request, response);
        }
    }
}
