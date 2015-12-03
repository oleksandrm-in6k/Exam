var hotelApp = angular.module('hotelApp', ['ngRoute', 'RoomService', 'RoomControllers']);

hotelApp.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'templates/main.html'
        })
        .when('/rooms', {
            templateUrl: 'templates/rooms/list.html',
            controller: 'RoomListController'

        })
        .when('/rooms/add', {
            templateUrl: 'templates/rooms/add.html',
            controller: 'RoomAddController'
        })
        .when('/rooms/find', {
            templateUrl: 'templates/rooms/find.html',
            controller: 'RoomFindController'

        })
        .when('/reservations', {
            templateUrl: 'templates/reservations/list.html'
        })
        .otherwise({
            redirectTo: '/'
        });
    $locationProvider.html5Mode(false);
});
