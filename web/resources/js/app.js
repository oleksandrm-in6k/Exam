var hotelApp = angular.module('hotelApp', ['ngRoute', 'RoomService']);

hotelApp.config(function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'templates/main.html'
        })
        .when('/rooms', {
            templateUrl: 'templates/rooms/rooms.html',
            controller: 'RoomController'

        })
        .when('/room/add', {
            templateUrl: 'templates/rooms/add.html',
            controller: 'RoomController'

        })
        .when('/reservation', {
            templateUrl: 'templates/reservation.html'
        })
        .otherwise({
            redirectTo: '/'
        });
    $locationProvider.html5Mode(false);
});


hotelApp.controller('RoomController', function ($scope, $http, RoomService) {
    updateRooms();

    function updateRooms() {
        RoomService.query(function (data) {
            $scope.rooms = data;
        });
    }

    $scope.delete = function (room) {
        RoomService.delete({id: room.id}, function () {
            updateRooms();
        });
    };


});

