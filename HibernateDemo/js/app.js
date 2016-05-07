var hibernateApp = angular.module('hibernateApp', ['ngRoute']);

hibernateApp.config(function ($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl: 'templates/signInForm.html',
			controller: 'mainController'
		})
		.when('/succes', {
			templateUrl: 'templates/successPage.html',
			controller: 'successController'
		})
})

hibernateApp.service('$myService', function () {
	this.name = "Amar";
	this.taskArray = [];
	this.id = 0;
})

hibernateApp.controller('mainController', ['$scope', '$http', '$location', '$myService', function ($scope, $http, $location, $myService) {
	$scope.showError = false;
	$scope.loader = false;
	$scope.signIn = function () {
		$scope.loader = true;
		$http({
			method: 'GET',
			url: 'login.jsp',
			params: {
				user: $scope.user,
				password: $scope.password
			},
			cache: true,
		}).then(function (response) {
			console.log(response.data);
			var response = response.data.trim();
			var responseArr = response.split("|");
			console.log(responseArr[1]);

			if (responseArr[0] === "success") {
				$myService.name = responseArr[1].trim();
				$myService.id = responseArr[3].trim();
				var arr = responseArr[4].split("*");
				arr.splice(0, 1);
				$myService.taskArray = arr;
				$location.path('/succes');
			} else {
				$scope.showError = true;
				$scope.loader = false;
			}

		}, function (error) {
			//error function
		});
	}
}])

hibernateApp.controller('successController', ['$scope', '$http', '$myService', function ($scope, $http, $myService) {
	$scope.showLoader = true;
	$scope.name = $myService.name;
	$scope.userId = $myService.id;
	$scope.taskArray = $myService.taskArray;
	$scope.addTask = function () {
		$http({
			method: 'GET',
			url: 'handleTask.jsp',
			params: {
				userId: $scope.userId,
				task: $scope.task
			},
			cache: true,
		}).then(function (response) {
			var response = response.data.trim();
			if (response == "1") {
				$scope.taskArray.push($scope.task);
			} else {

			}
		}, function (e) {

		})
	}
}])