<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
<h1>Minu andmed</h1>

<table class="table table-striped">
	<tbody>
		<tr>
			<td><strong>Eesnimi:</strong></td>
			<td>${eesnimi}</td>
		<tr>
			<td><strong>Perekonnanimi:</strong></td>
			<td>${perenimi}</td>
		</tr>
		<tr>
			<td><strong>Roll:</strong></td>
			<td>${roll}</td>
		</tr>
		<c:if test="${roll =='tudeng' }">
		<tr>
			<td><strong>Õppeaasta:</strong></td>
			<td>${oppeaasta}</td>
		</tr>
		</c:if>
	</tbody>
</table>
<c:if test="${roll =='tudeng' }">
<input class="btn btn-primary btn-default" type="button" onclick="vahetaroll();location.href='/Tudengivaade/sekretar_index.jsp'" value="Vaheta roll">
</c:if>
<c:if test="${roll !='tudeng' }">
<input class="btn btn-primary btn-default" type="button" onclick="vahetaroll();location.href='/Tudengivaade/index.jsp'" value="Vaheta roll">
</c:if>
</div>