package com.htoyama.robolectricconfigshare;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.lang.reflect.Method;

import htoyama.com.robolectricconfigshare.BuildConfig;

public class RobolectricCustomRunner extends RobolectricGradleTestRunner {
  private static final int[] SDK = new int[]{21};

  public RobolectricCustomRunner(Class<?> klass) throws InitializationError {
    super(klass);
  }

  @Override public Config getConfig(Method method) {
    Config c = super.getConfig(method);

    return new Config.Implementation(
        pickSdkLevel(c.sdk()),
        c.manifest(),
        c.qualifiers(),
        c.packageName(),
        c.resourceDir(),
        c.assetDir(),
        c.shadows(),
        c.application(),
        c.libraries(),
        pickConstants(c.constants())
    );
  }

  private static int[] pickSdkLevel(int[] sdkArray) {
    return sdkArray.length == 0 ? SDK : sdkArray; }

  private static Class<?> pickConstants(Class<?> constants) {
    return constants == Void.class ? BuildConfig.class : constants;
  }

}
