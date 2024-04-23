package br.com.imoveisservlet.dao;

import br.com.imoveisservlet.model.CadastroImovel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroImovelDao {

    public void createImovel(CadastroImovel imovel) {

        String SQL = "INSERT INTO CADASTRO_IMOVEL(TITULO_IMOVEL, ENDERECO,NUM_QUARTOS, NUM_BANHEIROS, NUM_VAGAS, VALOR_NOITE, IMAGENS, OBS ) VALUES (?,?,?,?,?,?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

           preparedStatement.setString(1 ,imovel.getTituloImovel());
            preparedStatement.setString(2 ,imovel.getEndereco());
            preparedStatement.setString(3 ,imovel.getNumQuartos());
            preparedStatement.setString(4,imovel.getNumBanheiro());
            preparedStatement.setString(5 ,imovel.getNumVagas());
            preparedStatement.setString(6 ,imovel.getValorNoite());

            preparedStatement.setString(7 ,imovel.getImagens());
            preparedStatement.setString(8,imovel.getObs());


            preparedStatement.execute();

            System.out.println("success in insert imovel");

            connection.close();

        } catch (Exception e) {

            System.out.print("Erro no processamento" + e.getMessage());

        }
    }

    public List<CadastroImovel> ListadeImoveis() {
        String SQL = "SELECT * FROM  CADASTRO_IMOVEL";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<CadastroImovel> imovel = new ArrayList<>();

            while (resultSet.next()) {
                String idCadastroImovel = resultSet.getNString("ID_CADASTRO_IMOVEL");
                String tituloImovel = resultSet.getNString("TITULO_IMOVEL");
                String endereco = resultSet.getNString("ENDERECO");
                String numQuartos = resultSet.getNString("NUM_QUARTOS");
                String numBanheiros = resultSet.getNString("NUM_BANHEIROS");
                String numVagas = resultSet.getNString("NUM_VAGAS");
                String valorNoite = resultSet.getNString("VALOR_NOITE");
                String imagem = resultSet.getNString("IMAGENS");
                String obs = resultSet.getNString("OBS");

                CadastroImovel i = new CadastroImovel(idCadastroImovel,tituloImovel, endereco, numQuartos, numBanheiros, numVagas, valorNoite, imagem, obs);

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

        public void deleteCadastroImovelById(String CadastroImovelId ){
            String SQL = "DELETE FROM CADASTRO_IMOVEL WHERE ID_CADASTRO_IMOVEL + ?";

            try {
                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

                System.out.println("success in database connection");

                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setString(1, CadastroImovelId);
                preparedStatement.execute();

                System.out.println("SUCESSO EM DELETAR CADASTRO IMOVEL COM ID " + CadastroImovelId);

                connection.close();


            }catch (Exception e){
                System.out.println("ERRO AO CONECTAR AO BANCO DE DADOS");
            }
        }


    }


