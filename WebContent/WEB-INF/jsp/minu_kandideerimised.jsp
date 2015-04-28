<!DOCTYPE html>
<html lang="en">
<head>
  <title>Kandideerimised</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
</head>
<body>${message}


<div class="container">
  <h1>Minu kandideerimised</h1>

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
            <th>Pealkiri</th>
            <th>Pakkuja</th>
          </tr>

        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td><a href="kuulutus.html">Projekti juhtimine</a></td>
            <td>Elion</td>
          </tr>
          <tr>
            <td>2</td>
            <td><a href="kuulutus.html">Kasutajaliidese disain</a></td>
            <td>EMT</td>
          </tr>
          <tr>
            <td>3</td>
            <td><a href="kuulutus.html">Programmeerimine</a></td>
            <td>TTÃœ</td>
          </tr>
        </tbody>
</table>



</div>

</body>
</html>