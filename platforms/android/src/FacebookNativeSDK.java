package org.apache.cordova.plugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

public class FacebookNativeSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("activateApp")) {
            this.activateApp(callbackContext);
            return true;
        }
        return false;
    }

  private void activateApp(CallbackContext callbackContext) {
    System.out.println("Print");
    callbackContext.success();
  }
}