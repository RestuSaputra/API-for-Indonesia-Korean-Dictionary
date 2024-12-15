angular.module('kamusApp', [])
.controller('AuthController', ['$scope', '$http', function($scope, $http){
    var self = this;
    self.credentials = {};
    self.error = null;

    self.login = function(){
        $http.post('/api/auth/login', self.credentials).then(function(response){
            window.location.href = 'index.html';

        }, function(error){
            self.error = 'Invalid username or password';
        })
    }
}])

.controller('NavController', ['$scope', '$http', function($scope, $http){
    var self = this;

    self.isAdmin = function(){
        return sessionStorage.getItem('role') === 'ADMIN';
    };

    self.isUser = function(){
        return sessionStorage.getItem('role') === 'USER';
    };

    self.logout = function(){
        $http.post('/api/auth/logout').then(function(){
            sessionStorage.clear();
            window.location.href = 'user_login.html';
        });
    };
}]);