package com.wanghui.design.filter;

public class MmpHtmlFilter implements Filter {
    public void doFilter(Request request, Response response) {
        String text = (String)request.getAttribute("text");
        text = text.replace("mmp", "-处理MMP-");
        request.setAttribute("text", text);
    }
}
