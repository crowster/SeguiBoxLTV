/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/seguriboxapi/algorithms/symetric"
    }).then(function(data) {
       $('.greeting-id').append(data.hashId);
       $('.greeting-content').append(data.algorithmName);
    });
});