<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
  <div>
    <h1>Imoveis</h1>
    <table>
        <tr>
            <th> Id </th>

            <th>Nome do Imovel</th>

            <th>Endereco</th>

            <th>Numero de Quartos</th>

            <th>Numero de Banheiros</th>

            <th>Numero de Vagas</th>

            <th>Valor por Noite</th>

            <th>Imagens</th>

            <th>Observacoes</th>

            <th>Actions</th>

        </tr>
        <c:forEach var="cadastro" items="${cadastroImov}">
            <tr>
                <td>${cadastro.idCadastroImovel}</td>
                <td>${cadastro.tituloImovel}</td>
                <td>${cadastro.endereco}</td>
                <td>${cadastro.numQuartos}</td>
                <td>${cadastro.numBanheiro}</td>
                <td>${cadastro.numVagas}</td>
                <td>${cadastro.valorNoite}</td>
                <td>${cadastro.imagens}</td>
                <td>${cadastro.obs}</td>
                <td>
                 <form action="/delete-cadastroImovel" method="post">
                                    <input type="hidden" id="id" name="id" value="${cadastro.idCadastroImovel}">
                                    <button type="submit">Delete</button>
                 </form>
                </td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>