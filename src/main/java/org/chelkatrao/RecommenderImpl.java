package org.chelkatrao;

@Singleton
@Deprecated
public class RecommenderImpl implements Recommender {

    @InjectProperty(value = "wisky")
    private String alcohol;

    public RecommenderImpl() {
        System.out.println("RecommenderImpl was created ");
    }

    @Override
    public void recommend() {
        System.out.println("drink protect from covid-2019, drink " + alcohol);
    }
}
