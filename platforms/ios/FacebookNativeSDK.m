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

- (void)activateApp: {
    NSLog(@"activateApp called");
    [FBSDKAppEvents activateApp];
}

@end
