package br.com.imoveisservlet.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import  br.com.imoveisservlet.servelet.ListImovelServelet;
import br.com.imoveisservlet.dao.ImovelDao;
import br.com.imoveisservlet.model.Imovel;

@WebServlet("/painel-imovel")
public class ListImovelServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{


        super.doGet(req, res);

        List<Imovel> imoveis = new ImovelDao().ListadeImoveis();

        req.setAttribute("imoveis" , imoveis);

        req.getRequestDispatcher("dashboard.jsp").forward(req, res);

        req.getRequestDispatcher("index.html").forward(req, res);

        res.sendRedirect("/painel-imovel");



    }

}
