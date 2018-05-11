function ajaxPost(url, data, callback) {
	$.ajax({
		type : "POST",
		url : url,
		data : data || null,
		success : function(data) {
			if (jQuery.isFunction(callback)) {
				callback(data);
				return;
			} else {
				return data;
			}
		}
	});
}