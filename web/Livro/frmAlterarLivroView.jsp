<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar Livro</h1>
        <form action="editarLivroAction.jsp" method="POST">
            <label>Código do Livro</label><br/>
            <input type="text" name="id" value="<%=request.getParameter("id")%>" />
            <br/>
            
            <label>Nome</label><br/>
            <input type="text" name="nome" value="<%=request.getParameter("nome")%>" />
            <br/>
            
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>
