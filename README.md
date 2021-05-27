# Cryptic Android Wallet

![Download Count](https://img.shields.io/github/downloads/cryptic-network/cryptic-mobile-wallet/total.svg)
![Open Issue Count](https://img.shields.io/github/issues/cryptic-network/cryptic-mobile-wallet)
![License](https://img.shields.io/github/license/cryptic-network/cryptic-mobile-wallet)
![Version](https://img.shields.io/github/v/release/cryptic-network/cryptic-mobile-wallet)

### Initial Setup

* `git clone https://github.com/cryptic-network/cryptic-mobile-wallet`
* `cd cryptic-mobile-wallet`
* `yarn install`

### Running

* `node --max-old-space-size=8192 node_modules/react-native/local-cli/cli.js start` (Just need to run this once to start the server, leave it running)
* `react-native run-android`

### Logging

`react-native log-android`

### Creating a release

You need to bump the version number in:

* `src/Config.js` - `appVersion`
* `android/app/build.gradle` - `versionCode` and `versionName`
* `package.json` - `version` - Not strictly required
* Update user agent in `android/app/src/main/java/com/crypticwallet/MainApplication.java` and `android/app/src/main/java/com/crypticwallet/TurtleCoinModule.java`

Then
`cd android`
`./gradlew bundleRelease`
Optionally
`./gradlew installRelease`

or `yarn deploy-android`
