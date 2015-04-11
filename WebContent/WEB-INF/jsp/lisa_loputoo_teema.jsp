<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lisa lõputöö teema</title>
        <link rel="stylesheet" href="styles/bootstrap.min.css">
        <link rel="stylesheet" href="styles/tudeng_stiil.css">
	  	<script src="scripts/jquery.min.js"></script>
	  	<script src="scripts/bootstrap.min.js"></script>

    </head>
    <body>
        
        <div class="container">
        
        <h1>Uue lõputöö teema lisamine</h1>
        <form action="loputoo_teemade_nimekiri.jsp" method="post">
        <div class="form-group">
        <table>
            <tr><td class="teema_lisamise_label"><label class="control-label col-sm-2" for="aktiivsus">Nimi (eesti keeles):</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" name="nimetus_est"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
        <table>
            <tr><td class="teema_lisamise_label"><label class="control-label col-sm-2" for="aktiivsus">Nimi (inglise keeles):</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" name="nimetus_eng"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
        <table>
            <tr><td class="teema_lisamise_label"><label class="control-label col-sm-2" for="aktiivsus">Midagi veel:</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" name="midagi_veel"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
        <table>
            <tr><td class="teema_lisamise_label"><label class="control-label col-sm-2" for="aktiivsus">Tudengi eesnimi:</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" name="tudeng_eesnimi"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
        <table>
            <tr><td class="teema_lisamise_label"><label class="control-label col-sm-2" for="aktiivsus">Tudengi perenimi:</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" name="tudeng_perenimi"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
 
            
            <input type="submit" class="col-sm-4 btn btn-primary btn-default" value="Salvesta">
        
        </div>
        </form>
        </div>
        <div id="oppejou_tulemused"></div>

  
  </body>
</html>