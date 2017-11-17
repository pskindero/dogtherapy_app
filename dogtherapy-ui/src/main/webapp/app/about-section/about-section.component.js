'use strict';

angular.module('aboutSectionModule').component('aboutSection', {
	templateUrl : 'app/about-section/about-section.template.html',
	controller :[ '$http', '$scope',
		function AboutController($http, $scope) {
			var self = this;
			$http.get('http://localhost:8080/about').then(
				function(response) {
					self.description = response.data;
				}
			);
			
			$scope.showExtendedDescr = false;
			$scope.showExtendedDescription = function() {
				$scope.showExtendedDescr = true;
			}
			$scope.hideExtendedDescription = function() {
				$scope.showExtendedDescr = false;
			}
		}]
});