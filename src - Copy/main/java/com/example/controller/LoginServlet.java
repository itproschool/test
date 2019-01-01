package com.example.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.example.util.ConfigManager;
import com.example.util.PropertiesConfig; 


public class LoginServlet extends HttpServlet {

  
	// doget, dopost, init, service
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("customer passed userid : "+req.getParameter("uid"));
			System.out.println("customer passed password : "+req.getParameter("pwd"));
			String userid=req.getParameter("uid"); // john
			String password=req.getParameter("pwd"); // john
			
			if(userid.equals("java" ) && password.equals("jee"))
			{
				req.getSession().setAttribute("isLoggedin", true);
				res.sendRedirect("welcome.jsp");
			}
			else
			{
				res.setContentType("text/html");
				req.getSession().setAttribute("isLoggedin", false);
				//res.sendRedirect("error.html");
				req.getRequestDispatcher("error.jsp").forward(req, res);
			}
		//	ConfigManager cm=new ConfigManager();
		//	System.out.println(cm.getPropConf().getIp());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/* read json request
		Gson gson = new Gson();		 
        try {
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = req.getReader().readLine()) != null) {
                sb.append(s);
            }
            Credential login= (Credential) gson.fromJson(sb.toString(), Credential.class);
        */
		/* send json response
		 	status is DTO with getter setter methods.
		 	response.getOutputStream().print(gson.toJson(status));
            response.getOutputStream().flush();
		 */
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		doGet(req,res);
	}
}
