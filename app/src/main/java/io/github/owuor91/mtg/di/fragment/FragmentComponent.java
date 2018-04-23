package io.github.owuor91.mtg.di.fragment;

import dagger.Subcomponent;
import io.github.owuor91.mtg.ui.fragments.SetsFragment;

/**
 * Created by johnowuor on 23/04/2018.
 */

@Subcomponent(modules = FragmentModule.class) public interface FragmentComponent {

  void inject(SetsFragment setsFragment);

  @Subcomponent.Builder interface Builder {
    Builder fragmentModule(FragmentModule fragmentModule);

    FragmentComponent build();
  }
}