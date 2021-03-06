package io.github.owuor91.mtg.di.activity;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import dagger.Module;
import dagger.Provides;
import io.github.owuor91.domain.di.DIConstants;
import io.github.owuor91.mtg.di.adapter.AdapterComponent;
import io.github.owuor91.mtg.ui.activities.BaseActivity;
import io.github.owuor91.presentation.di.PresenterModule;
import javax.inject.Named;

/**
 * Created by johnowuor on 23/04/2018.
 */

@Module(includes = PresenterModule.class, subcomponents = { AdapterComponent.class }) public class ActivityModule {
  private final BaseActivity baseActivity;

  public ActivityModule(BaseActivity baseActivity) {
    this.baseActivity = baseActivity;
  }

  @Provides @Named(DIConstants.ACTIVITY) public Context provideActivityContext() {
    return baseActivity;
  }

  @Provides public LayoutInflater provideLayoutInflater(@Named(DIConstants.ACTIVITY) Context context) {
    return LayoutInflater.from(context);
  }

  @Provides public FragmentManager provideFragmentManager(BaseActivity activity) {
    return activity.getSupportFragmentManager();
  }
}
