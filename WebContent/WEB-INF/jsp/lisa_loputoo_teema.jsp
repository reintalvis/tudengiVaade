<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">

<h1>Uue lõputöö teema lisamine</h1>
<form action="javascript:void(0);" method="post">
	<div class="form-group">
		<table>
			<tr>
				<td class="teema_lisamise_label"><label
					class="control-label" for="aktiivsus">Nimi (eesti keeles):</label></td>
				<td><div class="col-sm-4 input-group">
						<input type="text" name="nimetus_est" id="nimetus_est">
					</div></td>
			</tr>
		</table>
	</div>
	<div class="form-group">
		<table>
			<tr>
				<td class="teema_lisamise_label"><label
					class="control-label" for="aktiivsus">Nimi
						(inglise keeles):</label></td>
				<td><div class="col-sm-4 input-group">
						<input type="text" name="nimetus_eng" id="nimetus_eng">
					</div></td>
			</tr>
		</table>
	</div>
	<div class="form-group">
		<table>
			<tr>
				<td class="teema_lisamise_label"><label
					class="control-label" for="aktiivsus">Midagi veel:</label></td>
				<td><div class="col-sm-4 input-group">
						<input type="text" name="midagi_veel" id="midagi_veel">
					</div></td>
			</tr>
		</table>
	</div>
	<div class="form-group">
		<table>
			<tr>
				<td class="teema_lisamise_label"><label
					class="control-label" for="aktiivsus">Tudengi
						eesnimi:</label></td>
				<td><div class="col-sm-4 input-group">
						<input type="text" name="tudeng_eesnimi" id="tudeng_eesnimi">
					</div></td>
			</tr>
		</table>
	</div>
	<div class="form-group">
		<table>
			<tr>
				<td class="teema_lisamise_label"><label
					class="control-label" for="aktiivsus">Tudengi
						perenimi:</label></td>
				<td><div class="col-sm-4 input-group">
						<input type="text" name="tudeng_perenimi" id="tudeng_perenimi">
					</div></td>
			</tr>
		</table>
	</div>
	<div class="form-group">


		<input type="submit" class="col-sm-4 btn btn-primary btn-default"
			value="Salvesta" onclick="lisaTeema();return false;">

	</div>
</form>
<div id="teemadeNupp">
<input type="submit" class="col-sm-4 btn btn-primary btn-default" style="margin-top: -23%; margin-left: 30%;"
			value="Vaata teemasid" onclick="vaataTeemasid();return false;">
</div>
</div>




