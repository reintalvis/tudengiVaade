<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
  <title>Tudengivaade</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <link rel="stylesheet" href="styles/tudeng_stiil.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
  <script src="scripts/ajax.js"></script>
 
</head>
<body>${message}
	<header>
		<div id="headercontainer">
				<h1><a href="index.jsp">Tudengivaade</a></h1>
				<nav> <!-- HTML5 navigation tag -->
					<ul>
						<li><a href="#" onclick="oppejouOtsing();return false;">Õppejõu otsing</a></li>
						<li><a href="#" onclick="loputooTeemaOtsing();return false;">Lõputöö teemad</a></li>
						<li><a href="#" onclick="oppejouOtsing();return false;">hetkel tühi</a></li>
						<li><a href="#" onclick="oppejouOtsing();return false;">hetkel tühi</a></li>
					</ul>				
				</nav>
		</div>
	</header>
	<div id="content">
	
	</div>


</body>
</html>