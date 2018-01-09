package com.wanghui.design.filter;

public class NmbHtmlFilter implements Filter {
    public void doFilter(Request request, Response response) {
        String text = (String)request.getAttribute("text");
        text = text.replace("nmb", "-处理NMB-");
        request.setAttribute("text", text);
    }
}
