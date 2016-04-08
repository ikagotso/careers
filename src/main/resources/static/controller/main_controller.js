'use strict';
App.controller('MainController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.types = [];
        me.categories = [];
        console.log('we are MainController bitch!');

        me.loadCategories = function () {
            VacancyService.listAllVacancyCategories()
                    .then(
                            function (d) {
                                if (d) {
                                    me.categories = d;
                                }
                            }
                    );
        };
        
        me.loadTypes = function () {
            VacancyService.listAllVacancyTypes()
                    .then(
                            function (d) {
                                if (d) {
                                    me.types = d;
                                }
                            }
                    );
        };
        
        me.load = function () {
            me.loadTypes();
            me.loadCategories();
            $location.url("jobs");
        };

        me.filter = function () {
            VacancyService.filterVacancies({vacancyType: $scope.selectedType
                , vacancyCategory: $scope.selectedCategory})
                    .then(
                            function (d) {
                                VacancyService.setJobData(d);
                            }
                    );
        };

        me.load();

    }]);