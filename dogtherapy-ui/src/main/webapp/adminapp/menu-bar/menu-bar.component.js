'use strict';

angular.module('menuBarModule').component('menuBar', {
	templateUrl : 'adminapp/menu-bar/menu-bar.template.html',
	controller : ['$scope', '$http', function MenuBarController($scope, $http) {
		$scope.showMenu=false;
		$scope.openCloseMenu = function() {
			$scope.showMenu = ! $scope.showMenu;
		}
	}]
});