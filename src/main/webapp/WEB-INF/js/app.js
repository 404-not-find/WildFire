(function() {
	'use strict';

	var myApp = angular.module('knowledgeApp', [ 'ui.bootstrap', 'ngRoute'

	]);

	myApp.config([ '$routeProvider', '$locationProvider', '$httpProvider',
			function($routeProvider, $locationProvider, $httpProvider) {
				$routeProvider.when('/:menu/:item/:action', {
					templateUrl : 'template.html',
					controller : 'navCtrl'
				});
			} ]);

	myApp.controller('NavbarCtrl', function($scope, $http, $location) {
		$http.get("../js/nav.json").success(function(json) {
			$scope.navbar = json;
		});
	});

	myApp.controller('textController', function($scope, $http) {
		$scope.items = {
			'是' : 1,
			'否' : 0

		};
		$scope.saveForm = function(object) {

			// var postData = {text:'long blob of text'};
			// // var config = {params: {id: '5'}};
			// $http.post('/knowledge/Concept', postData).success(function(data)
			// {
			// $scope.data = data;
			// alert(111);
			// });

			$http.post('ontology/entityCreate', object, {
				headers : {
					'Content-Type' : 'application/json; charset=UTF-8'
				}
			}).success(function(data) {
				$scope.data = data;
				alert(data);
			});

		}

	});
	var navApp = myApp.controller('navCtrl', [
			'$scope',
			'$routeParams',
			'$http',
			function($scope, $routeParams, $http) {
				var config = {
					dataSource : '../js/c.json'
				};

				alchemy = new Alchemy(config);

				
				$scope.menu = $routeParams.menu;
				$scope.item = $routeParams.item;
				$scope.action = $routeParams.action;
				if ($scope.action == "entityCreate") {
					$scope.pageTip = "创建实体";
				}
				if ($scope.action == "entityQuery") {
					$scope.pageTip = "查询实体";
				}
				$scope.itemUrl = $routeParams.item + "/" + $routeParams.action
						+ ".html";
			} ]);

})();