package ca.utoronto.utm.mcs;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<Integer> portProvider;

  public App_MembersInjector(Provider<Integer> portProvider) {
    this.portProvider = portProvider;
  }

  public static MembersInjector<App> create(Provider<Integer> portProvider) {
    return new App_MembersInjector(portProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectPort(instance, portProvider.get());
  }

  public static void injectPort(App instance, int port) {
    instance.port = port;
  }
}
