package com.kingwallet;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.tradle.react.UdpSocketsModule;
import com.peel.react.TcpSocketsModule;
import com.horcrux.svg.SvgPackage;
import br.com.classapp.RNSensitiveInfo.RNSensitiveInfoPackage;
import com.peel.react.rnos.RNOSModule;
import com.BV.LinearGradient.LinearGradientPackage;
import com.hieuvp.fingerprint.ReactNativeFingerprintScannerPackage;
import com.aakashns.reactnativedialogs.ReactNativeDialogsPackage;
import com.lugg.ReactNativeConfig.ReactNativeConfigPackage;
import org.reactnative.camera.RNCameraPackage;
import com.bitgo.randombytes.RandomBytesPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new UdpSocketsModule(),
            new TcpSocketsModule(),
            new SvgPackage(),
            new RNSensitiveInfoPackage(),
            new RNOSModule(),
            new LinearGradientPackage(),
            new ReactNativeFingerprintScannerPackage(),
            new ReactNativeDialogsPackage(),
            new ReactNativeConfigPackage(),
            new RNCameraPackage(),
            new RandomBytesPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
