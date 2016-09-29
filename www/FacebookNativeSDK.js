var exec = require("cordova/exec");

var FacebookNativeSDK = {

  activateApp: function (s, f) {
    exec(s, f, "FacebookNativeSDK", "activateApp", []);
  }

}

window.FacebookNativeSDK = FacebookNativeSDK;

module.exports = FacebookNativeSDK;
