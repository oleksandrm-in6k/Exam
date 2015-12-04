angular.module('RoomService', ['ngResource'])
    .factory('RoomService', function ($resource, $http) {
        var basePath = '/api/rooms/';

        var data = $resource(basePath + ':id', {id: '@id'});


        data.find = function(filterObj, successCallback, errorCallback) {
            $http
                .post(basePath + 'find', filterObj)
                .then(function (response) {successCallback(response)}, function (response) {errorCallback(response);});
        };

        return data;
});