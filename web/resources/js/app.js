var hotelApp = angular.module('hotelApp', ['ngRoute', 'RoomService', 'RoomControllers', 'ReservationControllers', 'validButtonDirective']);

hotelApp.factory('myHttp',['$http',function($q,$http) {
        return function(url, success, failure) {
            //console.log($q.reject());
            $q.defer().reject();

        }
    }]);

hotelApp.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'templates/main.html',
            controller: 'GeneralController'
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
            templateUrl: 'templates/reservations/list.html',
            controller: 'ReservationListController'
        })
        .when('/reservations/add', {
            templateUrl: 'templates/reservations/add.html',
            controller: 'ReservationAddController'
        })
        .when('/reservations/find', {
            templateUrl: 'templates/reservations/find.html',
            controller: 'ReservationFindController'

        })
        .otherwise({
            redirectTo: '/'
        });
    $locationProvider.html5Mode(false);
});

hotelApp.controller('GeneralController', function (myHttp, $http) {
    myHttp('/api/rooms/', function () {alert('good')}, function () {alert('bad');});

    $http.get('/api/rooms/');
});