package com.wanghui.design.filter;

public class NmbHtmlFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain fc) {
        String text = (String)request.getAttribute("text");
        text = text.replace("nmb", "-处理NMB-");
        request.setAttribute("text", text);
        fc.doFilter(request, response, fc);
        response.setAttribute("text", response.getAttribute("text")+"-NmbHtmlFilter-");
    }
}
