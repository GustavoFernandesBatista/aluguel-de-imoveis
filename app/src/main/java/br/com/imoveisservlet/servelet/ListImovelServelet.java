package br.com.imoveisservlet.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import br.com.imoveisservlet.dao.CadastroImovelDao;
import br.com.imoveisservlet.model.CadastroImovel;

@WebServlet("/painel-imovel")
public class ListImovelServelet extends HttpServlet {

   /* protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{


        super.doGet(req, res);

        List<CadastroImovel> imoveis = new CadastroImovelDao()();

        req.setAttribute("imoveis" , imoveis);

        req.getRequestDispatcher("dashboard.jsp").forward(req, res);

        req.getRequestDispatcher("index.html").forward(req, res);

        res.sendRedirect("/painel-imovel");



    */}

