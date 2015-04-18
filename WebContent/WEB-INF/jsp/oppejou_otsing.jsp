<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">


<h1>Õppejõu otsimine</h1>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Eesnimi:</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="eesnimi">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Perenimi:</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="perenimi">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">
	<table>
		<tr>
			<td class="otsing_label"><label class="control-label col-sm-2"
				for="aktiivsus">Instituut:</label></td>
			<td><div class="col-sm-4 input-group">
					<input type="text" id="instituut">
				</div></td>
		</tr>
	</table>
</div>
<div class="form-group">


	<input type="button" class="col-sm-4 btn btn-primary btn-default"
		value="Otsi" onclick="teostaOppejouOtsing();return false;">

</div>
</div>
<div id="oppejou_tulemused"></div>
