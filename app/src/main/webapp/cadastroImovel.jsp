<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./Styles/Cadastro_Imovel/cadastroImovel.css">
    <title>ADIMO - Ficha Cadastral</title>
</head>
<body>
<div class="container">
    <h2>Ficha Cadastral</h2>

    <form action="cadastroImovel" method="post" enctype="multipart/form-data">

        <label>Titulo Imovel</label>
        <input type="text" name="titulo-imovel" id="titulo-imovel">

        <label>Endereco</label>
        <input type="text" name="endereco" id="endereco">

        <label id="quartos">Numero de Quartos</label>
        <input type="text" name="numero-quartos" id="numero-quartos">

        <label id="banheiros">Numero de Banheiros</label>
        <input type="text" name="numero-banheiros" id="numero-banheiros">

        <label id="vagas">Numero de Vagas</label>
        <input type="text" name="numero-vagas" id="numero-vagas">

        <label id="valor-por-noite">Valor por noite</label>
        <input type="number" name="valor" id="valor">

        <label>Observacoes</label>
        <input type="text" name="obs" id="obs">

        <label>Email para contato</label>
        <input type="text" name="email-contato" id="email-contato">

        <label>Telefone para contato</label>
        <input type="text" name="telefone-contato" id="telefone-contato">

        <label>Imagem</label>
        <input type="file" name="imagens" id="imagens">

        <button type="submit">Register</button>
    </form>
</div>

<script>
    document.getElementById("imagens").addEventListener("change", function() {
        var nomeImagem = document.getElementById("imagens").files[0].name;
        document.getElementById("nome-imagem").value = nomeImagem;
    });
</script>
</body>
</html>
