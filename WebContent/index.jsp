<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
  <title>Otsing</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
  
</head>
<body>${message}


  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <input type ="button" onclick="location.href='minukandideerimised.html'" class="btn btn-default" value="Minu kandideerimised">
    </div>
  </div>

<div class="container">
  <h1>Otsing</h1>


<form class="form-horizontal" role="form">


 <div class="form-group">
    <label class="control-label col-sm-2" for="email">Tüüp:</label>
    <div class="col-sm-10">
      <select class="form-control" id="tyyp">
      		<option>Lõputöö</option>
      		<option>Praktikakoht</option>
      		<option>Projekt</option>
      </select>
    </div>
  </div>

   <div class="form-group">
    <label class="control-label col-sm-2" for="email">Teema:</label>
    <div class="col-sm-10">
      <select multiple="multiple" class="form-control" id="teema">
      		<option>Esimene teema</option>
      		<option>Teine</option>
      		<option>Kolmas</option>
      </select>
    </div>
  </div>



  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Teema vabatekstina:</label>
    <div class="col-sm-10">
      <input class="form-control" id="teema" placeholder="Sisesta teema">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Otsitav sõna:</label>
    <div class="col-sm-10"> 
      <input class="form-control" id="sona" placeholder="Sõna">
    </div>
  </div>
 <!--  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label><input type="checkbox"> ?</label>
        <label><input type="checkbox"> Remembe</label>
      </div>
    </div>
  </div> -->
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <input type ="button" onclick="location.href='tulemused.html'" class="btn btn-default" value="Otsi">
    </div>
  </div>
</form>


</div>



</body>
</html>