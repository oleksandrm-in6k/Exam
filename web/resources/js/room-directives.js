angular.module('validButtonDirective', []).directive('validButton', function () {
    var link = function (scope) {
        scope.isValid = function () {
            return scope.room.number <= 0 || !scope.room.roomType || !scope.room.roomClass ||
                !(scope.room.pricePerDay > 0);
        }
    };

    return {
        scope: true,
        link: link
    };

});