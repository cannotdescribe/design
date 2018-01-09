package com.wanghui.design.filter;

public class HttpMain {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new CnmHtmlFilter());
        filterChain.addFilter(new NmbHtmlFilter());
        filterChain.addFilter(new MmpHtmlFilter());
        Request request = new MyHttpRequest();
        request.setAttribute("text", "我说了： cnm ,nmb, mmp");
        Response response= new MyHttpResponse();
        filterChain.doFilter(request, response, filterChain);
        System.out.println(request.getAttribute("text"));
        System.out.println(response.getAttribute("text"));
    }
}
