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
import webtest.entity.Hotel;
import webtest.service.HotelService;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "ListerHotelsServlet", urlPatterns = {"/lister_hotels"})
public class ListerHotelsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //recuperer la liste des hotels à partir du service

        String titre = "Liste des hotels";

        List<Hotel> hotels = new HotelService().lister();
        req.setAttribute("listeHotels", hotels);

        //Renvoie vers vue lister_hotel.jsp
        req.getRequestDispatcher("lister_hotels.jsp").forward(req, resp);

    }

}
