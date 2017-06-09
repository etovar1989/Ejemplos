<%-- 
    Document   : index
    Created on : 08-jun-2017, 10:16:02
    Author     : etovar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta de desarrolladores</title>
    </head>
    <body>
        <h1>Bienbenido a la encuesta de desarrolladores</h1>
        <p>Indica el leguaje de programacion con el que estas familiarizado</p>
        
        <!--Se cambian el metodo action="salida.jsp por el metodo tipo MVC que 
        seria utilizar el Controlador y el Modelo ServerltController"-->
        <!--el action me permite reenviar los datos del formulario a otra pagina web-->
        <form action="ServerltController" method="post"> <!--Se utiliza method="post" por seguridad
            debido a que este adiferencia del get, no muestra los parametros en la navegacion-->
            <table border="0">
               <!-- <thead> <!--encabezado de la tabla>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead> -->
                
                
                <tbody><!--Cuerpo de la tabla-->
                    <tr>
                        <td>Nombre Completo</td>
                        <td><input type="text" name="nombreCompleto" value=""/> </td>
                    </tr>
                    <tr>
                        <td>Java</td>
                        <td><input type="checkbox" name="proLeng" value="java" /></td> <!--CaheckBox-->
                    </tr>
                    <tr>
                        <td>PHP</td>
                        <td><input type="checkbox" name="proLeng" value="PHP" /></td>
                    </tr>
                    <tr>
                        <td>C#</td>
                        <td><input type="checkbox" name="proLeng" value="C#" /></td>
                    </tr>
                    <tr>
                        <td>Python</td>
                        <td><input type="checkbox" name="proLeng" value="Python" /></td>
                    </tr>
                    <tr>
                        <td>Cobol</td>
                        <td><input type="checkbox" name="proLeng" value="Cobol" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="btnenvio" value="Enviar" /></td> <!--el type="submit" es para el envio de lo que hay en el formulario-->
                    </tr>
                </tbody>
            </table>

        </form>
        
    </body>
</html>
