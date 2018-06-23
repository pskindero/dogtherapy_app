'use strict';

angular.module('gallerySectionModule').component('gallerySection', {
	templateUrl : 'app/gallery-section/gallery-section.template.html',
	controller : [ '$http', 
		function GalleryController($http) {
			var self = this;
			$http.get('assets/data/gallery.json').then(
				function(response) {
					var allPhotos = response.data.photos;
					self.photos = allPhotos.slice(0, 6);
				}
			);
		}
	]
});