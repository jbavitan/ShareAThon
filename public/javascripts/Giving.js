var app = angular.module('myApp', []);

app.controller('givingController',function($scope, $http){
    
    $scope.experties = ['law', 'sport', 'music' ,'programmer'];
    $scope.infoToSend;
    $scope.showMatch;
    $scope.showNotMatch;
    
    $scope.chooseExp = function(experty){
        $http.get("/getSubCatagories/" + experty).success(function(catagoryList){
            $scope.catagoryList = catagoryList;
        });
    }   
    
    $scope.chooseSub = function(subCatagory){
        $scope.chosenSub = subCatagory;
    }
    
    $scope.confirm = function(){
        $http.post("/sendInfo", $scope.infoToSend).success(function(confirmation){
           $scope.showMatch = confirmation;
           $scope.showNotMatch = !confirmation;
        }).error(function(){
            alert("Error with the server");
        })
    }
    
    $scope.DisConfirm = function(){
        alert("You have declined the confirmation... To confirm press yes");
    }
})