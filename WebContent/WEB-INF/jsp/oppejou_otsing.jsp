<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Tudengivaade</title>
        <link rel="stylesheet" href="styles/bootstrap.min.css">
        <link rel="stylesheet" href="styles/tudeng_stiil.css">
	  	<script src="scripts/jquery.min.js"></script>
	  	<script src="scripts/bootstrap.min.js"></script>
        <script type="text/javascript">
        function doAjaxPost() {
        // get the form values
        var eesnimi = $('#eesnimi').val();
        var perenimi = $('#perenimi').val();
        var instituut = $('#instituut').val();
        $.ajax({
        type: "POST",
        url: "/Tudengivaade/oppejou_otsing.jsp",
        data: "eesnimi=" + eesnimi + "&perenimi=" + perenimi + "&instituut=" + instituut,
        success: function(response){
        // we have the response
        $("#oppejou_tulemused").html(
        	response
        );
        $("#oppejou_tulemused").show();
        //$('#name').val('');
        //$('#education').val('');
        },
        error: function(e){
        alert('Error: ' + e);
        }
        });
        }
        </script>
    </head>
    <body>
        
        <div class="container">
        
        <h1>Õppejõu otsimine</h1>
        <div class="form-group">
        <table>
            <tr><td class="otsing_label"><label class="control-label col-sm-2" for="aktiivsus">Eesnimi:</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" id="eesnimi"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
        <table>
            <tr><td class="otsing_label"><label class="control-label col-sm-2" for="aktiivsus">Perenimi:</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" id="perenimi"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
        <table>
            <tr><td class="otsing_label"><label class="control-label col-sm-2" for="aktiivsus">Instituut:</label></td>
            <td><div class="col-sm-4 input-group"><input type="text" id="instituut"></div></td></tr>
        </table>
        </div>
        <div class="form-group">
 
            
            <input type="button" class="col-sm-4 btn btn-primary btn-default" value="Otsi" onclick="doAjaxPost()">
        
        </div>
        </div>
        <div id="oppejou_tulemused"></div>

  
  </body>
</html>