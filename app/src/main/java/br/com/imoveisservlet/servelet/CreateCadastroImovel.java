package br.com.imoveisservlet.servelet;
import br.com.imoveisservlet.dao.CadastroImovelDao;
import br.com.imoveisservlet.model.CadastroImovel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-imovel")

public class CreateCadastroImovel extends HttpServlet {
    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



            String imovel = req.getParameter("imovel-name");
            String proprietario = req.getParameter("proprietario-name");

        CadastroImovel i = new CadastroImovel(imovel,proprietario);


            System.out.println(proprietario);

            System.out.println(imovel);

        CadastroImovelDao imoveldao = new CadastroImovelDao();



            req.getRequestDispatcher("index.html").forward(req,resp);


        }
    }

