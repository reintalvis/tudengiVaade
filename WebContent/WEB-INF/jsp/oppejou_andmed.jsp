<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">


<h1>Õppejõu andmed</h1>
<div id="oppejou_andmed">
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Eesnimi:</label></td>
			<td>
					${opetaja.getEesnimi()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Perenimi:</label></td>
			<td>
					${opetaja.getPerenimi()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Ametikoht:</label></td>
			<td>
					${opetaja.getAmetikoht()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Instituut:</label></td>
			<td>
					${opetaja.getInstituut()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Aadress:</label></td>
			<td>
					${opetaja.getAadress()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Ruum:</label></td>
			<td>
					${opetaja.getRuum()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Telefon:</label></td>
			<td>
					${opetaja.getTelefon()}
				</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Email:</label></td>
			<td>
					${opetaja.getEmail()}
				</td>
		</tr>
	</table>
</div>
</div>
<div id="oppejou_valikud" style="position: relative; left: 500px; top: -300px;">
<div class="form-group">


	<input type="button" class="col-sm-4 btn btn-primary btn-default"
		value="Vaata õppejõu teemasid" onclick="vaataOppejouTeemasid(${opetaja.getOppejoud_id()});return false;">

</div></br></br>
<div class="form-group">


	<input type="button" class="col-sm-4 btn btn-primary btn-default"
		value="Paku välja teema" onclick="pakuValjaTeema(${opetaja.getOppejoud_id()});return false;">

</div>
</div>

</div>