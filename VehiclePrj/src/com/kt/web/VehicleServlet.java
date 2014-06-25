package com.kt.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kt.home.VehicleController;

/**
 * Servlet implementation class VehicleServlet
 */
@WebServlet("/vehicle.do")
public class VehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public VehicleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		int cost=0;
		if(action.equals("A")) {
			cost = new VehicleController().printAirplaneCost();
		}else if(action.equals("T")) {
			cost = new VehicleController().printTruckCost();			
		}else if(action.equals("S")) {
			cost = new VehicleController().printShipCost();
		}else {
			out.println("�߸��� ����Դϴ�.");
		}
		out.println("�����.... " + cost);
		//������ ��������  run -> Run As -> Run On Server
		//������ �ּҵڿ� ?action=A
	}

}
