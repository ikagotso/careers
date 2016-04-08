'use strict';
App.controller('JobsController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.jobs = [];
        me.authenticationUser = {username: '', password: ''};
        console.log('we are JobsController bitch!');
        me.showVacancies = function () {
            VacancyService.listAllVacancies()
                    .then(
                            function (d) {
                                if (d) {
                                    me.jobs = d;
                                }
                            }
                    );
        };

        $scope.$watch(function () {
            return VacancyService.getJobData();
        }, function (newValue, oldValue) {
            if (newValue != null) {
                me.jobs = newValue;
            }
        }, true);


        me.showVacancies();



    }]);