package ca.utoronto.utm.mcs;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {DaggerModule.class, PostModule.class})
public interface PostComponent {

    public Post buildPost();
}
