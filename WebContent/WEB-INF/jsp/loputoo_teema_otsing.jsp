<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">


<h1>L�put�� teema otsimine</h1>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label"
				for="aktiivsus">L�put�� teema:</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="nimetus_est">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label"
				for="aktiivsus">L�put�� teema (eng):</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="nimetus_eng">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label"
				for="aktiivsus">�ppej�u eesnimi:</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="oppejoud_eesnimi">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label"
				for="aktiivsus">�ppej�u perenimi:</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="oppejoud_perenimi">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">


	<input type="button" class="col-sm-4 btn btn-primary btn-default"
		value="Otsi" onclick="teostaTeemaOtsing();return false;">

</div>
</div>
<div id="loputoo_teema_tulemused"></div>
