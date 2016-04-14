'use strict';
App.controller('PublishController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.model = {title: "", companyName: "", description: "", fromDate: null, toDate: null, vacancyType: {id: null}, vacancyCategory: {id: null}};
        console.log('we are PublishController bitch!');

        me.publish = function () {
            console.log('clicked!');
            console.log(me.model);
            VacancyService.publishVacancy(me.model)
                    .then(
                            function (d) {
                                console.log(d);
                            }
                    );
        };

    }]);