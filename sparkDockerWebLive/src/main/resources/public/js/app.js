
var app = (function () {
  
  var add = function() {    
      var valor = $("#palabra").val();
      var jsonValor = {"descripcion": valor};
      apiclient.addPalabra(jsonValor, view);
  }

  var view = function(error, res) {
	console.log(res);
    if(error != null){
    alert("Verifique los datos ingresados");
    return;
  } 
    console.log(res);
    $("#ok").text(res.confirm);
  }
 
  return { 
	  addPalabra: function() {
          add();
      } 

  }

})();