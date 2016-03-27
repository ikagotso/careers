'use strict';
 
var App = angular.module('careersApp',['ngRoute']);

App.config(function($routeProvider) {
        $routeProvider

            // route for the home page
            .when('/jobs', {
                templateUrl : 'jobs.html',
                controller  : 'JobsController'
            })

//            .when('/profile', {
//                templateUrl : 'profile.html',
//                controller  : 'ProfileController'
//            })
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
