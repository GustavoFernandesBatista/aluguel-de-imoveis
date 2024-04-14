package br.com.imoveisservlet.dao;

import br.com.imoveisservlet.model.CadastroImovel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroImovelDao {

    public void createImovel(CadastroImovel imovel) {

        String SQL = "INSERT INTO IMOVEL (NOME, AUTOR) VALUES (?, ?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, imovel.getImovel());
            preparedStatement.setString(2, imovel.getProprietario());

            preparedStatement.execute();

            System.out.println("success in insert imovel");

            connection.close();

        } catch (Exception e) {

            System.out.print("Erro no processamento" + e.getMessage());

        }
    }

    public List<CadastroImovel> ListadeImoveis() {
        String SQL = "SELECT * FROM  IMOVEIS";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<CadastroImovel> imovel = new ArrayList<>();

            while (resultSet.next()) {
                String nomeImovel = resultSet.getString("NOME");


                String nomeProprietario = resultSet.getString("AUTOR");

                CadastroImovel i = new CadastroImovel(nomeImovel, nomeProprietario);

                imovel.add(i);


            }

            System.out.println("Busca com sucesso");

            connection.close();

            return imovel;

        } catch (SQLException e) {
            System.out.println("Erro no processamento " + e.getMessage());

            return Collections.emptyList();

        }

    }
}