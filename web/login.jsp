<%-- 
    Document   : login
    Created on : 18/10/2019, 09:48:20 PM
    Author     : santi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Simple Login Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style type="text/css">
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>

<script type="text/javascript">
    $(document).ready(function() {
      $("#alertaId").hide();

        $( "#btnLogin" ).click(function() {
            var usuarios = $( "#usuarios" ).val();
            var pass = $( "#pass" ).val();

            if (usuarios=='neto@gmail.com' && pass == '123456') {
                window.location="./main.jsp";
            }else{
                $("#alertaId").show();                
                setTimeout(function() {
                    $("#alertaId").fadeOut(1500);
                },3000);
            }


        });

    });
</script>


</head>
<body>
<div class="login-form">
    <form method="post">
        <h2 class="text-center">Iniciar Sesión</h2>       
        <div class="form-group">
            <input id="usuarios" type="text" class="form-control" placeholder="Email">
        </div>
        <div class="form-group">
            <input id="pass" type="password" class="form-control" placeholder="Contraseña">
        </div>
        <div class="form-group">
            <a  id="btnLogin" class="btn btn-primary btn-block">Entrar</a>
        </div>
        <div id="alertaId" class="alert alert-danger" role="alert">
            Email/Contraseña Incorrecto
        </div>
        <div class="clearfix">
            <a href="#" class="pull-right">Recordar Contraseña</a>
        </div>        
    </form>
    <p class="text-center"><a href="#">Crear Cuenta</a></p>
</div>
</body>
</html>    