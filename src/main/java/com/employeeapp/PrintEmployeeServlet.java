package com.employeeapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintEmployeeServlet extends HttpServlet{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
{    
	List<Employee> empList=(List<Employee>) request.getAttribute("details");
	 PrintWriter out=response.getWriter();
	 for(Employee emp:empList)
	 out.println(emp.toString());
}
}
