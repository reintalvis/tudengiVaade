<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

<h1>Avatud teema</h1>

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
		value="Postita" onclick="lisaPostitus();return false;">

</div>

</div>

</div>
