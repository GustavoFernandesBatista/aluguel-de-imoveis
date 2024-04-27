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
public class ListaImovelServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<CadastroImovel> cadastro = new CadastroImovelDao().ListadeImoveis();

        req.setAttribute("cadastroImov", cadastro);

        req.getRequestDispatcher("dashCadastroImovel.jsp").forward(req, resp);

    }

}
