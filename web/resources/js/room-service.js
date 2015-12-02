angular.module('RoomService', ['ngResource'])
    .factory('RoomService', function ($resource) {
    var data = $resource('/api/rooms/:id', {id: '@id'}, {
        update:{
            method:'PUT'
        },
        delete: {
            method: 'DELETE'
        }
     });

    return data;
});