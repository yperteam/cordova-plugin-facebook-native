package org.apache.cordova.plugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;

public class FacebookNativeSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        System.out.println("Exec");
        if("activateApp".equals(action)){
            activateApp(callbackContext);
            callbackContext.success();
            return true;
        } else {
            callbackContext.error("FacebookNativeSDK."+action+" not found !");
            return false;
        }
    }

  private void activateApp(CallbackContext callbackContext) {
    System.out.println("Print");
    callbackContext.success();
  }
}