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
            <th>ID</th>
            <th>cadastro_imovel</th>

        </tr>
        <c:forEach var="cadastro" items="${cadastroImov}">
            <tr>
                <td></td>
                <td>${cadastro.cadastro_imovel}</td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>