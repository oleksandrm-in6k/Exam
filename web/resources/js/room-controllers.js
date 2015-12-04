var hotelApp = angular.module('RoomControllers', ['ngRoute', 'RoomService']);


hotelApp.controller('RoomListController', function ($scope, $http, RoomService) {

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
});


hotelApp.controller('RoomAddController', function ($scope, $http, RoomService, $location) {
    $scope.room = {};

    $scope.roomTypes = [{name: 'SGL', value: 'SGL'}, {name: 'DBL', value: 'DBL'}];
    $scope.roomClasses = [{name: 'Budget', value: 'BUDGET'}, {name: 'Standart', value: 'STANDART'}, {name: 'Lux', value: 'LUX'}];

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

});


hotelApp.controller('RoomFindController', function ($scope, $http, RoomService, $location) {
    var lastRoomFilter = null;

    $scope.roomTypes = [{name: 'SGL', value: 'SGL'}, {name: 'DBL', value: 'DBL'}];
    $scope.roomClasses = [{name: 'Budget', value: 'BUDGET'}, {name: 'Standart', value: 'STANDART'}, {name: 'Lux', value: 'LUX'}];

    $scope.delete = function (room) {
        RoomService.delete({id: room.id}, function () {
            $scope.find(lastRoomFilter);
        });
    };

    $scope.find = function (roomFilter) {
        lastRoomFilter = roomFilter;
        RoomService.find(roomFilter, function (response) {
            $scope.rooms = response.data;
        });
    };

    $scope.find({});


});

