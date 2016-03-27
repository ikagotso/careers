'use strict';
App.controller('VacancyController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.user = {id: null, username: 'ala', password: '', name: 'John', phoneNumber: '50918321', birthDate: null, monthlySalary: 1200, currentLiabilities: 140, ageInYears: 15, creditLimit: 1220};
        $scope.message = 'this is message';
        me.authenticationUser = {username: '', password: ''};
        console.log('we are VacancyController bitch!');
        me.load = function () {
            console.log('vachvenot?');
            VacancyService.listAllVacancies()
                    .then(
                            function (d) {
                                console.log(d);
                                if (d) {
                                    $location.url("jobs");
                                    return;
                                }
                            }
                    );
        };
        me.load();

    }]);