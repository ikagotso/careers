'use strict';
App.controller('JobsController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.user = {id: null, username: 'ala', password: '', name: 'John', phoneNumber: '50918321', birthDate: null, monthlySalary: 1200, currentLiabilities: 140, ageInYears: 15, creditLimit: 1220};
        me.authenticationUser = {username: '', password: ''};
        console.log('we are JobsController bitch!');
//        me.showVacancies = function () {
//            console.log('vachvenot?');
//            VacancyService.listAllVacancies()
//                    .then(
//                            function (d) {
//                                console.log(d);
//                                if (d) {
//                                    $location.url("jobs");
//                                    return;
//                                }
//                            }
//                    );
//        };
//        me.showVacancies();

    }]);