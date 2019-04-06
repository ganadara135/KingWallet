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
This code is tested on iOS and Android with Mac and Windows

and

use Yarn package manager tool


# Install process  On iOS

## Install dependencies
$ yarn install

## run native function linking
$ react-native link

## launch iOS simulator
$ react-native run-ios



# Install process  On Windows and MacOS  with  Android


## downgrade 'base-x@3.0.4'     3.0.5 has trouble on Android
modify yarn.lock on base-x module as 3.0.4 <br/>
$ yarn list | cat > file_name <br/>
after this, check where to use base-x@3.0.5 <br/>
ex) bs58@^4.0.0  like bottom <br/>
{
  bs58@^4.0.0:
  version "4.0.1"
  resolved "https://registry.yarnpkg.com/bs58/-/bs58-4.0.1.tgz#be161e76c354f6f788ae4071f63f34e8c4f0a42a"
  integrity sha1-vhYedsNU9veIrkBx9j806MTwpCo=
  dependencies:
    base-x "^3.0.2"   ==>  "3.0.2"

}

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



