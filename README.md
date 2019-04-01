<div align="center">
  <p>
    
  </p>
  <p>
    ✨ This code based on ELTCOIN wallet source ✨
  </p>
  <p>
    <a href="https://eltwallet.eltcoin.tech">
  </a>
  </p>
</div>

# Features
This code is only tested on iOS

and

use Yarn package manager tool


# Install process  On iOS

## Install dependencies
$ yarn install

## run native function linking
$ react-native link

## launch iOS simulator
$ react-native run-ios


# Install process  On Windows

## downgrade 'base-x@3.0.4'     3.0.5 has trouble on Android?
modify yarn.lock on base-x module as 3.0.4

## Install dependencies
$ yarn install

## run native function linking
$ react-native link

## run rn-nodeify manually
$ ./node_modules/.bin/rn-nodeify --hack --install "assert, crypto, stream, events, vm"


## launch Android simulator
$ react-native run-android

# Demo

<div align="center">
  <img src="" height="300" />
</div>

# Local development



