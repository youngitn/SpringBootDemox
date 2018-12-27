'use strict'
/**controller**/
/**所有動作的定義都在此**/
/****/
// 定義一個叫做demo.controllers的module
var module = angular.module('demo.controllers', []);

/**參數　　　名稱,[model統一參數名稱,會用到的檔案名稱,function定義] **/
module.controller("UserController", ["$scope", "UserService",
    function($scope, UserService) {
        
		/** $scope表示定義model* */
		// !定義!userDto
		$scope.userDto = {
            userId: null,
            userName: null,
            depno: null
        };
		
		// 定義skills
        $scope.skills = [];
        // *********************************直接!執行!寫法如下***************************************>>>>
        // 從server REST /getUserById/1 找id=1的userDto json資料(來自server) 顯示在console
// UserService.getUserById(1).then(function(value) {
// console.log(value.data);
// }, function(reason) {
// console.log("error occured");
// }, function(value) {
// console.log("no callback");
// });
      // ************************************************************************<<<<<<<<<
        // ###########!定義! $scope.function名稱
		// ################################################################
     // 從server REST /getUserById/1 找id=1的userDto json資料(來自server) 顯示在console
        $scope.test = function() {
        	UserService.getUserById($scope.userDto.userId).then(function(value) {
              console.log(value.data);
              $scope.allUsers = value.data;
          }, function(reason) {
              console.log("error occured");
          }, function(value) {
              console.log("no callback");
          });
        	 console.log($scope.userDto.userId);
        };
        
        // !定義!model中的saveUser
        $scope.saveUser = function() {
        	// userDto有多個skillDtos
            $scope.userDto.skillDtos = $scope.skills.map(skill => {
                return {
                    skillId: null,
                    skillName: skill
                };
            });
        
            // !執行!UserService.saveUser 會執行REST /saveUser
            UserService.saveUser($scope.userDto).then(function() {
                console.log("works");
                console.log($scope.userDto);
                // save後 執行getAllUsers
                UserService.getAllUsers().then(function(value) {
                    $scope.allUsers = value.data;
                }, function(reason) {
                    console.log("error occured");
                }, function(value) {
                    console.log("no callback");
                });
                
                // userDto & skill input clear
                $scope.skills = [];
                $scope.userDto = {
                    userId: $scope.userDto.userId,
                    userName: $scope.userDto.userName
                    // skillDtos: []
                };
                
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        }
    }
]);