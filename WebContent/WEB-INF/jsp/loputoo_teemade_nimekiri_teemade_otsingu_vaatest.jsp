<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<h1>Lõputöö teemad</h1>



<table class="table table-striped">
	<thead>
		<tr>
			<th>#</th>
			<th>Nimetus eesti keeles</th>
			<th>Nimetus inglise keeles</th>
			<th>Staatus</th>
			<th>Õppejõud</th>
		</tr>

	</thead>
	<tbody>
		<c:forEach items="${teemad}" var="teema" varStatus="loop">
			<tr onclick="teemaAndmed(${teema.getLoputooTeema_id()}); return false;" style="cursor:pointer; cursor:hand;">

				<td>${teema.getLoputooTeema_id()}</td>
				<td>${teema.getNimetus_est()}</td>
				<td>${teema.getNimetus_eng()}</td>
				<td>${teema.getStaatus()}</td>
				<td>${teema.getJuhendaja().getEesnimi()} ${teema.getJuhendaja().getPerenimi()}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="#" onclick="loputooTeemaOtsing();return false;">Tagasi</a>
