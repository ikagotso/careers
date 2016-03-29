'use strict';
App.controller('MainController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.user = {id: null, username: 'ala', password: '', name: 'John', phoneNumber: '50918321', birthDate: null, monthlySalary: 1200, currentLiabilities: 140, ageInYears: 15, creditLimit: 1220};
        $scope.message = 'this is message';
        me.authenticationUser = {username: '', password: ''};
        console.log('we are MainController bitch!');
        me.load = function () {
            $location.url("jobs");
        };
        me.load();

    }]);