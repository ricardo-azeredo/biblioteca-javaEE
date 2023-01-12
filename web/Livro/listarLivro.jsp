<%-- 
    Document   : listarLivro
    Created on : 11 de jan. de 2023, 15:37:54
    Author     : Ricardo
--%>
<%@page import="br.com.biblioteca.DAO.LivroDAO"%>
<%@page import="br.com.biblioteca.DTO.LivroDTO"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar Livros</h1>
        <%
           try {
             LivroDAO livroDAO = new LivroDAO();
             ArrayList<LivroDTO>  lista = livroDAO.PesquisarLivro();
             
            for(int i=0; i < lista.size(); i++){
                out.print("Código: " + lista.get(i).getLivroId() + "<br/>");
                out.print("Titulo: " + lista.get(i).getLivro() + "<br/>");
            }
           } catch(Exception e){
            out.print("Não há livros");
           }  
            
         %>   
    </body>
</html>
