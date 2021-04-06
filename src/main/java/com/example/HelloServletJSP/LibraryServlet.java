package com.example.HelloServletJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "com.example.HelloServletJSP.LibraryServlet", value = "/com.example.HelloServletJSP.LibraryServlet")
public class LibraryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pw= response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_ee_db","postgres","1Q4sdfWER");

            Statement stnt= conn.createStatement(); //создаем объект для совершения запросов
            // с пом объекта Statement мы можем создавать sql запросы к нашей базе данных

            //создаем запрос
            ResultSet rs=stnt.executeQuery("select  title from books"); //в объекте  rs будет хранится результат выполнения запроса

            //итерация по всему запросу и вывод через название столбца каждого элемента
            while (rs.next()) { //next() на подобие итератора (hasNext()) из util возвращает значение boolean
                pw.println(rs.getString("title"));
            }

            //закрываем подключение
            stnt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
