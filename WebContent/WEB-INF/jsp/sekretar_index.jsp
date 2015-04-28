<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
  <title>Sekretäri vaade</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <link rel="stylesheet" href="styles/tudeng_stiil.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
  <script src="scripts/ajax.js"></script>
 
</head>
<body>
	<header>
		<div id="headercontainer">
				<h1><a href="sekretar_index.jsp">Sekretäri vaade</a></h1><br>
				<nav> <!-- HTML5 navigation tag -->
					<ul>
						<li><a href="#" onclick="oppejouOtsing();return false;">Õppejõu otsing</a></li>
						<li><a href="#" onclick="loputooTeemaOtsing();return false;">Lõputöö teemad</a></li>
						<li><a href="#" onclick="minuAndmed();return false;">Minu andmed</a></li>
						<li><a href="#" onclick="navigeeri('/Tudengivaade/oppejoud_koormustega.jsp');return false;">Õppejõud koormustega</a></li>
						<li><a href="#" onclick="navigeeri('/Tudengivaade/loputood_valimata.jsp');return false;">Vaata tudengeid</a></li>
					</ul>				
				</nav>
		</div>
	</header>
	<div id="content">
	
	</div>


</body>
</html>