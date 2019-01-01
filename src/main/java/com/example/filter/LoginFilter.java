package com.example.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {
	 @Override
	    public void doFilter(
	      ServletRequest request, 
	      ServletResponse response, 
	      FilterChain chain) throws IOException, ServletException {
		 		HttpServletRequest req = (HttpServletRequest) request;
		 		HttpServletResponse res = (HttpServletResponse) response;
		 		System.out.println(" entering the Login filter");
		 			chain.doFilter(request, response); // control is passed to servlet from filter
		 		System.out.println(" exiting the Login filter");
	    }
}
