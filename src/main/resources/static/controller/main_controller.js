'use strict';
App.controller('MainController', ['$scope', '$location', 'VacancyService', function ($scope, $location, VacancyService) {
        var me = this;
        me.types = [];
        me.categories = [];
        $scope.message = 'this is message';
        console.log('we are MainController bitch!');

        me.loadCategories = function () {
            console.log('vachvenot?');
            VacancyService.listAllVacancyCategories()
                    .then(
                            function (d) {
                                console.log(d);
                                if (d) {
                                    me.categories = d;
                                }
                            }
                    );
        };
        me.loadTypes = function () {
            console.log('vachvenot?');
            VacancyService.listAllVacancyTypes()
                    .then(
                            function (d) {
                                console.log(d);
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

        me.go = function () {
            console.log('clicked!');
            console.log($scope.selectedType);
            console.log($scope.selectedCategory);
            if (!$scope.selectedType && !$scope.selectedCategory) {
                return;
            }

            VacancyService.filterVacancies({vacancyType: $scope.selectedType
                , vacancyCategory: $scope.selectedCategory})
                    .then(
                            function (d) {
                                console.log(d);
//                                if (d) {
//                                    me.categories = d;
//                                }
                            }
                    );



        };





        me.load();

    }]);