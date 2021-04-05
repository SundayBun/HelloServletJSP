package com.example.HelloServletJSP;

import logic.Cart;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/test-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!!!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        String user=(String)session.getAttribute("current_user");

        if(user==null){
            //response для анонимного пользователя
            //авторизация
            //регитсрауия
            // session.setAttribute("current_user", ID);
        } else{
            //response для авторизованного пользователя
        }

        /* здесь пример с сохран корзиной покупок
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart", cart);

        //операция forward для вызова .jsp
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);



        /* здесь пример с кол-вом посещений
        HttpSession session=request.getSession();
        // задаем атрибут для хранения кол-ва посещений
        Integer count=(Integer) session.getAttribute("count");

        if(count==null){ //если атрибут==null, значит пользователь зашел на страницу в первый раз
            count=1;
            session.setAttribute("count",count);

        } else { //если атрибут!=null, к атрибуту прибавляем +1 вход
            session.setAttribute("count",count+=1);
        }

      //  String name=request.getParameter("name");
      //  String surname=request.getParameter("surname");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
 //       out.println("<h1>" + "Hello " +name +" "+surname+ "</h1>");
        out.println("<h1>" + "Your count is " +count+ "</h1>");
        out.println("</body></html>");
*/

/* //операция forward для перенаправления запроса на текущем сервере
        RequestDispatcher dispatcher= request.getRequestDispatcher("/TestJSP.jsp");
        dispatcher.forward(request,response);

 */
    }

    public void destroy() {
    }
}