<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lisa lõputöö teema</title>
        <link rel="stylesheet" href="styles/bootstrap.min.css">
        <link rel="stylesheet" href="styles/tudeng_stiil.css">
	  	<script src="scripts/jquery.min.js"></script>
	  	<script src="scripts/bootstrap.min.js"></script>

    </head>
<body>
<div class="container">
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
<a href="lisa_loputoo_teema.jsp">Tagasi</a>
</div>
</body>
</html>