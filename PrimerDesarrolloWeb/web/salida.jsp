<%-- 
    Document   : salida
    Created on : 08-jun-2017, 10:48:23
    Author     : etovar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salida de datos</title>
    </head>
    <body>
        <h1>Gracias por realizar nuestra encuesta</h1>
        <p>
            <!--al exprecion <..% sin los punto sirve para abrir los serverlet-->
            <%= request.getParameter("nombreCompleto")%>, <!--el "request.getParamerter()" es un serverlet que me permite traer los datos de otra pagina-->
            Nos ha indicado que esta familiarizado con los siguiente leguajes 
            de programacion:</p>
        <ul> <!--Se crea una lista-->
            
            <!--scriptles que permite utilizar codigo java
            para este caso se creara un arreglo de tipo cadena
            y este si este arreglo es diferente de null, sera recorrido
            de uno en uno hasta finalizar el tamaño del arreglo
            el resultado de dicho recorrido sera mostrado en una lista de html <li>
            hasta que llegue al ultimo dato del arreglo-->
            <%
                String [] lenguaje= request.getParameterValues("proLeng"); 
                if(lenguaje !=null){
                    for(int i=0; i<lenguaje.length; i++)
                    {                   
                
            %><!--Se interrunpe el scriptles para incluir un parametro estatico de html-->
            <li> <!--Muestre los leguace del arreglo en una lista -->
                <%= lenguaje[i]%>
            </li>
           <!--Se abre nuevamente el scriptles para cerrar el condicional if y 
           ciclo for-->
            <%}
                }
            %>               
        </ul>
        
    </body>
</html>
