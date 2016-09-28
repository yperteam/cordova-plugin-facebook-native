//
//  FacebookConnectPlugin.h
//  GapFacebookConnect
//
//  Created by aknock for YPER on 2016-09-28
//  Copyright 2016 YPER. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Cordova/CDV.h>
#import <FBSDKCoreKit/FBSDKCoreKit.h>

@interface FacebookNativeSDK : CDVPlugin

- (void)activateApp:(CDVInvokedUrlCommand*)command;

@end
