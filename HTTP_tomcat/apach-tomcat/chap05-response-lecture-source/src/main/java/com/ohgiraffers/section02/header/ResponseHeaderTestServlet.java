package com.ohgiraffers.section02.header;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ResponseHeaderTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
//        response.setHeader("Refresh","1");  // 1초마다 새로고침 해줌

        long currentTime = System.currentTimeMillis();

        out.print("<h1>" + currentTime + "</h1>");

        out.close();

        Collection<String> responseHeaderNames = response.getHeaderNames();
        Iterator<String> iter = responseHeaderNames.iterator();
        while (iter.hasNext()) {
            String headerName = iter.next();
            System.out.println(headerName + " : " + response.getHeader(headerName));
        }
    }
}
