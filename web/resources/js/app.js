var hotelApp = angular.module('hotelApp', ['ngRoute']);

hotelApp.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/room', {
            templateUrl: 'templates/room.html'
        })
        .when('/reservation', {
            templateUrl: 'templates/reservation.html'
        })
        .otherwise({
            redirectTo: '/room'
        });
    $locationProvider.html5Mode(false);
});