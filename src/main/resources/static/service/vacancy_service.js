'use strict';

App.factory('VacancyService', ['$http', '$q', function ($http, $q) {

        var jobData;

        return {
            getJobData: function () {
                return jobData;
            },
            setJobData: function (val) {
                jobData = val;
            },
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
            },
            listAllVacancyCategories: function () {
                return $http.get('http://localhost:8080/catList/')
                        .then(
                                function (response) {
                                    return response.data;
                                },
                                function (errResponse) {
                                    console.error('Error while fetching list!');
                                    return $q.reject(errResponse);
                                }
                        );
            },
            listAllVacancyTypes: function () {
                return $http.get('http://localhost:8080/typeList/')
                        .then(
                                function (response) {
                                    return response.data;
                                },
                                function (errResponse) {
                                    console.error('Error while fetching list!');
                                    return $q.reject(errResponse);
                                }
                        );
            },
            filterVacancies: function (param) {
                return $http.post('http://localhost:8080/filterJobs/', param)
                        .then(
                                function (response) {
                                    return response.data;
                                },
                                function (errResponse) {
                                    console.error('Error while fetching list!');
                                    return $q.reject(errResponse);
                                }
                        );
            },
            publishVacancy: function (param) {
                return $http.post('http://localhost:8080/publishJob/', param)
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