package com.wanghui.design.filter;

public class CnmHtmlFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain fc) {
        String text = (String)request.getAttribute("text");
        text = text.replace("cnm", "-处理CNM-");
        request.setAttribute("text", text);
        fc.doFilter(request, response, fc);
        response.setAttribute("text", response.getAttribute("text")+"-CnmHtmlFilter-");
    }
}
