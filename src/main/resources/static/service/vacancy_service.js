'use strict';

App.factory('VacancyService', ['$http', '$q', function ($http, $q) {

        return {
            listAllVacancies: function () {
                return $http.get('http://localhost:8080/jobList/')
                        .then(
                                function (response) {
                                    return response.data;
                                },
                                function (errResponse) {
                                    console.error('Error while fetching list!');
                                    return $q.reject(errResponse);
                                }
                        );
            }

        };

    }]);