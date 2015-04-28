<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

<h1>Kandideeritud!</h1>

<div id="teema_andmed">

<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Kandideerisid lõputöö teemale:</label></td>
			<td>${teema.getNimetus_est()}</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Lõputöö teema (eng):</label></td>
			<td>${teema.getNimetus_eng()}</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Staatus:</label></td>
			<td>${teema.getStaatus()}</td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Tudengi ees- ja perenimi:</label></td>
			<td>${teema.getTudeng().getEesnimi()} ${teema.getTudeng().getPerenimi()}</td>
		</tr>
	</table>
</div>

<div id="teema_andmed" style="position: relative; left: 500px; top: -300px;">
<div class="form-group">

		<input type="button" class="col-sm-4 btn btn-primary btn-default"
		value="Kandideeri veel" onclick="loputooTeemaOtsing();return false;">

</div>

</div>

</div>

</div>


<div class="container">

<div id="teema_andmed">

<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Vestlus:</label></td>
			<td><div class="col-sm-4 input-group">
				<textarea name=postitus id="postitus" rows=5 cols=110></textarea>
			</div></td>
		</tr>
	</table>
</div>
<div class="form-group">

<input type="submit" class="col-sm-4 btn btn-primary btn-default"
		value="Postita" onclick="postitusTeemaAndmed();return false;">

</div>

</div>

</div>
