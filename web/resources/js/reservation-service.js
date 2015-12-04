angular.module('ReservationService', ['ngResource'])
    .factory('ReservationService', function ($resource, $http) {

        var basePath = '/api/reservations/';

        var data = $resource(basePath + ':id', {id: '@id'});


        data.find = function(filterObj, successCallback, errorCallback) {
            $http
                .post(basePath + 'find', filterObj)
                .then(function (response) {successCallback(response)}, function (response) {errorCallback(response);});
        };

        return data;
});