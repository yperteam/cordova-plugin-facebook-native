//var exec = require("cordova/exec");

function FacebookNativeSDK(){}

FacebookNativeSDK.activateApp = function(content){
  console.log("CALLED !!!");
  /*var onSuccess = function(){};
  var onFail = function(){};
  cordova.exec(onSuccess, onFail, 'AlertPlugin', 'alert', [content]);*/
 
};
/*var FacebookNativeSDK = {

  activateApp: function (s, f) {
    console.log("CALLED !!!");
    exec(s, f, "FacebookNativeSDK", "activateApp", []);
  }

}*/

//window.FacebookNativeSDK = FacebookNativeSDK;
module.exports = FacebookNativeSDK;
