'use strict'
/**實做執行程序,這邊就是組REST API字串**/
angular.module('demo.services', []).factory('UserService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			// 會執行REST /getUserById 帶userId 到server端並帶回回傳值
			service.getUserById = function(userId) {
				var url = CONSTANTS.getUserByIdUrl + userId;
				 console.log(url);
				return $http.get(url);
			}
			// 會執行REST /getAllUsers 到server端並帶回回傳值
			service.getAllUsers = function() {
				return $http.get(CONSTANTS.getAllUsers);
			}
			// 會執行REST /saveUser 帶userDto 到server端並帶回回傳值
			service.saveUser = function(userDto) {
				return $http.post(CONSTANTS.saveUser, userDto);
			}
			
			// 會執行REST /saveUser 帶userDto 到server端並帶回回傳值
			service.test = function() {
				alert('ok');
			}
			return service;
		} ]);