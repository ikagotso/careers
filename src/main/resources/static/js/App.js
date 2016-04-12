'use strict';

var App = angular.module('careersApp', ['ngRoute']);

App.config(function ($routeProvider) {
    $routeProvider

            // route for the home page

//            .when('/', {
//                templateUrl: 'main.html',
//                controller: 'MainController'
//            })



            .when('/jobs', {
                templateUrl: 'jobs.html'
            })

            .when('/publish', {
                templateUrl: 'publish.html'
            });
//            
//            .when('/login', {
//                templateUrl : 'login.html',
//                controller  : 'LoginController'
//            })
//
//            .when('/registration', {
//                templateUrl : 'registration.html',
//                controller  : 'RegistrationController'
//            });
});
