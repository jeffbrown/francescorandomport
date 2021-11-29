package francescorandomport;

import io.micronaut.context.DefaultApplicationContextBuilder;

public class EagerInitSingletonsApplicationContextBuilder extends DefaultApplicationContextBuilder {

    public EagerInitSingletonsApplicationContextBuilder() {
        // commenting this out will make the test failure go away
        eagerInitSingletons(true);
    }

}
