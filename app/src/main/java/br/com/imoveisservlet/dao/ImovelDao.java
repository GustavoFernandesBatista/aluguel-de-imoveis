package br.com.imoveisservlet.dao;

import br.com.imoveisservlet.model.Imovel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImovelDao {

    public void createImovel(Imovel imovel) {
        String SQL = "INSERT INTO IMOVEL (NAME, PROPRIETARIO) VALUES (?)";

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

            System.out.println("fail in database connection");

        }

    }
}