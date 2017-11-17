'use strict';

angular
	.module('headerTabModule')
	.component('headerTab', {
		templateUrl : 'app/header-tab/header-tab.template.html',
		controller : ['$scope', '$http', 
			function HeaderTabController($scope, $http) {
				$http.get('assets/data/sentences.json').then(
					function(response) {
						var sentences = response.data;
						var randomNum =  Math.floor((Math.random() * sentences.length));
						$scope.sentence = sentences[randomNum].sentence;
					}
				);
		  	}
		]
	});