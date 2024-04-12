package br.com.imoveisservlet.servelet;
import br.com.imoveisservlet.dao.ImovelDao;
import br.com.imoveisservlet.model.Imovel;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/cadastro")

public class CreateCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("cadastro.html");


    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String nomeCompleto = req.getParameter("nomeCompleto-cadastro");
        String email = req.getParameter("email-cadastro");
        String cpf = req.getParameter("cpf-cadastro");
        String telefone = req.getParameter("telefone-cadastro");
        String senha = req.getParameter("senha-cadastro");
        String repetirSenha = req.getParameter("repetirSenha-cadastro");




        System.out.println(nomeCompleto);
        System.out.println(email);
        System.out.println(cpf);
        System.out.println(telefone);
        System.out.println(senha);
        System.out.println(repetirSenha);



        req.getRequestDispatcher("cadastro.html").forward(req,resp);

    }

}
