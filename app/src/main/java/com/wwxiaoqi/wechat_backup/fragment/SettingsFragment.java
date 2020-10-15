package com.wwxiaoqi.wechat_backup.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.wwxiaoqi.wechat_backup.R;

public class SettingsFragment extends PreferenceFragment {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences_home);
  }
}