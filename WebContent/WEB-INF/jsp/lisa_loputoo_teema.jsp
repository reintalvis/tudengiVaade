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
					class="control-label" for="aktiivsus">Kirjeldus:</label></td>
				<td><div class="col-sm-4 input-group">
						<textarea type="text" name="kirjeldus" id="kirjeldus"></textarea>
					</div></td>
			</tr>
		</table>
	</div>

	<div class="form-group">


		<input type="submit" class="col-sm-4 btn btn-primary btn-default"
			value="Salvesta" onclick="lisaTeema(${oppejoud.getOppejoud_id()},1);return false;">

	</div>
</form></br></br></br>
<a href="#" onclick="oppejouAndmed(${oppejoud.getOppejoud_id()});return false;">Tagasi</a>
<div id="teemadeNupp">
</div>




