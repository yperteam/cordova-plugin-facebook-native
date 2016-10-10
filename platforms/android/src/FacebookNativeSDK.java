package org.apache.cordova.plugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog;

public class FacebookNativeSDK extends CordovaPlugin {

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    return true;
    /*if("alert".equals(action)){
      final String content = args.getString(0);
      showAlert(content);
      callbackContext.success();
      return true;
    } else {
      callbackContext.error("AlertPlugin."+action+" not found !");
      return false;
    }*/
  }

  private void showAlert(String content){
    // see http://developer.android.com/guide/topics/ui/dialogs.html
    /*AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.cordova.getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
    alertDialog.setTitle("Alert");
    alertDialog.setMessage(content);
    alertDialog.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(){
      public void onClick(DialogInterface dialog, int id){
        // User clicked OK button
      }
    });
    alertDialog.show();*/
  }
}