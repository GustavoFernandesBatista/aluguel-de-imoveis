package br.com.imoveisservlet.servelet;
import br.com.imoveisservlet.dao.CadastroImovelDao;
import br.com.imoveisservlet.model.CadastroImovel;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload.isMultipartContent;


@WebServlet("/cadastroImovel")

public class CreateCadastroImovel extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {




        Map<String, String> parameters = uploadImage(req);



        String idCadastroImovel = req.getParameter("idCadastroImovel");
        String titulo_imovel = req.getParameter("titulo-imovel");
        String endereco = req.getParameter("endereco");
        String num_quartos = req.getParameter("numero-quartos");
        String num_banheiro = req.getParameter("numero-banheiros");
        String num_vagas = req.getParameter("numero-vagas");
        String valor_noite = req.getParameter("valor");
        String imagens = parameters.get("imagens");

        String obs = req.getParameter("obs");

        CadastroImovelDao cadastroImovelDao = new CadastroImovelDao();
        CadastroImovel cadastroImovel = new CadastroImovel(idCadastroImovel, titulo_imovel, endereco, num_quartos, num_banheiro, num_vagas, valor_noite, imagens, obs);


        if (idCadastroImovel != null && !idCadastroImovel.isBlank()) {
            cadastroImovelDao.updateCadastroImovel(cadastroImovel);
        } else {

            cadastroImovelDao.createImovel(cadastroImovel);
        }


        resp.sendRedirect("/home");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("cadastroImovel.jsp").forward(req, resp);

    }

    private Map<String,String> uploadImage(HttpServletRequest request){

        HashMap<String, String> parameters = new HashMap<>();

        if (isMultipartContent(request)){


            try{
                DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                List<FileItem> fileItemList = new ServletFileUpload(diskFileItemFactory).parseRequest(request);

                for (FileItem fileI : fileItemList){
                    checkFieldType(fileI, parameters);
                }


            } catch (Exception e){
                parameters.put("image","Imagens/logo.png");

            }
            return parameters;

        }

        return parameters;
    }
    private void checkFieldType(FileItem files, Map requestParameter)throws Exception{
        if (files.isFormField()){
            requestParameter.put(files.getFieldName(), files.getString());
        }else {
            String fileName =   processUploadedFile(files);
            requestParameter.put("image", fileName);

        }

    }

    private String processUploadedFile(FileItem files)throws Exception {
        Long time =  new Date().getTime();
        String fileName = time.toString().concat("-").concat(files.getName().replace(" ", ""));
        String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
        files.write(new File(filePath));
        return fileName;

    }





}