package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog;

public class FacebookNativeSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        return true;
        /*if("activateApp".equals(action)){
            //callbackContext.success();
            return true;
        }
        return false;*/
    }

    private void activateApp(CallbackContext callbackContext) {
      System.out.println("Print");
      callbackContext.success();
    }
}
