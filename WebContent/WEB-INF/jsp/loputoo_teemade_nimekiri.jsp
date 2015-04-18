<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<h1>Loputoo teemad</h1>



<table class="table table-striped">
	<thead>
		<tr>
			<th>#</th>
			<th>Nimetus eesti keeles</th>
			<th>Nimetus inglise keeles</th>
			<th>Midagi veel</th>
			<th>Ajutiselt tudengi perenimi</th>
		</tr>

	</thead>
	<tbody>
		<c:forEach items="${teemad}" var="teema" varStatus="loop">
			<tr>
				<td>${teema.getLoputooTeema_id()}</td>
				<td>${teema.getNimetus_est()}</td>
				<td>${teema.getNimetus_eng()}</td>
				<td>${teema.getMidagi_veel()}</td>
				<td>${teema.getTudeng().getPerenimi()}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="#" onclick="loputooTeemaLisamine();return false;">Tagasi</a>
