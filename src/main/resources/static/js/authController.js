angular.module('myApp')
.controller('AuthController', ['$scope', '$http', '$window', function($scope, $http, $window){
    var self = this;
    self.credentials = {};
    self.error = null;

    //login function
    self.login = function(){
        $http.post('/api/auth/login', self.credentials).then(function(response){

            var token = response.data.token;
            var roles = response.data.roles;

            sessionStorage.setItem('token', token);
            sessionStorage.setItem('roles', JSON.stringify(roles));

            if(roles.includes('ADMIN')){
                $window.location.href = 'user_admin.html';
            }else if (roles.includes('USER')){
                $window.location.href = 'index.html';
            }

        }, function(error){
            self.error = 'Invalid username or password';
        });
            
    };

    self.logout = function(){

        sessionStorage.clear();
        $window.location.href = 'user_login.html';

    };

}])

.controller('NavController', [])