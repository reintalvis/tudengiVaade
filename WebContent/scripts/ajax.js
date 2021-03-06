function oppejouOtsing() {
	navigeeri("/Tudengivaade/oppejou_otsing.jsp")
}
function loputooTeemaOtsing() {
	navigeeri("/Tudengivaade/loputoo_teema_otsing.jsp")
}
function pakuValjaTeema(id) {

	$.ajax({
		type: "GET",
		data: "id=" + id,
		url: "/Tudengivaade/lisa_loputoo_teema.jsp",
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function lisaTeema(juhendaja_id, tudeng_id) {
	// get the form values
	var nimetus_est = $('#nimetus_est').val();
	var nimetus_eng = $('#nimetus_eng').val();
	var kirjeldus = $('#kirjeldus').val();


	$.ajax({
		type: "POST",
		url: "/Tudengivaade/loputoo_teemade_nimekiri_oppejou_vaatest.jsp",
		data: "juhendaja_id=" + juhendaja_id + "&tudeng_id=" + tudeng_id + "&nimetus_est=" + nimetus_est + "&nimetus_eng=" + nimetus_eng + "&kirjeldus=" + kirjeldus,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();

		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}

function teostaOppejouOtsing() {
	// get the form values
	var eesnimi = $('#eesnimi').val();
	var perenimi = $('#perenimi').val();
	var instituut = $('#instituut').val();
	$.ajax({
		type: "POST",
		url: "/Tudengivaade/oppejou_otsing.jsp",
		data: "eesnimi=" + eesnimi + "&perenimi=" + perenimi + "&instituut=" + instituut,
		success: function(response){
			// we have the response
			$("#oppejou_tulemused").html(
					response
			);
			$("#oppejou_tulemused").show();
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function teostaTeemaOtsing() {
	// get the form values
	var nimetus_est = $('#nimetus_est').val();
	var nimetus_eng = $('#nimetus_eng').val();
	var oppejoud_eesnimi = $('#oppejoud_eesnimi').val();
	var oppejoud_perenimi = $('#oppejoud_perenimi').val();
	$.ajax({
		type: "POST",
		url: "/Tudengivaade/loputoo_teema_otsing.jsp",
		data: "nimetus_est=" + nimetus_est + "&nimetus_eng=" + nimetus_eng + "&oppejoud_eesnimi=" + oppejoud_eesnimi +"&oppejoud_perenimi=" + oppejoud_perenimi,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function oppejouAndmed(id) {

	$.ajax({
		type: "GET",
		url: "/Tudengivaade/oppejou_andmed.jsp",
		data: "id=" + id,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
			$("#oppejou_tulemused").hide();
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function vaataOppejouTeemasid(id) {

	$.ajax({
		type: "GET",
		url: "/Tudengivaade/loputoo_teemade_nimekiri_oppejou_vaatest.jsp",
		data: "id=" + id,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
		},
		error: function(e){
			alert('Oppejoul puuduvad teemad!');
		}
	});
}
function vahetaroll(){
	$.ajax({
		type: "POST",
		url: "/Tudengivaade/vaheta_roll.jsp",
		success: function(response){
			// we have the response
			$("#kasutajanime_link").html(
					response
			);
		},
		error: function(e){
			console.log("Viga rolli vahetamisel");
		}
	});
}

function avatudTeema() {
	navigeeri("/Tudengivaade/avatud_teema.jsp");
}
function minuAndmed() {
	navigeeri("/Tudengivaade/minu_andmed.jsp");
}
function lisaPostitus() {
	// get the form values
	var postituse_sisu = $('#postituse_sisu').val();

	$.ajax({
		type: "POST",
		url: "/Tudengivaade/avatud_teema.jsp",
		data: "postituse_sisu=" + postituse_sisu,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function teemaAndmed(Loputoo_id) {

	$.ajax({
		type: "GET",
		url: "/Tudengivaade/teema_andmed.jsp",
		data: "Loputoo_id=" + Loputoo_id,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function postitusTeemaAndmed(Loputoo_id, tudeng_id) {
	// get the form values
	var postitus = $('#postitus').val();

	$.ajax({
		type: "POST",
		url: "/Tudengivaade/lisa_kommentaar.jsp",
		data: "postitus=" + postitus + "&Loputoo_id=" + Loputoo_id + "&tudeng_id=" + tudeng_id,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function kandideeri(Loputoo_id) {

	$.ajax({
		type: "POST",
		url: "/Tudengivaade/teema_andmed.jsp",
		data: "Loputoo_id=" + Loputoo_id,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function filtreeriTudengid(oppeaasta, oppetase){
	$.ajax({
		type: "POST",
		url: "/Tudengivaade/loputood_valimata.jsp",
		data: "oppeaasta=" + oppeaasta+"&oppetase="+oppetase,
		success: function(response){
			// we have the response
			$("#content").html(
					response
			);
			$("#content").show();
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}

function navigeeri(url){
	$.ajax({
		type: "GET",
		url: url,
		success: function(response){
			$("#content").html(response);
			$("#content").show();
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
