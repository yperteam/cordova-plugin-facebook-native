//
//  FacebookConnectPlugin.h
//  GapFacebookConnect
//
//  Created by aknock for YPER on 2016-09-28
//  Copyright 2016 YPER. All rights reserved.
//


#import "FacebookNativeSDK.h"

@interface FacebookNativeSDK ()

@end

@implementation FacebookNativeSDK

- (void)activateApp: (CDVInvokedUrlCommand*)command {
    CDVPluginResult* pluginResult = nil;

    [FBSDKAppEvents activateApp];

    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
