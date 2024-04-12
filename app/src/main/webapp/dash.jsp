<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
  <div>
    <h1>Cars</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>NOME</th>
            <th>AUTOR</th>
        </tr>
        c:forEach var="nomeImovel","nomeAutor" items="${imoveis}"
        <tr>
            <td></td>
            <td></td>
        </tr>
    </table>
  </div>
</body>
</html>