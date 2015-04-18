function oppejouOtsing() {

	$.ajax({
		type: "GET",
		url: "/Tudengivaade/oppejou_otsing.jsp",
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
function loputooTeemaLisamine() {

	$.ajax({
		type: "GET",
		url: "/Tudengivaade/lisa_loputoo_teema.jsp",
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
function lisaTeema() {
	// get the form values
	var nimetus_est = $('#nimetus_est').val();
	var nimetus_eng = $('#nimetus_eng').val();
	var midagi_veel = $('#midagi_veel').val();
	var tudeng_eesnimi = $('#tudeng_eesnimi').val();
	var tudeng_perenimi = $('#tudeng_perenimi').val();

	$.ajax({
		type: "POST",
		url: "/Tudengivaade/loputoo_teemade_nimekiri.jsp",
		data: "nimetus_est=" + nimetus_est + "&nimetus_eng=" + nimetus_eng + "&midagi_veel=" + midagi_veel + "&tudeng_eesnimi=" + tudeng_eesnimi + "&tudeng_perenimi=" + tudeng_perenimi,
		success: function(response){
			// we have the response
			$(".container").html(
					response
			);
			$(".container").show();
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}
function vaataTeemasid() {

	$.ajax({
		type: "GET",
		url: "/Tudengivaade/loputoo_teemade_nimekiri.jsp",
		success: function(response){
			// we have the response
			$(".container").html(
					response
			);
			$(".container").show();
			//$('#name').val('');
			//$('#education').val('');
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
			//$('#name').val('');
			//$('#education').val('');
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}