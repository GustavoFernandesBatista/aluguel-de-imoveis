

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="./Styles/Cadastro_Imovel/cadastroImovel.css">
    <link rel="stylesheet" href="./Styles/footer.css">
        <title>ADIMO - Ficha Cadastral</title>
    </head>
    <body>
        <div class="container">

            <h2>Ficha Cadastral</h2>

            <form action = "cadastroImovel" method = "post" enctype = "multipart/form-data">

                <label>Titulo Imovel</label>
                <input type="text" name="titulo-imovel" id="titulo-imovel" value="${param.name}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">



                <label>Endereco</label>
                <input type="text" name="endereco" id="endereco" value="${param.endereco}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">



               <label id="quartos">Numero de Quartos</label>
                <input type="text" name="numero-quartos" id="numero-quartos" value="${param.numquartos}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">



                <label id="banheiros">Numero de Banheiros</label>
                <input type="text" name="numero-banheiros" id="numero-banheiros" value="${param.numbanheiro}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">


                <label id="vagas">Numero de Vagas</label>
                <input type="text" name="numero-vagas" id="numero-vagas" value="${param.numvagas}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">



                <label id="valor-por-noite">Valor por noite</label>
                <input type="number" name="valor" id="valor" value="${param.valornoite}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">



                <label>Imagem</label>
                <input type="file" name="imagens" id="imagens" value="${param.img}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">


                <label>Observacoes</label>
                <input type="text" name="obs" id="obs" value="${param.obs}">
                <input type="hidden" id="idCadastroImovel" name="idCadastroImovel" value="${param.idCadastroImovel}">

                <button type="submit">Register</button>
            </form>

        </div>

        <script src="./script/fichaCadastral.js"></script>
    </body>
</html>
