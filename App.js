/**
 * KingWallet React Native App
 * https://github.com/ganadara135/KingWallet
 *
 * @format
 * @flow
 */


import React, {Component} from 'react';

import {StatusBar, Platform, StyleSheet, Text, View} from 'react-native';

import { Provider } from 'react-redux';
import { PersistGate } from 'redux-persist/integration/react';
import './shim';
import Navigator from './src/navigators';
import { persistor, store } from './src/config/store';
import AnalyticsUtils from './src/utils/analytics';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' + 
       'Cmd+D or shake for dev menu',
  android:
    'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});


const getCurrentRouteName = navigationState => {
  if (!navigationState) {
    return null;
  }

  const route = navigationState.routes[navigationState.index];

  if (route.routes) {
    return getCurrentRouteName(route);
  }

  return route.routeName;
};

// type Props = {};
// export default class App extends Component<Props> {
  export default class App extends Component {
  render() {
    return (
    <Provider store={store}>
    <PersistGate persistor={persistor}>
      <View style={styles.container}>
        <Text style={styles.welcome}>Welcome to React Native!</Text>
        <Text style={styles.instructions}>To get started, edit App.js</Text>
        <Text style={styles.instructions}>{instructions}</Text>
        <StatusBar barStyle="light-content" />
      </View>
    </PersistGate>
    </Provider>
    );
  }
}