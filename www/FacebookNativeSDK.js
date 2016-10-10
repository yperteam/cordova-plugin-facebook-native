//var exec = require("cordova/exec");

function FacebookNativeSDK(){}

FacebookNativeSDK.activateApp = function(s, f){
  console.log("CALLED !!!");
  var onFail = function(){};
  cordova.exec(s, f, "FacebookNativeSDK", "activateApp", []);
};
/*var FacebookNativeSDK = {

  activateApp: function (s, f) {
    console.log("CALLED !!!");
    exec(s, f, "FacebookNativeSDK", "activateApp", []);
  }

}*/

//window.FacebookNativeSDK = FacebookNativeSDK;
module.exports = FacebookNativeSDK;
