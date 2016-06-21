package com.seveneow.preferencefragmentexample;

import android.preference.PreferenceActivity;

import java.util.List;

public class ExamplePreferenceActivity extends PreferenceActivity {

  @Override
  public void onBuildHeaders(List<Header> target) {
    loadHeadersFromResource(R.xml.setting_header, target);
  }


  //this must be implemented because of the security issue "Fragment Injection"
  @Override
  protected boolean isValidFragment(String fragmentName) {
    if (NotificationPreferenceFragment.class.getName().equals(fragmentName)) {
      return true;

    }else if(OtherPreferenceFragment.class.getName().equals(fragmentName)){
      return true;

    }else {
      return false;
    }
  }
}
