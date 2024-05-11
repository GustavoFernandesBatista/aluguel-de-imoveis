<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- added meta viewport tag -->
    <link rel="stylesheet" href="./Styles/infoImovel/infoImovel.css">
    <link rel="stylesheet" href="./Styles/footer.css">
    <title>Informações do Imóvel</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/home"><img src="./Imagens/logo.png"></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sobre nos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/cadastroImovel">Anunciar</a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link special-link" href="/cadastrouser">Cadastro</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link special-link" href="/login">Login</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <h1>Chalé em Maresías</h1>
    <div class = "containerIMG">
        <img src="./Imagens/maresias.jpg">
    </div>
    <div class ="containerTEXT">
        <c:forEach var="imovel" items="${imovel}">
                    <tr>
                        <td >${imovel.tituloImovel}</td>
                        <br>
                        <td>${imovel.endereco}</td>
                        <br>
                        <td>${imovel.numQuartos}</td>
                        <br>
                        <td>${imovel.numBanheiro}</td>
                        <br>
                        <td>${imovel.numVagas}</td>
                        <br>
                        <td>${imovel.valorNoite}</td>
                        <br>
                        <td>${imovel.imagens}</td>
                        <br>
                        <td>${imovel.obs}</td>
                    </tr>
        </c:forEach>
    </div>
        <footer class="footer">
            <div class="container-footer">
                <div class="row">
                    <div class="footer-col">
                        <h4>Alternative menu</h4>
                    </div>
                    <div class="footer-col">
                        <h4>Contact</h4>
                    </div>
                    <div class="footer-col">
                        <h4>Social networks</h4>
                        <div class="social-links"></div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>