var exec = require("cordova/exec");

var FacebookNativeSDK = {

  activateApp: function (s, f) {
    console.log("CALLED !!!");
    console.log(s);
    console.log(f);
    exec(s, f, "FacebookNativeSDK", "activateApp", []);
  }

}

window.FacebookNativeSDK = FacebookNativeSDK;

module.exports = FacebookNativeSDK;