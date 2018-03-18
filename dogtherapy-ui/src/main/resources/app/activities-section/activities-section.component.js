'use strict';

angular.module('activitiesSectionModule').component('activitiesSection', {
	templateUrl : 'app/activities-section/activities-section.template.html',
	controller : [ '$http', '$scope', 
		function ActivitiesController($http, $scope) {
			var self = this;
			$http.get('assets/data/activities.json').then(
					function(response) {
						self.activities = response.data;
					}
			);

			$scope.showDefWindow = false;
			$scope.showMoreAboutActivity = function(id) {
				$scope.showDefWindow = true;
			}
		}
	]
});