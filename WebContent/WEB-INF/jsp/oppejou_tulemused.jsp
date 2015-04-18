<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table class="table table-striped">
	<thead>
		<tr>
			<th>#</th>
			<th>Eesnimi</th>
			<th>Perenimi</th>
			<th>Ametikoht</th>
			<th>Instituut</th>
		</tr>

	</thead>
	<tbody>
		<c:forEach items="${opetajad}" var="opetaja" varStatus="loop">
			<tr>
				<td>${opetaja.getOppejoud_id()}</td>
				<td>${opetaja.getEesnimi()}</td>
				<td>${opetaja.getPerenimi()}</td>
				<td>${opetaja.getAmetikoht()}</td>
				<td>${opetaja.getInstituut()}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
