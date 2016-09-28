var exec = require("cordova/exec");

var FacebookNativeSDK = {

  activateApp: function (s, f) {
    console.log("Javascript method called");
    exec(s, f, "FacebookNativeSDK", "activateApp", []);
  }

}

window.FacebookNativeSDK = FacebookNativeSDK;

module.exports = FacebookNativeSDK;
