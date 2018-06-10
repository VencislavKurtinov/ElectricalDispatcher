package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fileRead.FileReader;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		Object logged = sesion.getAttribute("logged");
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// PrintWriter pw = response.getWriter();
		// pw.append("Qlkoo");
		// pw.close();
//	javax.servlet.ServletContext application = getServletConfig().getServletContext();
//		
//		synchronized (application) {
//
//			if (application.getAttribute("products") == null) {
//				 rows = (ArrayList<ArrayList<Object>>) FileReader.getList();
//
//				application.setAttribute("rows", rows);
//			}
//		}
		response.setContentType("text/json");
		FileReader f = new FileReader();
		f.read();
		ArrayList<ArrayList<Object>> rows = new ArrayList<ArrayList<Object>>() ;

		 rows = (ArrayList<ArrayList<Object>>) f.getList();
		
	
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(rows));
		
	//	request.getRequestDispatcher("main.html").forward(request, response);
		// return;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
