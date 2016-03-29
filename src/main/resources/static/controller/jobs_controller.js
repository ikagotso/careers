'use strict';
App.controller('JobsController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.jobs = [];
        me.authenticationUser = {username: '', password: ''};
        console.log('we are JobsController bitch!');
        me.showVacancies = function () {
            console.log('vachvenot?');
            VacancyService.listAllVacancies()
                    .then(
                            function (d) {
                                console.log(d);
                                if (d) {
                                    me.jobs = d;
                                }
                            }
                    );
        };
        me.showVacancies();



    }]);