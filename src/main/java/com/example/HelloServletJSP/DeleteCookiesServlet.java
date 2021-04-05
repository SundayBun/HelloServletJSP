package com.example.HelloServletJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", "");

        cookie.setMaxAge(0);//чтобы удалить cookie назаначаем cookie с тем же имененем
        //и задаем ему срок действия 0 сек-> браузер его удаляет из своей памяти
      //  cookie.setMaxAge(-1);//при этом значении cookie удалится из браузера при закрытии браузера
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
