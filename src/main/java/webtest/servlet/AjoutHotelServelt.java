/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webtest.entity.Hotel;
import webtest.service.HotelService;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjoutHotelServelt", urlPatterns = {"/ajouter_hotel"})
public class AjoutHotelServelt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("ajouter_hotel.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Hotel h=new Hotel();
        h.setNom(req.getParameter("nom"));
        h.setAdresse(req.getParameter("adresse"));
        h.setCodePosta(Long.valueOf(req.getParameter("zip")));
        req.setAttribute("hotel", h);
        HotelService serv=new HotelService();
        serv.ajouter(h);
        resp.sendRedirect("lister_hotels");
    }



}
