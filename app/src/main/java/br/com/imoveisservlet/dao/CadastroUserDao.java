package br.com.imoveisservlet.dao;

import br.com.imoveisservlet.model.CadastroUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class CadastroUserDao {
    public void createCadastroUser(CadastroUser cadastroUser){


        String SQL = "INSERT INTO CADASTRO (NOME_COMPLETO, EMAIL, CPF, TELEFONE, SENHA, REPETE_SENHA) VALUES (?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cadastroUser.getNomeCompleto());
            preparedStatement.setString(2, cadastroUser.getEmail());
            preparedStatement.setString(3, cadastroUser.getCpf());
            preparedStatement.setString(4, cadastroUser.getTelefone());
            preparedStatement.setString(5, cadastroUser.getSenha());
            preparedStatement.setString(6, cadastroUser.getRepeteSenha());

            preparedStatement.execute();

            System.out.println("Succeso ao se cadastrar");

            connection.close();

        } catch (Exception e){
            System.out.println("Erro no processamento" + e.getMessage());
        }
    }
/*
        public List<CadastroUser> findAllCadastro(){
            String SQL = "SELECT * FROM CADASTROUSER";

            try{
                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

                System.out.println("success in database connection");

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);

                ResultSet resultSet = preparedStatement.executeQuery();

                List<CadastroUser> cadastros = new ArrayList<>();

                while(resultSet.next()){
                    String cadastroNome = resultSet.getNString("nomeCompleto");
                    String CPf = resultSet.getNString("CPF");
                    String telefone = resultSet.getNString("Telefone");
                    String email = resultSet.getNString("Email");
                    String senha = resultSet.getNString("Senha");
                    String repetirsenha = resultSet.getNString("RepetirSenha");

                    CadastroUser cadastro = new CadastroUser(cadastroNome, CPf, telefone, email,senha,repetirsenha);

                    cadastros.add(cadastro);

                }

                System.out.println("Sucesso ao selecionar * carro");
                connection.close();

                return cadastros;
                
            } catch (SQLException e) {
                System.out.println("Falha na conexão do banco de dados");
                return Collections.emptyList();
            }
        }
/*
    public void deleteCadastroById(String cadastroId){
        String SQL = "DELETE CADASTRO WHERE ID = ?";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastroId);

            preparedStatement.execute();

            System.out.println("Succso ao remover cadastro");

            connection.close();


        }catch  (SQLException e) {
            System.out.println("Falha na conexão do banco de dados");
        } {

        }
    }
*/
}

