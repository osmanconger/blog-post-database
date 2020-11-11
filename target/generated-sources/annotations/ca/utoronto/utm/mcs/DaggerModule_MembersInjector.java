package ca.utoronto.utm.mcs;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerModule_MembersInjector implements MembersInjector<DaggerModule> {
  private final Provider<Integer> pORTProvider;

  public DaggerModule_MembersInjector(Provider<Integer> pORTProvider) {
    this.pORTProvider = pORTProvider;
  }

  public static MembersInjector<DaggerModule> create(Provider<Integer> pORTProvider) {
    return new DaggerModule_MembersInjector(pORTProvider);
  }

  @Override
  public void injectMembers(DaggerModule instance) {
    injectPORT(instance, pORTProvider.get());
  }

  public static void injectPORT(DaggerModule instance, int PORT) {
    instance.PORT = PORT;
  }
}
