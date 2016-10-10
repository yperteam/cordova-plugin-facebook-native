var exec = require("cordova/exec");

var FacebookNativeSDK = {

  activateApp: function (s, f) {
    console.log("CALLED !!!");
    exec(s, f, "FacebookNativeSDK", "activateApp", []);
  }

}

window.FacebookNativeSDK = FacebookNativeSDK;

module.exports = FacebookNativeSDK;