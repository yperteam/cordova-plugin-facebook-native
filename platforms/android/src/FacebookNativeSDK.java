package org.apache.cordova.facebook;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.facebook.AppEventsLogger;

public class FacebookNativeSDK extends CordovaPlugin {

  @Override
  public void onResume(boolean multitasking) {
      super.onResume(multitasking);
      uiHelper.onResume();
      // Developers can observe how frequently users activate their app by logging an app activation event.
      AppEventsLogger.activateApp(cordova.getActivity());
  }

}
