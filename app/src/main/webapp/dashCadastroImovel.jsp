<!DOCTYPE html>
<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./Styles/Dashboard/dashboard.css">
        <link rel="stylesheet" href="./Styles/footer.css">
    <meta charset="UTF-8">
    <title>Dashboard</title>

</head>
<body>

<div>
    <h1>Imoveis</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Nome do Imovel</th>
            <th>Endereco</th>
            <th>Numero de Quartos</th>
            <th>Numero de Banheiros</th>
            <th>Numero de Vagas</th>
            <th>Valor por Noite</th>
            <th>Imagens</th>
            <th>Email</th>
            <th>Telefone</th>
            <th>Observacoes</th>

            <th>Acoes</th>
        </tr>
        <c:forEach var="cadastro" items="${cadastroImov}">
            <tr>
                <td>${cadastro.idCadastroImovel}</td>
                <td >${cadastro.tituloImovel}</td>
                <td>${cadastro.endereco}</td>
                <td>${cadastro.numQuartos}</td>
                <td>${cadastro.numBanheiro}</td>
                <td>${cadastro.numVagas}</td>
                <td>${cadastro.valorNoite}</td>
                <td>${cadastro.imagens}</td>
                <td>${cadastro.email}</td>
                <td>${cadastro.telefone}</td>
                <td>${cadastro.obs}</td>
                <td>
                    <form action="/delete-cadastroImovel" method="post">
                        <input type="hidden" id="id" name="id" value="${cadastro.idCadastroImovel}">
                        <button type="submit" class="btn btn-primary">Delete</button>
                        <a class="btn btn-secondary" href="cadastroImovel.jsp?idCadastroImovel=${cadastro.idCadastroImovel}&name=${cadastro.tituloImovel}&endereco=${cadastro.endereco}&numquartos=${cadastro.numQuartos}&numbanheiro=${cadastro.numBanheiro}&numvagas=${cadastro.numVagas}&valornoite=${cadastro.valorNoite}&Email=${cadastro.email}&telefone=${cadastro.telefone}&obs=${cadastro.obs}">Update</a>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>