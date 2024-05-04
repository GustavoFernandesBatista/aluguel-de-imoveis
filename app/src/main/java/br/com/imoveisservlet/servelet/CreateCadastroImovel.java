package br.com.imoveisservlet.servelet;
import br.com.imoveisservlet.dao.CadastroImovelDao;
import br.com.imoveisservlet.model.CadastroImovel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastroImovel")

public class CreateCadastroImovel extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idCadastroImovel = req.getParameter("idCadastroImovel");
        String titulo_imovel= req.getParameter("titulo-imovel");
        String endereco = req.getParameter("endereco");
        String num_quartos = (req.getParameter("numero-quartos"));
        String num_banheiro = ((req.getParameter("numero-banheiros")));
        String num_vagas = (req.getParameter("numero-vagas"));
        String valor_noite = (req.getParameter("valor"));
        String imagens = req.getParameter("imagens");
        String obs = req.getParameter("obs");

        CadastroImovelDao cadastroImovelDao = new CadastroImovelDao();
        CadastroImovel cadastroImovel = new CadastroImovel(idCadastroImovel,titulo_imovel, endereco,num_quartos,num_banheiro,num_vagas,valor_noite,imagens,obs);

        cadastroImovelDao.createImovel(cadastroImovel);


        if (idCadastroImovel != null && !idCadastroImovel.isBlank()){
            cadastroImovelDao.createImovel(cadastroImovel);
        }else{
            cadastroImovelDao.updateCadastroImovel(cadastroImovel);
        }

        resp.sendRedirect("/painel-imovel");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("cadastroImovel.jsp").forward(req, resp);

    }



}