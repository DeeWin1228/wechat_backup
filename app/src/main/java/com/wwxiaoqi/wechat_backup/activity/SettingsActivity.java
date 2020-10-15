package com.wwxiaoqi.wechat_backup.activity;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.wwxiaoqi.wechat_backup.R;
import com.wwxiaoqi.wechat_backup.fragment.SettingsFragment;

public class SettingsActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    if (savedInstanceState == null) {
      SettingsFragment mSettingsFragment = new SettingsFragment();
      replaceFragment(R.id.settings_container, mSettingsFragment);
    }
  }

  @TargetApi(Build.VERSION_CODES.HONEYCOMB)
  public void replaceFragment(int viewId, android.app.Fragment fragment) {
    FragmentManager fragmentManager = getFragmentManager();
    fragmentManager.beginTransaction().replace(viewId, fragment).commit();
  }

}
