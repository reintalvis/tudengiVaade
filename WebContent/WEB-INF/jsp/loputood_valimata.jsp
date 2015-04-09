<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Nimekiri tudengitest, kellel on lõputöö valimata</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
</head>
</head>
<body>
<div class="container">
  <h1>Nimekiri tudengitest, kellel on lõputöö valimata</h1>

<form class="form-horizontal">
<div class="form-group">
      <label class="control-label col-sm-2" for="aktiivsus">Tüüp:</label>
      <div class="col-sm-4 input-group">
      <select class="form-control" id="aktiivsus">
          <option>Aktiivne</option>
          <option>Mitteaktiivne</option>
      </select>
      <span class="input-group-btn">
        <input type="button" class="btn btn-primary btn-default" value="Näita"/>
      </span>
      </div>
</div>
</form>

 <table class="table table-striped">
        <thead>
          <tr>
            <th>#</th>
            <th>Eesnimi</th>
            <th>Perenimi</th>
            <th>Õppeaasta</th>
          </tr>

        </thead>
        <tbody>
        <c:forEach items="${tudengid}" var="tudeng" varStatus="loop">
          <tr>
            <td>${loop.index+1}</td>
            <td>${tudeng.getEesnimi()}</td>
            <td>${tudeng.getPerenimi()}</td>
            <td>${tudeng.getOppeAasta()}</td>
          </tr>
		</c:forEach>
        </tbody>
</table>
</div>
</body>
</html>