<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./Styles/footer.css">
    <style>
        .navbar-nav {
            margin-left: auto;
        }
        .special-link {
            color: red;
            font-weight: bold;
        }
        .navbar-brand img {
            max-height: 40px; /* Ajuste a altura máxima da imagem */
            margin-right: 10px; /* Adiciona um espaço à direita da imagem */
        }
    </style>
    <meta charset="UTF-8">
    <title>Cadastro</title>
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

    <h1>Grandes Oportunidades</h1>
    <div class="row justify-content-center"> <!-- Adicionando classe para centralizar horizontalmente -->
        <c:forEach var="imovel" items="${imoveis}" varStatus="loop">
            <div class="col-md-3 mb-4"> <!-- Dividindo a largura da tela em 4 partes para cada coluna e adicionando margem inferior -->
                <div class="card" style="width: 15rem;"> <!-- Removendo a classe mb-4 para centralizar verticalmente -->
                    <img src="./Imagens/praiaArraial.jpg" class="card-img-top" alt="...">
                    <div class="card-body text-center"> <!-- Adicionando classe text-center para centralizar o texto -->
                        <h5 class="card-title">${imovel.tituloImovel}</h5>
                        <p class="card-text">R$ ${imovel.valorNoite}</p>
                        <a href="#" class="btn btn-primary">Ver mais...</a>
                    </div>
                </div>
            </div>
            <!-- Verifica se é a última coluna da linha ou o último item -->
            <c:if test="${loop.index % 4 == 3 || loop.last}">
                </div> <!-- Fecha a linha -->
                <div class="row justify-content-center"> <!-- Abre uma nova linha centralizada -->
            </c:if>
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

    <script src="webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
