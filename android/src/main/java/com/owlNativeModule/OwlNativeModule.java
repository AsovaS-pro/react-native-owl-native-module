package com.owlNativeModule;

import com.facebook.react.bridge.Callback;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

public class OwlNativeModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  OwlNativeModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }

  @Override
  public String getName() {
    return "OwlNativeModule";
  }

  @ReactMethod
  public void sqrNumber(int number, Callback cb) {
       try{
           cb.invoke(null, (number * number));
       }catch (Exception e){
           cb.invoke(e.toString(), null);
       }
   }
}
