package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/demoServlet1")
public class ServletLife extends HttpServlet {
	//生命周期的初始化方式
	
	public void init() throws ServletException {
		System.out.println("servlet ->init()");
	}
	//生命周期的处理方法-->接收http请求，返回http应答
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		System.out.println("servlet ->Service()");
	}
	
	public void destroy() {
		System.out.println("servlet ->destroy()");
	}
	
	
	
}	
	

