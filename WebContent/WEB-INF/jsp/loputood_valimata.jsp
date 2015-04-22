<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Nimekiri tudengitest, kellel on l�put�� valimata</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
</head>
</head>
<body>
<div class="container">
  <h1>Nimekiri tudengitest, kellel on l�put�� valimata</h1>

<form action="" method="GET">
<div class="form-group">
      <label for="oppetase">�ppetase:</label>
      <div class="input-group">
      <select class="form-control" id="oppetase" name="oppetase">
          <option value="B">Bakalaureuse�pe</option>
          <option value="M">Magistri�pe</option>
          <option value="D">Doktori�pe</option>
      </select>
      </div>
</div>
<div class="form-group">
      <label for="oppeaasta">�ppeaasta:</label>
      <div class="input-group">
      <select class="form-control" id="oppeaasta" name="oppeaasta">
          <option value="1">1. �ppeaasta</option>
          <option value="2">2. �ppeaasta</option>
          <option value="3">3. �ppeaasta ja rohkem</option>
      </select>
      </div>
</div>
<input type="submit" class="btn btn-primary btn-default" value="N�ita"/>
</form>

 <table class="table table-striped">
 <c:if test="${oppeaasta != null}">
 <caption>Nimekiri <strong>${oppeaasta}. �ppeaasta</strong> tudengitest, <strong>�ppetasemel: ${oppetaseNimi}</strong> kellel on l�put�� valimata</caption>
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
</body>
</html>