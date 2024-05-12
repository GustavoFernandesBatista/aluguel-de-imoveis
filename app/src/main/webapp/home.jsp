<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./Styles/Home/home.css">
    <style>


        .navbar{
         background-image: url('./Imagens/praia.jpg');

             background-size: cover;
             background-position: top;
             height: 90vh;
             display: block;
             justify-content: center;
             align-items: center;
             position: relative;

        }


    </style>
    <meta charset="UTF-8">
    <title>Cadastro</title>
</head>
<body>
<header>
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
</header>
    </nav>


    <h1>Grandes Oportunidades</h1>
    <div class="row justify-content-center">

      <c:forEach var="imovel" items="${imoveis}" varStatus="loop">
          <div class="col-md-3 mb-4">
              <div class="card" style="width: 15rem;">
                  <div class="card-body text-center">
                      <img src="${imovel.imagens}" class="card-img-top" alt="...">
                      <h5 class="card-title">${imovel.tituloImovel}</h5>
                      <p class="card-text">R$ ${imovel.valorNoite}</p>
                      <a href="/infoImovel?id=${imovel.idCadastroImovel}" class="btn btn-primary">Ver mais...</a>
                  </div>
              </div>
          </div>
          <c:if test="${loop.index % 4 == 3 || loop.last}">
              <div class="row justify-content-center"> <!-- Abre uma nova linha centralizada -->
          </c:if>
      </c:forEach>

    </div>



   <footer class="footer">

     <div class="container p-4">

       <div class="row">

         <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
           <h5 class="text-uppercase"><strong>Contatos</strong></h5>

           <p>
             <ul>
             <li>Istagram</li>

             <li>Facebook</li>

             <li>X</li>

             <li>realstateAdm@real.com</li>
             </ul>
           </p>
         </div>



         <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
           <h5 class="text-uppercase"><strong>Sobre Nosso Site</strong></h5>

           <p>
             Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis
             molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae aliquam
             voluptatem veniam, est atque cumque eum delectus sint!
           </p>
         </div>

       </div>

     </div>


     <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.05);">
        2024 Copyright: Real State
       <a class="text-body" href="/home">Real.State</a>
     </div>

   </footer>

    <script src="webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
