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
        .when('/rooms/add', {
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


hotelApp.controller('RoomController', function ($scope, $http, RoomService, $location) {

    function updateRooms() {
        RoomService.query(function (data) {
            $scope.rooms = data;
        });
    }

    updateRooms();

    $scope.delete = function (room) {
        RoomService.delete({id: room.id}, function () {
            updateRooms();
        });
    };

    $scope.add = function (room) {
        RoomService.save(room, function () {
            $location.path('/rooms');
        }, function () {
            $scope.inputError = true;
            setTimeout(function () {
                $scope.inputError = false;
            }, 3000);
        });
    }


    $scope.roomTypes = [{name: 'SGL', value: 'SGL'}, {name: 'DBL', value: 'DBL'}];
    $scope.roomClasses = [{name: 'Budget', value: 'BUDGET'}, {name: 'Standart', value: 'STANDART'}, {name: 'Lux', value: 'LUX'}];

});

