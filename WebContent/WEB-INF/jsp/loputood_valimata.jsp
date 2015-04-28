<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
  <h1>Nimekiri tudengitest, kellel on lõputöö valimata</h1>

<form action="" method="GET">
<div class="form-group">
      <label for="oppetase">Õppetase:</label>
      <div class="input-group">
      <select class="form-control" id="oppetase" name="oppetase">
          <option value="B">Bakalaureuseõpe</option>
          <option value="M">Magistriõpe</option>
          <option value="D">Doktoriõpe</option>
      </select>
      </div>
</div>
<div class="form-group">
      <label for="oppeaasta">Õppeaasta:</label>
      <div class="input-group">
      <select class="form-control" id="oppeaasta" name="oppeaasta">
          <option value="1">1. õppeaasta</option>
          <option value="2">2. õppeaasta</option>
          <option value="3">3. õppeaasta ja rohkem</option>
      </select>
      </div>
</div>
<input type="submit" class="btn btn-primary btn-default" value="Näita" onclick="filtreeriTudengid($('#oppeaasta').val(), $('#oppetase').val());return false;"/>
</form>

 <table class="table table-striped">
 <c:if test="${oppeaasta != null}">
 <caption>Nimekiri <strong>${oppeaasta}. õppeaasta</strong> tudengitest, <strong>õppetasemel: ${oppetaseNimi}</strong> kellel on lõputöö valimata</caption>
 </c:if>
        <thead>
          <tr>
            <th>#</th>
            <th>Eesnimi</th>
            <th>Perenimi</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${tudengid}" var="tudeng" varStatus="loop">
          <tr>
            <td>${loop.index+1}</td>
            <td>${tudeng.getEesnimi()}</td>
            <td>${tudeng.getPerenimi()}</td>
          </tr>
		</c:forEach>
        </tbody>
</table>
</div>