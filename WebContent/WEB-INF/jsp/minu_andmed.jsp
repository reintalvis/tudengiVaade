<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Minu andmed</h1>

<table class="table table-striped">
	<thead>
		<tr>
			<th>Eesnimi: </th>
			<td>${teema.getEesnimi()}</td>
		</tr>
		<tr>
			<th>Perekonnanimi: </th>
			<td>${teema.getPerenimi()}</td>
		</tr>
		<tr>
			<th>Õppeaasta: </th>
			<td>${teema.getOppeAasta()}</td>
		</tr>
	</thead>
	<tbody>

	</tbody>
</table>