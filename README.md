# cordova-plugin-facebook-native
Integrates native facebook SDK with cordova projects

## Roadmap

- Compatibility with Android
- Track app launch
- Export native Facebook API through a Javascript interface

## Facebook SDK

This plugin is currently including the following Facebook native SDK :

> version : 4.15.1

- Bolts.framework
- FBSDKCoreKit.framework
- FBSDKLoginKit.framework
- FBSDKShareKit.framework

## Installation

### MeteorJS

Add the following content to your `.meteor/cordova-plugins` file to include this plugin :

```
cordova-plugin-facebook-native-sdk@https://github.com/yperteam/cordova-plugin-facebook-native.git#b309e1422c2da81858e59b0c583a20e19f45a773
```

The commit number after the `#` character must be changed to the last commit pushed on `master` branch

In your `mobile-config.js` file, include the following :

```
App.configurePlugin('cordova-plugin-facebook-native-sdk', {
    FACEBOOK_APP_ID: 'YOUR_FACEBOOK_APP_ID',
    FACEBOOK_APP_NAME: 'YOUR_FACEBOOK_APP_NAME'
});

```

Facebook configuration for this application ID will be automatically included in your `Info.plist`

### Classic cordova plugin

- More info soon
