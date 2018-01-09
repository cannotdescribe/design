package com.wanghui.design.filter;

public class CnmHtmlFilter implements Filter {
    public void doFilter(Request request, Response response) {
        String text = (String)request.getAttribute("text");
        text = text.replace("cnm", "-处理CNM-");
        request.setAttribute("text", text);
    }
}
