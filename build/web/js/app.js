/**
 * Created by ReeVerse on 23-04-2017.
 */
var app = angular.module('DSWMatter',[]);
var app = angular.module("myApp", ["ngRoute"]);
            app.config(function ($routeProvider) {
                $routeProvider
                        .when("/", {
                            templateUrl: "tables/mess.html"
                        })
                        .when("/#mess", {
                            templateUrl: "tables/mess.html"
                        })
                        .when("/#SRC", {
                            templateUrl: "tables/SRC.html"
                        })
                        .when("/#ASET", {
                            templateUrl: "tables/ASET.html"
                        });
            });