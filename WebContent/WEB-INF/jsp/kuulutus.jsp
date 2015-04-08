<!DOCTYPE html>
<html lang="en">
<head>
  <title>Kuulutus</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="styles/bootstrap.min.css">
  <script src="scripts/jquery.min.js"></script>
  <script src="scripts/bootstrap.min.js"></script>
  <script type="text/javascript">
   $(document).ready(function(){
        $('#kandideerinupp').click(function(){
            if(confirm("Kas oled kindel, et soovid kandideerida?")){
                location.href = 'kandideeri.html';
            }
        });
   });
  </script>
</head>
<body>${message}

<div class="container">
  <h1>Kuulutuse kirjeldus</h1>

<div class="row">
  <div class="col-md-6 col-md-offset-2">
    <p>
    Eelneva kuulutuse kirjeldus tuleb siia. Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    Eelneva kuulutuse kirjeldus tuleb siia.
    </p>
  </div>


  <div class="col-md-2">
<input type ="button" id="kandideerinupp" class="btn btn-primary" value="Kandideeri">
  </div>
</div>
    <div class="row col-xs-5 col-md-12" id="chat_window_1">
        <div class="col-xs-12 col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading top-bar clearfix">
                    <div class="col-md-8 col-xs-8">
                         <h3 class="panel-title"><span class="glyphicon glyphicon-comment"></span> Vestlus</h3>
                    </div>
                </div>
                <div class="panel-body msg_container_base">
                    <div class="row msg_container base_sent">
                        <div class="col-md-10 col-xs-10">
                            <div class="messages msg_sent">
                                <p class="">Kus kohas töö toimub?</p>
                                <time datetime="2009-11-13T20:00" class="">Küsija â- 51 min</time>
                            </div>
                        </div>
                        <div class="col-md-2 col-xs-2 avatar">
                            <img src="http://www.bitrebels.com/wp-content/uploads/2011/02/Original-Facebook-Geek-Profile-Avatar-1.jpg" height="100" width="100" class="img-responsive">
                        </div>
                    </div>
                    <div class="row msg_container base_receive">
                        <div class="col-md-2 col-xs-2 avatar">
                            <img src="http://www.bitrebels.com/wp-content/uploads/2011/02/Original-Facebook-Geek-Profile-Avatar-1.jpg" height="100" width="100" class="img-responsive">
                        </div>
                        <div class="col-md-10 col-xs-10">
                            <div class="messages msg_receive">
                                <p class="">Töö toimub Tallinnas, Nõmmel.</p>
                                <time datetime="2009-11-13T20:00" class="">Vastaja - 51 min</time>
                            </div>
                        </div>
                    </div>                       
                </div>
                <div class="panel-footer">
                    <div class="input-group">
                        <input id="btn-input" type="text" class="form-control input-sm chat_input" placeholder="Kirjuta oma sõnum siia..."> <span class="input-group-btn">
                        <button class="btn btn-primary btn-sm" id="btn-chat">Saada</button>
                        </span>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>