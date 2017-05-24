/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webtest.entity.Chambre;
import webtest.entity.Hotel;
import webtest.service.ChambreService;
import webtest.service.HotelService;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "AjouterChambreServelet", urlPatterns = {"/ajouter_chambre"})
public class AjouterChambreServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HotelService service=new HotelService();
        List<Hotel> hotels=service.lister();
        req.setAttribute("hotels", hotels);
        req.getRequestDispatcher("ajouter_chambre.jsp").forward(req, resp);
    }

    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Chambre c = new Chambre();
        c.setNom(req.getParameter("nom"));
        c.setDisponibilte(Boolean.valueOf(req.getParameter("disponibilite")));
        req.setAttribute("chambre", c);
        long hotelId = Long.valueOf(req.getParameter("idHotel"));
        new ChambreService().ajouter(c, hotelId);
        resp.sendRedirect("lister_chambres");
    }
    

}
