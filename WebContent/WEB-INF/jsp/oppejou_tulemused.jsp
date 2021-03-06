<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
<table class="table table-striped">
	<thead>
		<tr>
			<th>#</th>
			<th>Eesnimi</th>
			<th>Perenimi</th>
			<th>Instituut</th>
		</tr>

	</thead>
	<tbody>
		<c:forEach items="${opetajad}" var="opetaja" varStatus="loop">
			<tr onclick="oppejouAndmed(${opetaja.getOppejoud_id()}); return false;" style="cursor:pointer; cursor:hand;">
				<td>${opetaja.getOppejoud_id()}</td>
				<td>${opetaja.getEesnimi()}</td>
				<td>${opetaja.getPerenimi()}</td>
				<td>${opetaja.getInstituut()}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>