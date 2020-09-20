  
var apiclient = (function(){

    return {
    	addPalabra: function(jsonPalabra, callback) {
            var promise = $.post({
        		url: "/add",
        		data: JSON.stringify(jsonPalabra),
        		contentType: "application/json"
            });
        	promise.then(function(data){
        		callback(null, JSON.parse(data));
        	}, function(error) {
        		callback(error, null);
        	});
        }
    }
})();