<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cadastro Imovel</title>
    <link rel="stylesheet" href="./Styles/Cadastro_Imovel/cadastroImovel.css">
    <link rel="stylesheet" href="./Styles/footer.css">
</head>
<body>

<header>
    <a href="/home"><img src="./Imagens/exit.png"></a>
</header>


<div class="containerCadastroImovel">


    <div class="formCadastroImovel">

        <h2>Criar Cadastro</h2>


        <form action="/cadastroImovel" method="post">

            <label>Titulo Imovel</label>
            <input type="text" name="titulo-imovel" id="titulo-imovel" value="${param.name}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">

            <br>

            <label>Endereco</label>
            <input type="text" name="endereco" id="endereco" value="${param.endereco}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">
            <br>

            <label id="quartos">Numero de Quartos</label>
            <input type="text" name="numero-quartos" id="numero-quartos" value="${param.numquartos}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">

            <br>


            <label id="banheiros">Numero de Banheiros</label>
            <input type="text" name="numero-banheiros" id="numero-banheiros" value="${param.numbanheiro}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">
            <br>


            <label id="vagas">Numero de Vagas</label>
            <input type="text" name="numero-vagas" id="numero-vagas" value="${param.numvagas}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">

            <br>

            <label id="valor-por-noite">Valor por noite</label>
            <input type="number" name="valor" id="valor" value="${param.valornoite}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">
            <br>

            <label>Imagens</label>
            <input type="text" name="imagens" id="imagens" value="${param.img}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">
            <br>

            <label>Observacoes</label>
            <input type="text" name="obs" id="obs" value="${param.obs}">
            <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">

            <button type="submit">Register</button>

            <footer class="footer">
                <img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=806419&height=130&section=header&fontColor=fff&animation=twinkling&fontAlignY=35"/>
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
                <img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=806419&height=120&section=footer"/>
            </footer>
        </form>
    </div>
</div>

</body>
</html>
