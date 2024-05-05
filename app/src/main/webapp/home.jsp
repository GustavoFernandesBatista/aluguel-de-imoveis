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
    </style>
    <meta charset="UTF-8">
    <title>Cadastro</title>
</head>
<body>




    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Seu Site</a>
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

 <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
   <div class="carousel-inner">
     <div class="carousel-item active">
       <img src="./Imagens/gramado.jpg" class="d-block w-60" alt="...">
     </div>
     <div class="carousel-item">
       <img src="./Imagens/Rj.jpg" class="d-block w-60" alt="...">
     </div>
     <div class="carousel-item">
       <img src="./Imagens/praia.jpg" class="d-block w-60" alt="...">
     </div>
   </div>

   <script>
     const carousel = document.getElementById('carouselExampleSlidesOnly');
     carousel.dataset.bsInterval = "2000";
   </script>
 </div>



    <h1>Grandes Oportunidades</h1>
    <div class="row">
        <c:forEach var="imovel" items="${imoveis}">
            <div class="col-md-6">
                <div class="card" style="width: 18rem;">
                    <img src="./Imagens/praiaArraial.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${imovel.tituloImovel}</h5>
                        <p class="card-text">R$ ${imovel.valorNoite}</p>
                        <a href="#" class="btn btn-primary">Ver mais...</a>
                    </div>
                </div>
            </div>
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
                        <div class="social-links">

                        </div>
                    </div>
                </div>
            </div>
        </footer>
</body>
</html>
