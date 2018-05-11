var data = {
	username: "admin",
	password: "123456"
};

function showData(data) {
	console.log(data);
}

console.log(ajaxPost("/testData", data, showData));