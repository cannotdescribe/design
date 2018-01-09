package com.wanghui.design.filter;

public class HttpMain {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new CnmHtmlFilter());
        filterChain.addFilter(new NmbHtmlFilter());
        filterChain.addFilter(new MmpHtmlFilter());
        Request request = new MyHttpRequest();
        request.setAttribute("text", "我说了： nmb , 你真是个天才 mmp, cnm");
        Response response= new MyHttpResponse();
        filterChain.doFilter(request, response);
        System.out.println(request.getAttribute("text"));
    }
}
