package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
      callbackContext.success(true);
    }
}
