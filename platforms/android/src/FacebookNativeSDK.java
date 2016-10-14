package com.yper.plugins.facebooknativesdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class FacebookNativeSDK extends CordovaPlugin {

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
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
    //FacebookSdk.sdkInitialize(getApplicationContext());
    //AppEventsLogger.activateApp(this);
    callbackContext.success();
  }
}