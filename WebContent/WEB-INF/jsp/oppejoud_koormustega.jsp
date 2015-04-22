<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Nimekiri õppejõududest koormustega</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
</head>
</head>
<body>
<div class="container">
  <h1>Nimekiri õppejõududest koormustega</h1>
        <table class="table table-striped">
        <thead>
          <tr>
            <th>#</th>
            <th>Eesnimi</th>
            <th>Perenimi</th>
            <th>Ametikoht</th>
            <th>Instituut</th>
            <th>Koormus</th>
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
            <td>${koormused[loop.index]}</td>
            
          </tr>
		</c:forEach>
        </tbody>
</table>
</div>
</body>
</html>